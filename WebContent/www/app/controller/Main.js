Ext.define('TrackCar.controller.Main', {
	extend : 'Ext.app.Controller',
	
	config: {
		refs: {
		},
		control : {
			'button[ui=confirm]' : {
				tap: 'searchCar'
			}
		}
	},
	searchCar : function (btn){
		var form = btn.up('formpanel');
		var carNo = form.down('textfield[name=slotInfo.carlicense]').getValue();
		if (Ext.isEmpty(carNo)){
			return;
		}
		
		var index = document.URL.indexOf('?');
		if (index < 0){
			Ext.Msg.alert('二维码不合法:' + document.URL);
			return;
		}
		var tab = form.up('tabpanel');
		Ext.Ajax.request({
		    url: 'obtainSlotInfo.cmd',
		    method: 'POST',
		    params: {
		    	'mlp.carlicense': carNo,
		    	'mpq.queryplace': document.URL.substring(index + 1)
		    },
		    success: function(response) {
		    	var ret = Ext.JSON.decode(response.responseText, true);
		    	if (Ext.isEmpty(ret.slotInfoMap)){
		    		Ext.Msg.alert('没有数据');
		    		return;
		    	}
		    	tab.setActiveItem(1);
		    	var imgs = tab.getActiveItem().query('img');
		    	imgs[0].setSrc(ret.slotInfoMap.CarPicPath);
				imgs[1].setSrc(ret.slotInfoMap.RoadPicPath);
		    },

		    failure: function(response) {
		    	Ext.Msg.alert('查找出错');
		    }
		});
	}
});