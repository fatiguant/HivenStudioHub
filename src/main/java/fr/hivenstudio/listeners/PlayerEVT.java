package fr.hivenstudio.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerEVT implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.setJoinMessage(null);
    }
    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        e.setQuitMessage(null);
    }
}
