Ext.define('TrackCar.view.main.Main', {
	extend : 'Ext.container.Viewport',
	xtype : 'main-page',
	layout : {
		type: 'vbox',
		align: 'stretch'
	},
	viewModel: {
        type: 'main'
    },
	controller: 'main',
	items: [{
		xtype: 'head'
	},{
    	xtype: 'maincontainerwrap',
        id: 'main-view-detail-wrap',
        reference: 'mainContainerWrap',
        flex: 1,
        items: [{
        	xtype : 'treelist',
    		width: 250,
    		ui : 'nav',
    		reference: 'navigationTreeList',
            itemId: 'navigationTreeList',
    		expanderFirst: false,
            expanderOnly: false,
    		bind : '{navItems2}',
    		listeners: {
                selectionchange: 'onNavigationTreeSelectionChange'
            }
        },{
        	xtype: 'container',
            flex: 1,
            reference: 'mainCardPanel',
            cls: 'sencha-dash-right-main-container',
            itemId: 'contentPanel',
            layout: {
                type: 'card',
                anchor: '100%'
            }
        }]
	}]
});
