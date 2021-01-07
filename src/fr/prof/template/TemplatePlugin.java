package fr.prof.template;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import fr.prof.template.commands.TemplateCommand;
import fr.prof.template.listeners.PlayerListener;

public class TemplatePlugin extends JavaPlugin {

	public void onEnable() {
		getLogger().info("Template ON");
		registerCommands();
		registerEvents();
	}

	public void onDisable() {
		getLogger().info("Template OFF");
	}

	public void registerCommands() {
		getCommand("template").setExecutor(new TemplateCommand());
	}

	public void registerEvents() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new PlayerListener(), this);
	}

}
