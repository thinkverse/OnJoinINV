package net.noodles.join.main.inv;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;


public class ClickEvents implements Listener {
	
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getInventory().getName().equals(InvNames.Main)) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;
            }
        }
        Player p = (Player)e.getWhoClicked();
        if (e.getCurrentItem() == null)
        	return;
      
    }
	
}
