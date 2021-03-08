package org.core.world.position.block.grouptype.versions;

import org.core.world.position.block.blocktypes.CommonBlockTypes;
import org.core.world.position.block.blocktypes.post.BlockTypes1V13;

public interface BlockGroups1V13 {

    CoreBlockGroup AIR = new CoreBlockGroup("Air", BlockTypes1V13.AIR.get(), BlockTypes1V13.CAVE_AIR.get(), BlockTypes1V13.VOID_AIR.get());
    CoreBlockGroup TRAP_WOOD_DOOR = new CoreBlockGroup("Trap Wood Door",
            BlockTypes1V13.ACACIA_TRAPDOOR.get(),
            CommonBlockTypes.OAK_TRAPDOOR.get(),
            BlockTypes1V13.BIRCH_TRAPDOOR.get(),
            BlockTypes1V13.DARK_OAK_TRAPDOOR.get(),
            BlockTypes1V13.JUNGLE_TRAPDOOR.get(),
            BlockTypes1V13.SPRUCE_TRAPDOOR.get());
    CoreBlockGroup TRAP_DOOR = new CoreBlockGroup("Trap Door",
            BlockTypes1V13.IRON_TRAPDOOR.get(),
            BlockTypes1V13.ACACIA_TRAPDOOR.get(),
            BlockTypes1V13.OAK_TRAPDOOR.get(),
            BlockTypes1V13.BIRCH_TRAPDOOR.get(),
            BlockTypes1V13.DARK_OAK_TRAPDOOR.get(),
            BlockTypes1V13.JUNGLE_TRAPDOOR.get(),
            BlockTypes1V13.SPRUCE_TRAPDOOR.get());
    CoreBlockGroup STAIRS = new CoreBlockGroup("Stairs",
            CommonBlockTypes.ACACIA_STAIRS.get(),
            CommonBlockTypes.BIRCH_STAIRS.get(),
            CommonBlockTypes.DARK_OAK_STAIRS.get(),
            CommonBlockTypes.JUNGLE_STAIRS.get(),
            CommonBlockTypes.OAK_STAIRS.get(),
            CommonBlockTypes.SPRUCE_STAIRS.get(),
            BlockTypes1V13.COBBLESTONE_STAIRS.get(),
            CommonBlockTypes.BRICK_STAIRS.get(),
            BlockTypes1V13.DARK_PRISMARINE_STAIRS.get(),
            CommonBlockTypes.NETHER_BRICK_STAIRS.get(),
            BlockTypes1V13.PRISMARINE_BRICK_STAIRS.get(),
            BlockTypes1V13.PRISMARINE_STAIRS.get(),
            CommonBlockTypes.PURPUR_STAIRS.get(),
            CommonBlockTypes.QUARTZ_STAIRS.get(),
            CommonBlockTypes.RED_SANDSTONE_STAIRS.get(),
            CommonBlockTypes.SANDSTONE_STAIRS.get(),
            CommonBlockTypes.STONE_BRICK_STAIRS.get());
    CoreBlockGroup WOOD_SLAB = new CoreBlockGroup("Wood Slab",
            BlockTypes1V13.SPRUCE_SLAB.get(),
            BlockTypes1V13.OAK_SLAB.get(),
            BlockTypes1V13.JUNGLE_SLAB.get(),
            BlockTypes1V13.BIRCH_SLAB.get(),
            BlockTypes1V13.DARK_OAK_SLAB.get(),
            BlockTypes1V13.ACACIA_SLAB.get());
    CoreBlockGroup WOOD_PLANKS = new CoreBlockGroup("Wood Planks",
            BlockTypes1V13.SPRUCE_PLANKS.get(),
            BlockTypes1V13.OAK_PLANKS.get(),
            BlockTypes1V13.JUNGLE_PLANKS.get(),
            BlockTypes1V13.BIRCH_PLANKS.get(),
            BlockTypes1V13.DARK_OAK_PLANKS.get(),
            BlockTypes1V13.ACACIA_PLANKS.get());
    CoreBlockGroup WOOD_LOG = new CoreBlockGroup("Wood Log",
            BlockTypes1V13.SPRUCE_LOG.get(),
            BlockTypes1V13.OAK_LOG.get(),
            BlockTypes1V13.JUNGLE_LOG.get(),
            BlockTypes1V13.BIRCH_LOG.get(),
            BlockTypes1V13.DARK_OAK_LOG.get(),
            BlockTypes1V13.ACACIA_LOG.get());
    CoreBlockGroup STRIPPED_LOG = new CoreBlockGroup("Stripped Log",
            BlockTypes1V13.STRIPPED_SPRUCE_LOG.get(),
            BlockTypes1V13.STRIPPED_OAK_LOG.get(),
            BlockTypes1V13.STRIPPED_JUNGLE_LOG.get(),
            BlockTypes1V13.STRIPPED_BIRCH_LOG.get(),
            BlockTypes1V13.STRIPPED_DARK_OAK_LOG.get(),
            BlockTypes1V13.STRIPPED_ACACIA_LOG.get());
    CoreBlockGroup LOG = new CoreBlockGroup("Log", WOOD_LOG.getGrouped(), STRIPPED_LOG.getGrouped());
    CoreBlockGroup SLAB = new CoreBlockGroup("Slab",
            BlockTypes1V13.SPRUCE_SLAB.get(),
            BlockTypes1V13.OAK_SLAB.get(),
            BlockTypes1V13.JUNGLE_SLAB.get(),
            BlockTypes1V13.BIRCH_SLAB.get(),
            BlockTypes1V13.DARK_OAK_SLAB.get(),
            BlockTypes1V13.ACACIA_SLAB.get(),
            BlockTypes1V13.BRICK_SLAB.get(),
            BlockTypes1V13.COBBLESTONE_SLAB.get(),
            BlockTypes1V13.DARK_PRISMARINE_SLAB.get(),
            BlockTypes1V13.NETHER_BRICK_SLAB.get(),
            BlockTypes1V13.PETRIFIED_OAK_SLAB.get(),
            BlockTypes1V13.PRISMARINE_BRICK_SLAB.get(),
            BlockTypes1V13.PRISMARINE_SLAB.get(),
            CommonBlockTypes.PURPUR_SLAB.get(),
            BlockTypes1V13.QUARTZ_SLAB.get(),
            BlockTypes1V13.RED_SANDSTONE_SLAB.get(),
            BlockTypes1V13.SANDSTONE_SLAB.get(),
            BlockTypes1V13.STONE_BRICK_SLAB.get(),
            CommonBlockTypes.STONE_SLAB.get());
    CoreBlockGroup WOOD_BUTTON = new CoreBlockGroup("Wood Button",
            BlockTypes1V13.ACACIA_BUTTON.get(),
            BlockTypes1V13.BIRCH_BUTTON.get(),
            BlockTypes1V13.DARK_OAK_BUTTON.get(),
            BlockTypes1V13.JUNGLE_BUTTON.get(),
            BlockTypes1V13.OAK_BUTTON.get(),
            BlockTypes1V13.SPRUCE_BUTTON.get());
    CoreBlockGroup BUTTON = new CoreBlockGroup("Button",
            BlockTypes1V13.ACACIA_BUTTON.get(),
            BlockTypes1V13.BIRCH_BUTTON.get(),
            BlockTypes1V13.DARK_OAK_BUTTON.get(),
            BlockTypes1V13.JUNGLE_BUTTON.get(),
            BlockTypes1V13.OAK_BUTTON.get(),
            BlockTypes1V13.SPRUCE_BUTTON.get(),
            CommonBlockTypes.STONE_BUTTON.get());
    CoreBlockGroup STAINED_GLASS = new CoreBlockGroup("Stained Glass",
            BlockTypes1V13.BLACK_STAINED_GLASS.get(),
            BlockTypes1V13.BLUE_STAINED_GLASS.get(),
            BlockTypes1V13.BROWN_STAINED_GLASS.get(),
            BlockTypes1V13.CYAN_STAINED_GLASS.get(),
            BlockTypes1V13.GRAY_STAINED_GLASS.get(),
            BlockTypes1V13.GREEN_STAINED_GLASS.get(),
            BlockTypes1V13.LIGHT_BLUE_STAINED_GLASS.get(),
            BlockTypes1V13.LIGHT_GRAY_STAINED_GLASS.get(),
            BlockTypes1V13.LIME_STAINED_GLASS.get(),
            BlockTypes1V13.MAGENTA_STAINED_GLASS.get(),
            BlockTypes1V13.ORANGE_STAINED_GLASS.get(),
            BlockTypes1V13.PINK_STAINED_GLASS.get(),
            BlockTypes1V13.PURPLE_STAINED_GLASS.get(),
            BlockTypes1V13.RED_STAINED_GLASS.get(),
            BlockTypes1V13.WHITE_STAINED_GLASS.get(),
            BlockTypes1V13.YELLOW_STAINED_GLASS.get());
    CoreBlockGroup STAINED_GLASS_PANE = new CoreBlockGroup("Stained Glass",
            BlockTypes1V13.BLACK_STAINED_GLASS_PANE.get(),
            BlockTypes1V13.BLUE_STAINED_GLASS_PANE.get(),
            BlockTypes1V13.BROWN_STAINED_GLASS_PANE.get(),
            BlockTypes1V13.CYAN_STAINED_GLASS_PANE.get(),
            BlockTypes1V13.GRAY_STAINED_GLASS_PANE.get(),
            BlockTypes1V13.GREEN_STAINED_GLASS_PANE.get(),
            BlockTypes1V13.LIGHT_BLUE_STAINED_GLASS_PANE.get(),
            BlockTypes1V13.LIGHT_GRAY_STAINED_GLASS_PANE.get(),
            BlockTypes1V13.LIME_STAINED_GLASS_PANE.get(),
            BlockTypes1V13.MAGENTA_STAINED_GLASS_PANE.get(),
            BlockTypes1V13.ORANGE_STAINED_GLASS_PANE.get(),
            BlockTypes1V13.PINK_STAINED_GLASS_PANE.get(),
            BlockTypes1V13.PURPLE_STAINED_GLASS_PANE.get(),
            BlockTypes1V13.RED_STAINED_GLASS_PANE.get(),
            BlockTypes1V13.WHITE_STAINED_GLASS_PANE.get(),
            BlockTypes1V13.YELLOW_STAINED_GLASS_PANE.get());
    CoreBlockGroup SAPLING = new CoreBlockGroup("Sapling",
            BlockTypes1V13.ACACIA_SAPLING.get(),
            BlockTypes1V13.BIRCH_SAPLING.get(),
            BlockTypes1V13.DARK_OAK_SAPLING.get(),
            BlockTypes1V13.JUNGLE_SAPLING.get(),
            BlockTypes1V13.OAK_SAPLING.get(),
            BlockTypes1V13.SPRUCE_SAPLING.get());
    CoreBlockGroup POTTED_SAPLING = new CoreBlockGroup("Potted Sapling",
            BlockTypes1V13.POTTED_ACACIA_SAPLING.get(),
            BlockTypes1V13.POTTED_BIRCH_SAPLING.get(),
            BlockTypes1V13.POTTED_DARK_OAK_SAPLING.get(),
            BlockTypes1V13.POTTED_JUNGLE_SAPLING.get(),
            BlockTypes1V13.POTTED_OAK_SAPLING.get(),
            BlockTypes1V13.POTTED_SPRUCE_SAPLING.get());
    CoreBlockGroup WOOD_PRESSURE_PLATE = new CoreBlockGroup("Wood Pressure Plate",
            BlockTypes1V13.ACACIA_PRESSURE_PLATE.get(),
            BlockTypes1V13.BIRCH_PRESSURE_PLATE.get(),
            BlockTypes1V13.DARK_OAK_PRESSURE_PLATE.get(),
            BlockTypes1V13.JUNGLE_PRESSURE_PLATE.get(),
            BlockTypes1V13.OAK_PRESSURE_PLATE.get(),
            BlockTypes1V13.SPRUCE_PRESSURE_PLATE.get());
    CoreBlockGroup WALL_BANNER = new CoreBlockGroup("Wall Banner",
            BlockTypes1V13.BLACK_WALL_BANNER.get(),
            BlockTypes1V13.BLUE_WALL_BANNER.get(),
            BlockTypes1V13.BROWN_WALL_BANNER.get(),
            BlockTypes1V13.CYAN_WALL_BANNER.get(),
            BlockTypes1V13.GRAY_WALL_BANNER.get(),
            BlockTypes1V13.GREEN_WALL_BANNER.get(),
            BlockTypes1V13.LIGHT_BLUE_WALL_BANNER.get(),
            BlockTypes1V13.LIGHT_GRAY_WALL_BANNER.get(),
            BlockTypes1V13.LIME_WALL_BANNER.get(),
            BlockTypes1V13.MAGENTA_WALL_BANNER.get(),
            BlockTypes1V13.ORANGE_WALL_BANNER.get(),
            BlockTypes1V13.PINK_WALL_BANNER.get(),
            BlockTypes1V13.PURPLE_WALL_BANNER.get(),
            BlockTypes1V13.RED_WALL_BANNER.get(),
            BlockTypes1V13.WHITE_WALL_BANNER.get(),
            BlockTypes1V13.YELLOW_WALL_BANNER.get());
    CoreBlockGroup FREE_STANDING_BANNER = new CoreBlockGroup("Free Standing Banner",
            BlockTypes1V13.BLACK_BANNER.get(),
            BlockTypes1V13.BLUE_BANNER.get(),
            BlockTypes1V13.BROWN_BANNER.get(),
            BlockTypes1V13.CYAN_BANNER.get(),
            BlockTypes1V13.GRAY_BANNER.get(),
            BlockTypes1V13.GREEN_BANNER.get(),
            BlockTypes1V13.LIGHT_BLUE_BANNER.get(),
            BlockTypes1V13.LIGHT_GRAY_BANNER.get(),
            BlockTypes1V13.LIME_BANNER.get(),
            BlockTypes1V13.MAGENTA_BANNER.get(),
            BlockTypes1V13.ORANGE_BANNER.get(),
            BlockTypes1V13.PINK_BANNER.get(),
            BlockTypes1V13.PURPLE_BANNER.get(),
            BlockTypes1V13.RED_BANNER.get(),
            BlockTypes1V13.WHITE_BANNER.get(),
            BlockTypes1V13.YELLOW_BANNER.get());
    CoreBlockGroup BANNER = new CoreBlockGroup("Banner", FREE_STANDING_BANNER.getGrouped(), WALL_BANNER.getGrouped());
    CoreBlockGroup CARPET = new CoreBlockGroup("Carpet",
            BlockTypes1V13.BLACK_CARPET.get(),
            BlockTypes1V13.BLUE_CARPET.get(),
            BlockTypes1V13.BROWN_CARPET.get(),
            BlockTypes1V13.CYAN_CARPET.get(),
            BlockTypes1V13.GRAY_CARPET.get(),
            BlockTypes1V13.GREEN_CARPET.get(),
            BlockTypes1V13.LIGHT_BLUE_CARPET.get(),
            BlockTypes1V13.LIGHT_GRAY_CARPET.get(),
            BlockTypes1V13.LIME_CARPET.get(),
            BlockTypes1V13.MAGENTA_CARPET.get(),
            BlockTypes1V13.ORANGE_CARPET.get(),
            BlockTypes1V13.PINK_CARPET.get(),
            BlockTypes1V13.PURPLE_CARPET.get(),
            BlockTypes1V13.RED_CARPET.get(),
            BlockTypes1V13.WHITE_CARPET.get(),
            BlockTypes1V13.YELLOW_CARPET.get());
    CoreBlockGroup WOOL = new CoreBlockGroup("Wool",
            BlockTypes1V13.BLACK_WOOL.get(),
            BlockTypes1V13.BLUE_WOOL.get(),
            BlockTypes1V13.BROWN_WOOL.get(),
            BlockTypes1V13.CYAN_WOOL.get(),
            BlockTypes1V13.GRAY_WOOL.get(),
            BlockTypes1V13.GREEN_WOOL.get(),
            BlockTypes1V13.LIGHT_BLUE_WOOL.get(),
            BlockTypes1V13.LIGHT_GRAY_WOOL.get(),
            BlockTypes1V13.LIME_WOOL.get(),
            BlockTypes1V13.MAGENTA_WOOL.get(),
            BlockTypes1V13.ORANGE_WOOL.get(),
            BlockTypes1V13.PINK_WOOL.get(),
            BlockTypes1V13.PURPLE_WOOL.get(),
            BlockTypes1V13.RED_WOOL.get(),
            BlockTypes1V13.WHITE_WOOL.get(),
            BlockTypes1V13.YELLOW_WOOL.get());
    CoreBlockGroup PRESSURE_PLATE = new CoreBlockGroup("Pressure Plate",
            BlockTypes1V13.ACACIA_PRESSURE_PLATE.get(),
            BlockTypes1V13.BIRCH_PRESSURE_PLATE.get(),
            BlockTypes1V13.DARK_OAK_PRESSURE_PLATE.get(),
            BlockTypes1V13.JUNGLE_PRESSURE_PLATE.get(),
            BlockTypes1V13.OAK_PRESSURE_PLATE.get(),
            BlockTypes1V13.SPRUCE_PRESSURE_PLATE.get(),
            CommonBlockTypes.HEAVY_WEIGHTED_PRESSURE_PLATE.get(),
            CommonBlockTypes.LIGHT_WEIGHTED_PRESSURE_PLATE.get(),
            CommonBlockTypes.STONE_PRESSURE_PLATE.get());
    CoreBlockGroup WALL_HEAD = new CoreBlockGroup("Wall Head",
            BlockTypes1V13.CREEPER_WALL_HEAD.get(),
            BlockTypes1V13.DRAGON_WALL_HEAD.get(),
            BlockTypes1V13.PLAYER_WALL_HEAD.get(),
            BlockTypes1V13.ZOMBIE_WALL_HEAD.get());
    CoreBlockGroup STANDARD_HEAD = new CoreBlockGroup("Standard Head",
            BlockTypes1V13.CREEPER_HEAD.get(),
            BlockTypes1V13.DRAGON_HEAD.get(),
            BlockTypes1V13.PLAYER_HEAD.get(),
            BlockTypes1V13.ZOMBIE_HEAD.get());
    CoreBlockGroup REDSTONE_TORCH = new CoreBlockGroup("Redstone Torch",
            CommonBlockTypes.REDSTONE_TORCH.get(),
            BlockTypes1V13.REDSTONE_WALL_TORCH.get());
    CoreBlockGroup STANDARD_TORCH = new CoreBlockGroup("Standard Torch",
            CommonBlockTypes.TORCH.get(),
            BlockTypes1V13.WALL_TORCH.get());
    CoreBlockGroup WALL_TORCH = new CoreBlockGroup("Wall Torch",
            BlockTypes1V13.WALL_TORCH.get(),
            BlockTypes1V13.REDSTONE_WALL_TORCH.get());
    CoreBlockGroup STANDING_TORCH = new CoreBlockGroup("Standing Torch",
            CommonBlockTypes.TORCH.get(),
            CommonBlockTypes.REDSTONE_TORCH.get());
    CoreBlockGroup TORCH = new CoreBlockGroup("Torch",
            CommonBlockTypes.TORCH.get(),
            BlockTypes1V13.WALL_TORCH.get(),
            CommonBlockTypes.REDSTONE_TORCH.get(),
            BlockTypes1V13.REDSTONE_WALL_TORCH.get());
    CoreBlockGroup CONCRETE = new CoreBlockGroup("Concrete",
            BlockTypes1V13.BLACK_CONCRETE.get(),
            BlockTypes1V13.BLUE_CONCRETE.get(),
            BlockTypes1V13.BROWN_CONCRETE.get(),
            BlockTypes1V13.CYAN_CONCRETE.get(),
            BlockTypes1V13.GRAY_CONCRETE.get(),
            BlockTypes1V13.GREEN_CONCRETE.get(),
            BlockTypes1V13.LIGHT_BLUE_CONCRETE.get(),
            BlockTypes1V13.LIGHT_GRAY_CONCRETE.get(),
            BlockTypes1V13.LIME_CONCRETE.get(),
            BlockTypes1V13.MAGENTA_CONCRETE.get(),
            BlockTypes1V13.ORANGE_CONCRETE.get(),
            BlockTypes1V13.PINK_CONCRETE.get(),
            BlockTypes1V13.PURPLE_CONCRETE.get(),
            BlockTypes1V13.RED_CONCRETE.get(),
            BlockTypes1V13.WHITE_CONCRETE.get(),
            BlockTypes1V13.YELLOW_CONCRETE.get());
    CoreBlockGroup CONCRETE_POWDER = new CoreBlockGroup("Concrete Powder",
            BlockTypes1V13.BLACK_CONCRETE_POWDER.get(),
            BlockTypes1V13.BLUE_CONCRETE_POWDER.get(),
            BlockTypes1V13.BROWN_CONCRETE_POWDER.get(),
            BlockTypes1V13.CYAN_CONCRETE_POWDER.get(),
            BlockTypes1V13.GRAY_CONCRETE_POWDER.get(),
            BlockTypes1V13.GREEN_CONCRETE_POWDER.get(),
            BlockTypes1V13.LIGHT_BLUE_CONCRETE_POWDER.get(),
            BlockTypes1V13.LIGHT_GRAY_CONCRETE_POWDER.get(),
            BlockTypes1V13.LIME_CONCRETE_POWDER.get(),
            BlockTypes1V13.MAGENTA_CONCRETE_POWDER.get(),
            BlockTypes1V13.ORANGE_CONCRETE_POWDER.get(),
            BlockTypes1V13.PINK_CONCRETE_POWDER.get(),
            BlockTypes1V13.PURPLE_CONCRETE_POWDER.get(),
            BlockTypes1V13.RED_CONCRETE_POWDER.get(),
            BlockTypes1V13.WHITE_CONCRETE_POWDER.get(),
            BlockTypes1V13.YELLOW_CONCRETE_POWDER.get());
    CoreBlockGroup BED = new CoreBlockGroup("Bed",
            BlockTypes1V13.BLACK_BED.get(),
            BlockTypes1V13.BLUE_BED.get(),
            BlockTypes1V13.BROWN_BED.get(),
            BlockTypes1V13.CYAN_BED.get(),
            BlockTypes1V13.GRAY_BED.get(),
            BlockTypes1V13.GREEN_BED.get(),
            BlockTypes1V13.LIME_BED.get(),
            BlockTypes1V13.MAGENTA_BED.get(),
            BlockTypes1V13.ORANGE_BED.get(),
            BlockTypes1V13.PINK_BED.get(),
            BlockTypes1V13.PURPLE_BED.get(),
            BlockTypes1V13.RED_BED.get(),
            BlockTypes1V13.WHITE_BED.get(),
            BlockTypes1V13.YELLOW_BED.get(),
            BlockTypes1V13.LIGHT_BLUE_BED.get(),
            BlockTypes1V13.LIGHT_GRAY_BED.get(),
            BlockTypes1V13.LIGHT_BLUE_BED.get());
    CoreBlockGroup TERRACOTTA = new CoreBlockGroup("Terracotta",
            BlockTypes1V13.BLACK_TERRACOTTA.get(),
            BlockTypes1V13.BLUE_TERRACOTTA.get(),
            BlockTypes1V13.BROWN_TERRACOTTA.get(),
            BlockTypes1V13.CYAN_TERRACOTTA.get(),
            BlockTypes1V13.GRAY_TERRACOTTA.get(),
            BlockTypes1V13.GREEN_TERRACOTTA.get(),
            BlockTypes1V13.LIME_TERRACOTTA.get(),
            BlockTypes1V13.MAGENTA_TERRACOTTA.get(),
            BlockTypes1V13.ORANGE_TERRACOTTA.get(),
            BlockTypes1V13.PINK_TERRACOTTA.get(),
            BlockTypes1V13.PURPLE_TERRACOTTA.get(),
            BlockTypes1V13.RED_TERRACOTTA.get(),
            BlockTypes1V13.WHITE_TERRACOTTA.get(),
            BlockTypes1V13.YELLOW_TERRACOTTA.get());
}
