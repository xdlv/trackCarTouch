Ext.define('TrackCar.model.User', {
	extend : 'TrackCar.model.Base',

	fields : [ 'name', 'pwd', 'mail' ],

	manyToMany : 'Mod'
});