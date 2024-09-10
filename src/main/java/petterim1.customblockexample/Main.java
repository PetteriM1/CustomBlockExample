package petterim1.customblockexample;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.block.custom.CustomBlockManager;
import cn.nukkit.item.Item;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase {

    static Main INSTANCE;

    public Main() {
        INSTANCE = this;
    }

    @Override
    public void onEnable() {
        // Register the custom block definition
        // Note: Set "load: STARTUP" in plugin.yml
        CustomBlockManager.get().registerCustomBlock(MyCustomBlock.IDENTIFIER, MyCustomBlock.NUKKIT_ID, () -> new MyCustomBlock());
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        // Test command to give one custom block to player
        if (commandSender instanceof Player && command.getName().equals("test")) {
            Item item = Item.get(255 - MyCustomBlock.NUKKIT_ID, 0, 1);
            ((Player) commandSender).getInventory().addItem(item);
            commandSender.sendMessage("Gave custom block");
        }
        return true;
    }
}
