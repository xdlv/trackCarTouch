
Ext.define("TrackCar.view.test.Test",{
    extend: "Ext.panel.Panel",

    requires: [
        "TrackCar.view.test.TestController",
        "TrackCar.view.test.TestModel"
    ],

    controller: "test-test",
    viewModel: {
        type: "test-test"
    },

    layout: 'border',
    items:[{
    	region: 'center',
    	xtype: 'treelist',
        reference: 'treelist',
        bind: '{navItems}',
        width : 500,
        height: 500,
        title : 'abc'
    }]
});
