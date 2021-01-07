package fr.prof.template.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {

	@EventHandler
	public void onJoinEvent(PlayerJoinEvent e) {
		e.getPlayer().sendMessage("SALUT C LA TEMPLATE");
	}
	
}
