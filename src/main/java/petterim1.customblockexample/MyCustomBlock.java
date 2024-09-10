package petterim1.customblockexample;

import cn.nukkit.block.custom.CustomBlockManager;
import cn.nukkit.block.custom.container.CustomBlock;

// You can also extend other existing item behavior like ItemArmor, ItemEdible or ItemTool
// Just remember to implement CustomItem
public class MyCustomBlock extends CustomBlock {

    public static final String IDENTIFIER = "wiki:custom_block";

    // NOTE: Nukkit currently still saves blocks by their legacy ID so make sure there are no conflicting IDs between plugins!
    public static final int NUKKIT_ID = CustomBlockManager.LOWEST_CUSTOM_BLOCK_ID;

    public MyCustomBlock() {
        super("My Custom Block", NUKKIT_ID);
    }
}
