package fr.prof.template.inventory;

import java.util.stream.IntStream;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import fr.prof.template.utils.FastInv;
import fr.prof.template.utils.ItemBuilder;

public class BuyInventory extends FastInv {

	public BuyInventory() {
		super(3 * 9, ChatColor.GOLD + "My inventory");

		ItemStack is = new ItemBuilder(Material.STAINED_GLASS_PANE, 1).setName(" ").toItemStack();
		IntStream.range(0, 27).forEach(value -> setItem(value, is));
		setItem(11, new ItemBuilder(Material.MAGMA_CREAM, 1).setName("NAME").setLore("LORE").toItemStack());
	}

	@Override
	public void onClick(InventoryClickEvent event) {

		Player p = (Player) event.getWhoClicked();

		switch (event.getCurrentItem().getType()) {

		case STAINED_GLASS_PANE:
			break;

		case MAGMA_CREAM:
			break;

		}
	}
}