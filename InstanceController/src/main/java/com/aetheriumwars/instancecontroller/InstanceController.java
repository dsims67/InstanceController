package com.aetheriumwars.instancecontroller;

import com.aetheriumwars.instancecontroller.listeners.PostLoginListener;

import net.md_5.bungee.api.plugin.Plugin;

public class InstanceController extends Plugin {
	
	private Plugin pl;
	
    @Override
    public void onEnable() {
    	//create any databases used by aws
    	//load config
    	//do initialization stuff
    	this.pl = this;
    	
        getProxy().getPluginManager().registerListener(this, new PostLoginListener());
        getLogger().info("Registered Listeners");
    }
    
    public Plugin getPlugin() {
    	return pl;
    }

}
