Ext.define('TrackCar.view.Main', {
	extend : 'Ext.tab.Panel',
	xtype : 'main',
	requires : [ 'Ext.TitleBar' ],
	config : {
		tabBarPosition : 'bottom',
		items : [ {
			docked : 'top',
			height : 20,
			xtype : 'titlebar',
			title : '车位查找'
		}, {
			iconCls : 'home',
			xtype : 'formpanel',
			layout : 'vbox',
			items : [ {
				xtype : 'fieldset',
				title : '车辆信息',
				instructions : '(车牌支持模糊查找)',
				items : [ {
					xtype : 'textfield',
					label : '车牌号',
					name: 'slotInfo.carlicense'
				} ]
			}, {
				xtype : 'button',
				text : '查找',
				ui : 'confirm'
			} ]
		}, {
			iconCls : 'user',
			styleHtmlContent : true,
			xtype : 'container',
			layout : 'vbox',
			items: [{
				xtype: 'label',
				html: '停车图',
				flex: 1
			},{
				xtype: 'img',
				flex : 5
			},{
				xtype: 'label',
				html: '路线图',
				flex: 1
			},{
				xtype: 'img',
				flex : 5
			},]
		} ]
	}
});
