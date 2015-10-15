Ext.define('TrackCar.Application', {
    extend: 'Ext.app.Application',
    
    name: 'TrackCar',
    
    //controllers: ['TrackCar.controller.Root'],
    
    models:['User','Mod','Role'],

    stores: [
        // TODO: add global / shared stores here
    ],
    
    launch: function () {
        
    },

    onAppUpdate: function () {
        Ext.Msg.confirm('Application Update', 'This application has an update, reload?',
            function (choice) {
                if (choice === 'yes') {
                    window.location.reload();
                }
            }
        );
    }
});