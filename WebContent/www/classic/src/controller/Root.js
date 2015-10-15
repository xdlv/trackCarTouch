Ext.define('TrackCar.controller.Root', {
    extend: 'Ext.app.Controller',
    
    onLaunch : function(){
    	//create session for application scope
    	this.session = new Ext.data.Session({
            autoDestroy: false
        });
    	
    	this.login = Ext.create('TrackCar.view.login.Login',{
    		autoShow: true,
    		session : this.session,
    		listeners: {
                scope: this,
                login: 'onLogin'
            }
    	});
    },
    onLogin: function(view,user){
    	this.login.destroy();
    	var root = {
    			expanded : true,
    			children: []
    	};
    	var modIdMap = new Ext.util.HashMap();
    	
    	Ext.each(user.userMods, function(v,i){
    		modIdMap.add(v.get('id'),{
    			text : v.get('name'),
				iconCls : 'x-fa fa-home',
});
    	});
    	Ext.each(user.userMods, function(v,i){
    		var parentId = v.get('parentid');
    		var treeNode = modIdMap.get(v.get('id'));
    		var parent;
    		if (Ext.isEmpty(parentId) || parentId == -1){
    			root.children.push(treeNode);
    		} else {
    			parent = modIdMap.get(parentId);
    			parent.children = parent.children || [];
    			parent.children.push(treeNode);
    		}
    	});
    	
    	var root2 ={
    	    expanded: true,
    	    text: "My Root",
    	    children: [
    	        { text: "Child 1", leaf: true },
    	        { text: "Child 2", expanded: true, children: [
    	            { text: "GrandChild", leaf: true }
    	        ] }
    	    ]
    	};
    	var menuTreeStore = Ext.create('Ext.data.TreeStore',{
    		root: {
				expanded : true,
				children : [ {
					text : 'Home',
					iconCls : 'x-fa fa-home',
					children : [ {
						text : 'Messages',
						iconCls : 'x-fa fa-inbox',
						leaf : true
					}, {
						text : 'Archive',
						iconCls : 'x-fa fa-database',
						children : [ {
							text : 'First',
							iconCls : 'x-fa fa-sliders',
							leaf : true
						}, {
							text : 'No Icon',
							iconCls : null,
							leaf : true
						} ]
					}, {
						text : 'Music',
						iconCls : 'x-fa fa-music',
						leaf : true
					}, {
						text : 'Video',
						iconCls : 'x-fa fa-film',
						leaf : true
					} ]
				}, {
					text : 'Users',
					iconCls : 'x-fa fa-user',
					children : [ {
						text : 'Tagged',
						iconCls : 'x-fa fa-tag',
						leaf : true
					}, {
						text : 'Inactive',
						iconCls : 'x-fa fa-trash',
						leaf : true
					} ]
				}, {
					text : 'Groups',
					iconCls : 'x-fa fa-group',
					leaf : true
				}, {
					text : 'Settings',
					iconCls : 'x-fa fa-wrench',
					children : [ {
						text : 'Sharing',
						iconCls : 'x-fa fa-share-alt',
						leaf : true
					}, {
						text : 'Notifications',
						iconCls : 'x-fa fa-flag',
						leaf : true
					}, {
						text : 'Network',
						iconCls : 'x-fa fa-signal',
						leaf : true
					} ]
				} ]
			}
    	});
    	//menuTreeStore.setRoot(root);
    	
    	Ext.create('TrackCar.view.main.Main',{
    		session: this.session,
    		viewModel: {
    			currentUser : user,
    			menu : menuTreeStore
    		}
    	});
    }
});
