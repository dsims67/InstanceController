package com.aetheriumwars.instancecontroller.listeners;

import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class PostLoginListener implements Listener {
	
    @EventHandler
    public void onPostLogin(PostLoginEvent event) {
    	//Connect the player to the appropriate instance (the type that they logged off of)
    	event.getPlayer().connect(null);
    	
    	//Announce that the player has joined to everyone on the network
        /*for (ProxiedPlayer player : ProxyServer.getInstance().getPlayers()) {
            player.sendMessage(new TextComponent(event.getPlayer().getName() + " has joined the network."));
        }*/
    }
}
