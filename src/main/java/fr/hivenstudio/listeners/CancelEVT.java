package fr.hivenstudio.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class  CancelEVT implements Listener {

    @EventHandler
    public void onHunger(FoodLevelChangeEvent e) {
        e.setCancelled(true);
    }
    @EventHandler
    public void onDMG(EntityDamageEvent e) {
        e.setCancelled(true);
    }
}
