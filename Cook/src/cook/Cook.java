package cook;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Cook extends JavaPlugin implements Listener {

	public final Logger logger = Logger.getLogger("Minecraft");
	public static Cook plugin;

	public Cook() {
	}

	public void onEnable() {
		PluginDescriptionFile pdf = getDescription();
		logger.info((new StringBuilder(String.valueOf(pdf.getName())))
				.append(" v").append(pdf.getVersion())
				.append(" has been enabled!").toString());

	}

	public void onDisable() {
		PluginDescriptionFile pdf = getDescription();
		logger.info((new StringBuilder(String.valueOf(pdf.getName())))
				.append(" v").append(pdf.getVersion())
				.append(" has been disabled!").toString());
	}

	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String args[]) {
		if (commandLabel.equalsIgnoreCase("cook")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage((new StringBuilder())
						.append(ChatColor.DARK_RED)
						.append("Only in-game players can use this command!")
						.toString());
			} else {
				Player player = (Player) sender;
				PlayerInventory pi = player.getInventory();
				if (player.isOp() || player.hasPermission("cook.command")) {
					@SuppressWarnings("deprecation")
					int BlockId = player.getItemInHand().getType().getId();
					int amount = player.getItemInHand().getAmount();
					ItemStack inHand = player.getInventory().getItemInHand();
					if ((BlockId == 73) | (BlockId == 74)) {
						ItemStack Redstone = new ItemStack(Material.REDSTONE,
								amount);
						pi.removeItem(new ItemStack[] { inHand });
						pi.addItem(new ItemStack[] { Redstone });
						player.sendMessage((new StringBuilder())
								.append(ChatColor.GOLD)
								.append("[Cook] Cooked!").toString());
					} else if (BlockId == 14) {
						ItemStack Gold = new ItemStack(Material.GOLD_INGOT,
								amount);
						pi.removeItem(new ItemStack[] { inHand });
						pi.addItem(new ItemStack[] { Gold });
						player.sendMessage((new StringBuilder())
								.append(ChatColor.GOLD)
								.append("[Cook] Cooked!").toString());
					} else if (BlockId == 15) {
						ItemStack Iron = new ItemStack(Material.IRON_INGOT,
								amount);
						pi.removeItem(new ItemStack[] { inHand });
						pi.addItem(new ItemStack[] { Iron });
						player.sendMessage((new StringBuilder())
								.append(ChatColor.GOLD)
								.append("[Cook] Cooked!").toString());
					} else if (BlockId == 16) {
						ItemStack Coal = new ItemStack(Material.COAL, amount);
						pi.removeItem(new ItemStack[] { inHand });
						pi.addItem(new ItemStack[] { Coal });
					} else if (BlockId == 4) {
						ItemStack Stone = new ItemStack(Material.STONE, amount);
						pi.removeItem(new ItemStack[] { inHand });
						pi.addItem(new ItemStack[] { Stone });
						player.sendMessage((new StringBuilder())
								.append(ChatColor.GOLD)
								.append("[Cook] Cooked!").toString());
					} else if (BlockId == 56) {
						ItemStack Diamond = new ItemStack(Material.DIAMOND,
								amount);
						pi.removeItem(new ItemStack[] { inHand });
						pi.addItem(new ItemStack[] { Diamond });
						player.sendMessage((new StringBuilder())
								.append(ChatColor.GOLD)
								.append("[Cook] Cooked!").toString());
					} else if (BlockId == 12) {
						ItemStack Glass = new ItemStack(Material.GLASS, amount);
						pi.removeItem(new ItemStack[] { inHand });
						pi.addItem(new ItemStack[] { Glass });
						player.sendMessage((new StringBuilder())
								.append(ChatColor.GOLD)
								.append("[Cook] Cooked!").toString());
					} else if (BlockId == 319) {
						ItemStack Porkchop = new ItemStack(
								Material.GRILLED_PORK, amount);
						pi.removeItem(new ItemStack[] { inHand });
						pi.addItem(new ItemStack[] { Porkchop });
						player.sendMessage((new StringBuilder())
								.append(ChatColor.GOLD)
								.append("[Cook] Cooked!").toString());
					} else if (BlockId == 349) {
						ItemStack Fish = new ItemStack(Material.COOKED_FISH,
								amount);
						pi.removeItem(new ItemStack[] { inHand });
						pi.addItem(new ItemStack[] { Fish });
						player.sendMessage((new StringBuilder())
								.append(ChatColor.GOLD)
								.append("[Cook] Cooked!").toString());
					} else if (BlockId == 363) {
						ItemStack Steak = new ItemStack(Material.COOKED_BEEF,
								amount);
						pi.removeItem(new ItemStack[] { inHand });
						pi.addItem(new ItemStack[] { Steak });
						player.sendMessage((new StringBuilder())
								.append(ChatColor.GOLD)
								.append("[Cook] Cooked!").toString());
					} else if (BlockId == 129) {
						ItemStack Emerald = new ItemStack(Material.EMERALD,
								amount);
						pi.removeItem(new ItemStack[] { inHand });
						pi.addItem(new ItemStack[] { Emerald });
						player.sendMessage((new StringBuilder())
								.append(ChatColor.GOLD)
								.append("[Cook] Cooked!").toString());
					} else if (BlockId == 365) {
						ItemStack Chicken = new ItemStack(
								Material.COOKED_CHICKEN, amount);
						pi.removeItem(new ItemStack[] { inHand });
						pi.addItem(new ItemStack[] { Chicken });
						player.sendMessage((new StringBuilder())
								.append(ChatColor.GOLD)
								.append("[Cook] Cooked!").toString());
					} else if (BlockId == 392) {
						ItemStack Potato = new ItemStack(Material.BAKED_POTATO,
								amount);
						pi.removeItem(new ItemStack[] { inHand });
						pi.addItem(new ItemStack[] { Potato });
						player.sendMessage((new StringBuilder())
								.append(ChatColor.GOLD)
								.append("[Cook] Cooked!").toString());
					} else if (BlockId == 337) {
						ItemStack Clay = new ItemStack(Material.BRICK, amount);
						pi.removeItem(new ItemStack[] { inHand });
						pi.addItem(new ItemStack[] { Clay });
						player.sendMessage((new StringBuilder())
								.append(ChatColor.GOLD)
								.append("[Cook] Cooked!").toString());
					} else if (BlockId == 17) {
						ItemStack Coal = new ItemStack(Material.COAL);
						pi.removeItem(new ItemStack[] { inHand });
						pi.addItem(new ItemStack[] { Coal });
						player.sendMessage((new StringBuilder())
								.append(ChatColor.GOLD)
								.append("[Cook] Cooked!").toString());
					} else if (BlockId == 4) {
						ItemStack Stone = new ItemStack(Material.STONE);
						pi.removeItem(new ItemStack[] { inHand });
						pi.addItem(new ItemStack[] { Stone });
						player.sendMessage((new StringBuilder())
								.append(ChatColor.GOLD)
								.append("[Cook] Cooked!").toString());
					} else {
						player.sendMessage((new StringBuilder())
								.append(ChatColor.RED)
								.append("[Cook] I'm sorry! I can't cook that!")
								.toString());
					}
				} else {
					player.sendMessage((new StringBuilder())
							.append(ChatColor.RED)
							.append("You do not have permission for this command!")
							.toString());
				}
			}
		}
		return false;
	}
}
