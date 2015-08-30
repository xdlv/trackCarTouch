Ext.define('TrackCar.Util',{
	singleton: true,
	
	saveCookie: function(key, value){
		document.cookie = key + '=' + value;
	},
	
    getCookie: function(key){
    	var cookie = document.cookie;
		var tmp = cookie.split(';');
		for (v in tmp){
			v = tmp[v].split('=');
			if (v[0] == key){
				return v[1];
			}
		}
		return null;
    }
});