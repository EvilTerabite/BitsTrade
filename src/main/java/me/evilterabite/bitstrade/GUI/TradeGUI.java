package me.evilterabite.bitstrade.GUI;

import dev.triumphteam.gui.components.util.GuiFiller;
import dev.triumphteam.gui.guis.Gui;
import dev.triumphteam.gui.guis.GuiItem;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class TradeGUI {

    public TradeGUI(Player player) {
        Gui gui = Gui.gui()
                .title(Component.text("Trade Menu", NamedTextColor.YELLOW))
                .rows(6)
                .create();
        HashMap<GuiItem, Integer> items = createItems();
        for(GuiItem item : items.keySet()) {
            int slot = items.get(item);
            gui.setItem(slot, item);
        }
        GuiFiller filler = new GuiFiller(gui);
        filler.fill(new GuiItem(new ItemStack(Material.BLUE_STAINED_GLASS_PANE)));
        gui.open(player);
    }

    private HashMap<GuiItem, Integer> createItems() {
        HashMap<GuiItem, Integer> items = new HashMap<>();

        return items;
    }
}
