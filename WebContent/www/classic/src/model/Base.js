Ext.define('TrackCar.model.Base', {
	extend : 'Ext.data.Model',

	fields : [ {
		name : 'id',
		type : 'int'
	} ],
	schema: {
        namespace: 'TrackCar.model',
        proxy: {
            url: 'obtain{entityName}.cmd',
            reader: {
            	type: 'json',
            	rootProperty : '{entityName:uncapitalize}s'
            }
        }
    }
});