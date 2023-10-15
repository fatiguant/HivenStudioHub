package fr.hivenstudio;

import fr.hivenstudio.listeners.CancelEVT;
import fr.hivenstudio.listeners.PlayerEVT;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public Main INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;
        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new PlayerEVT(), this);
        pm.registerEvents(new CancelEVT(), this);

    }

    public Main getInstance() {
        return INSTANCE;
    }

    public static String getPrefix() {
        return "§a §2»";
    }
}
