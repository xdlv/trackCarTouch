Ext.define('TrackCar.view.login.LoginController', {
	extend : 'Ext.app.ViewController',
	alias : 'controller.login-login',

	loginClick : function(button) {
		var form = button.up('form');
		Ext.Ajax.request({
			url : 'userLogin.cmd',
			method : 'POST',
			params : form.getValues(),
			scope: this,
			success : this.loginSuccess
		});
	},
	loginSuccess : function(response) {
		var session = this.getView().getSession();
		var users = Ext.data.schema.Schema.lookupEntity('User').getProxy(
				).getReader().read(response,{
					recordCreator: session.recordCreator
				});
		if (users.getRecords().length < 1){
			return;
		}
		var user = users.getRecords()[0];
		user.mods().load({
			scope: this,
			callback: function(records,operation, success){
				if (success){
					user.userMods = records;
					this.fireViewEvent('login',user);
				}
			}
		});
	}

});
