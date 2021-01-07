package fr.prof.template.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TemplateCommand implements CommandExecutor {

	@Override

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (!(sender instanceof Player)) {
			sender.sendMessage("Seul un joueur peut executer cette commande !");
			return false;
		}
		Player player = (Player) sender;

		if (label.equalsIgnoreCase("template")) { // /template
			if (player.hasPermission("template.permission")) {
				if (args.length == 0) {
					player.sendMessage("tu as fait /template");
				}
				if (args.length == 1) {
					if (args[0].equalsIgnoreCase("args")) {
						player.sendMessage("tu as fait /template args"); // /template args
					}
				}
			}
			return false;
		}
		return false;
	}
}