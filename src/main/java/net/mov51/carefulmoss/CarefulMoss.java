package net.mov51.carefulmoss;

import net.mov51.carefulmoss.events.BlockSpread;
import org.bukkit.plugin.java.JavaPlugin;

public final class CarefulMoss extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new BlockSpread(), this);
        this.getLogger().info("Moss can now be spread with care!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
