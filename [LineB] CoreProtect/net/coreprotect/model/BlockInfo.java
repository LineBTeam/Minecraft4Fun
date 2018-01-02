/*     */ package net.coreprotect.model;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
/*     */ import org.bukkit.Material;
/*     */ 
/*     */ public class BlockInfo
/*     */ {
/*  12 */   public static List<Material> track_any = Arrays.asList(new Material[] { Material.PISTON_EXTENSION, Material.TORCH, Material.LEVER, Material.REDSTONE_TORCH_OFF, Material.REDSTONE_TORCH_ON });
/*  13 */   public static List<Material> track_top = Arrays.asList(new Material[] { Material.SAPLING, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.LONG_GRASS, Material.DEAD_BUSH, Material.YELLOW_FLOWER, Material.RED_ROSE, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.REDSTONE_WIRE, Material.CROPS, Material.SIGN_POST, Material.STANDING_BANNER, Material.WOODEN_DOOR, Material.SPRUCE_DOOR, Material.BIRCH_DOOR, Material.JUNGLE_DOOR, Material.ACACIA_DOOR, Material.DARK_OAK_DOOR, Material.RAILS, Material.STONE_PLATE, Material.WOOD_PLATE, Material.IRON_DOOR_BLOCK, Material.WOOD_PLATE, Material.SNOW, Material.CACTUS, Material.SUGAR_CANE_BLOCK, Material.DIODE_BLOCK_OFF, Material.DIODE_BLOCK_ON, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.FLOWER_POT, Material.CARROT, Material.POTATO, Material.GOLD_PLATE, Material.IRON_PLATE, Material.REDSTONE_COMPARATOR_OFF, Material.REDSTONE_COMPARATOR_ON, Material.ACTIVATOR_RAIL, Material.CARPET, Material.DOUBLE_PLANT, Material.NETHER_WARTS });
/*  14 */   public static List<Material> track_side = Arrays.asList(new Material[] { Material.RAILS, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.ACTIVATOR_RAIL, Material.WALL_BANNER, Material.BED_BLOCK, Material.LADDER, Material.WALL_SIGN, Material.STONE_BUTTON, Material.TRAP_DOOR, Material.IRON_TRAPDOOR, Material.VINE, Material.COCOA, Material.TRIPWIRE_HOOK, Material.WOOD_BUTTON });
/*  15 */   public static List<Material> shulker_boxes = Arrays.asList(new Material[] { Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.SILVER_SHULKER_BOX, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX });
/*  16 */   public static List<Material> containers = Arrays.asList(new Material[] { Material.DISPENSER, Material.CHEST, Material.FURNACE, Material.BURNING_FURNACE, Material.BREWING_STAND, Material.TRAPPED_CHEST, Material.HOPPER, Material.DROPPER, Material.ARMOR_STAND, Material.BLACK_SHULKER_BOX, Material.BLUE_SHULKER_BOX, Material.BROWN_SHULKER_BOX, Material.CYAN_SHULKER_BOX, Material.GRAY_SHULKER_BOX, Material.GREEN_SHULKER_BOX, Material.LIGHT_BLUE_SHULKER_BOX, Material.LIME_SHULKER_BOX, Material.MAGENTA_SHULKER_BOX, Material.ORANGE_SHULKER_BOX, Material.PINK_SHULKER_BOX, Material.PURPLE_SHULKER_BOX, Material.RED_SHULKER_BOX, Material.SILVER_SHULKER_BOX, Material.WHITE_SHULKER_BOX, Material.YELLOW_SHULKER_BOX });
/*  17 */   public static List<Material> falling_block_types = Arrays.asList(new Material[] { Material.SAND, Material.GRAVEL, Material.ANVIL });
/*  18 */   public static List<Material> non_solid_entity_blocks = Arrays.asList(new Material[] { Material.AIR, Material.SAPLING, Material.WATER, Material.STATIONARY_WATER, Material.LAVA, Material.STATIONARY_LAVA, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.WEB, Material.LONG_GRASS, Material.DEAD_BUSH, Material.PISTON_EXTENSION, Material.YELLOW_FLOWER, Material.RED_ROSE, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.TORCH, Material.FIRE, Material.CROPS, Material.RAILS, Material.LEVER, Material.STONE_PLATE, Material.WOOD_PLATE, Material.REDSTONE_TORCH_OFF, Material.REDSTONE_TORCH_ON, Material.STONE_BUTTON, Material.SNOW, Material.SUGAR_CANE_BLOCK, Material.CAKE_BLOCK, Material.DIODE_BLOCK_OFF, Material.DIODE_BLOCK_ON, Material.TRAP_DOOR, Material.IRON_TRAPDOOR, Material.WALL_BANNER, Material.STANDING_BANNER, Material.COCOA, Material.TRIPWIRE_HOOK, Material.TRIPWIRE, Material.FLOWER_POT, Material.CARROT, Material.POTATO, Material.WOOD_BUTTON, Material.GOLD_PLATE, Material.IRON_PLATE, Material.REDSTONE_COMPARATOR_OFF, Material.REDSTONE_COMPARATOR_ON, Material.ACTIVATOR_RAIL });
/*  19 */   public static List<Material> non_attachable = Arrays.asList(new Material[] { Material.AIR, Material.SAPLING, Material.WATER, Material.STATIONARY_WATER, Material.LAVA, Material.STATIONARY_LAVA, Material.POWERED_RAIL, Material.DETECTOR_RAIL, Material.LONG_GRASS, Material.DEAD_BUSH, Material.YELLOW_FLOWER, Material.RED_ROSE, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.TORCH, Material.FIRE, Material.REDSTONE_WIRE, Material.LADDER, Material.RAILS, Material.LEVER, Material.REDSTONE_TORCH_OFF, Material.REDSTONE_TORCH_ON, Material.STONE_BUTTON, Material.SNOW, Material.SUGAR_CANE_BLOCK, Material.PORTAL, Material.DIODE_BLOCK_OFF, Material.DIODE_BLOCK_ON });
/*     */   
/*     */ 
/*     */ 
/*  23 */   public static List<Material> natural_blocks = Arrays.asList(new Material[] { Material.STONE, Material.GRASS, Material.DIRT, Material.SAND, Material.GRAVEL, Material.GOLD_ORE, Material.IRON_ORE, Material.COAL_ORE, Material.LOG, Material.LEAVES, Material.LAPIS_ORE, Material.SANDSTONE, Material.WEB, Material.LONG_GRASS, Material.DEAD_BUSH, Material.YELLOW_FLOWER, Material.RED_ROSE, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.OBSIDIAN, Material.DIAMOND_ORE, Material.CROPS, Material.REDSTONE_ORE, Material.GLOWING_REDSTONE_ORE, Material.SNOW, Material.ICE, Material.CACTUS, Material.CLAY, Material.SUGAR_CANE_BLOCK, Material.PUMPKIN, Material.NETHERRACK, Material.SOUL_SAND, Material.MELON_BLOCK, Material.PUMPKIN_STEM, Material.MELON_STEM, Material.VINE, Material.MYCEL, Material.WATER_LILY, Material.NETHER_WARTS, Material.ENDER_STONE, Material.EMERALD_ORE, Material.CARROT, Material.POTATO });
/*     */   
/*  25 */   public static Map<String, Integer> legacy_block_ids = Collections.synchronizedMap(new java.util.HashMap());
/*  26 */   public static Map<Integer, String> legacy_block_names = Collections.synchronizedMap(new java.util.HashMap());
/*     */   
/*     */   protected static void loadData() {
/*  29 */     Map<Integer, String> n = legacy_block_names;
/*  30 */     Map<String, Integer> i = legacy_block_ids;
/*     */     
/*     */ 
/*  33 */     n.put(Integer.valueOf(0), "minecraft:air");
/*  34 */     n.put(Integer.valueOf(1), "minecraft:stone");
/*  35 */     n.put(Integer.valueOf(2), "minecraft:grass");
/*  36 */     n.put(Integer.valueOf(3), "minecraft:dirt");
/*  37 */     n.put(Integer.valueOf(4), "minecraft:cobblestone");
/*  38 */     n.put(Integer.valueOf(5), "minecraft:planks");
/*  39 */     n.put(Integer.valueOf(6), "minecraft:sapling");
/*  40 */     n.put(Integer.valueOf(7), "minecraft:bedrock");
/*  41 */     n.put(Integer.valueOf(8), "minecraft:flowing_water");
/*  42 */     n.put(Integer.valueOf(9), "minecraft:water");
/*  43 */     n.put(Integer.valueOf(10), "minecraft:flowing_lava");
/*  44 */     n.put(Integer.valueOf(11), "minecraft:lava");
/*  45 */     n.put(Integer.valueOf(12), "minecraft:sand");
/*  46 */     n.put(Integer.valueOf(13), "minecraft:gravel");
/*  47 */     n.put(Integer.valueOf(14), "minecraft:gold_ore");
/*  48 */     n.put(Integer.valueOf(15), "minecraft:iron_ore");
/*  49 */     n.put(Integer.valueOf(16), "minecraft:coal_ore");
/*  50 */     n.put(Integer.valueOf(17), "minecraft:log");
/*  51 */     n.put(Integer.valueOf(18), "minecraft:leaves");
/*  52 */     n.put(Integer.valueOf(19), "minecraft:sponge");
/*  53 */     n.put(Integer.valueOf(20), "minecraft:glass");
/*  54 */     n.put(Integer.valueOf(21), "minecraft:lapis_ore");
/*  55 */     n.put(Integer.valueOf(22), "minecraft:lapis_block");
/*  56 */     n.put(Integer.valueOf(23), "minecraft:dispenser");
/*  57 */     n.put(Integer.valueOf(24), "minecraft:sandstone");
/*  58 */     n.put(Integer.valueOf(25), "minecraft:noteblock");
/*  59 */     n.put(Integer.valueOf(26), "minecraft:bed");
/*  60 */     n.put(Integer.valueOf(27), "minecraft:golden_rail");
/*  61 */     n.put(Integer.valueOf(28), "minecraft:detector_rail");
/*  62 */     n.put(Integer.valueOf(29), "minecraft:sticky_piston");
/*  63 */     n.put(Integer.valueOf(30), "minecraft:web");
/*  64 */     n.put(Integer.valueOf(31), "minecraft:tallgrass");
/*  65 */     n.put(Integer.valueOf(32), "minecraft:deadbush");
/*  66 */     n.put(Integer.valueOf(33), "minecraft:piston");
/*  67 */     n.put(Integer.valueOf(34), "minecraft:piston_head");
/*  68 */     n.put(Integer.valueOf(35), "minecraft:wool");
/*  69 */     n.put(Integer.valueOf(36), "minecraft:piston_extension");
/*  70 */     n.put(Integer.valueOf(37), "minecraft:yellow_flower");
/*  71 */     n.put(Integer.valueOf(38), "minecraft:red_flower");
/*  72 */     n.put(Integer.valueOf(39), "minecraft:brown_mushroom");
/*  73 */     n.put(Integer.valueOf(40), "minecraft:red_mushroom");
/*  74 */     n.put(Integer.valueOf(41), "minecraft:gold_block");
/*  75 */     n.put(Integer.valueOf(42), "minecraft:iron_block");
/*  76 */     n.put(Integer.valueOf(43), "minecraft:double_stone_slab");
/*  77 */     n.put(Integer.valueOf(44), "minecraft:stone_slab");
/*  78 */     n.put(Integer.valueOf(45), "minecraft:brick_block");
/*  79 */     n.put(Integer.valueOf(46), "minecraft:tnt");
/*  80 */     n.put(Integer.valueOf(47), "minecraft:bookshelf");
/*  81 */     n.put(Integer.valueOf(48), "minecraft:mossy_cobblestone");
/*  82 */     n.put(Integer.valueOf(49), "minecraft:obsidian");
/*  83 */     n.put(Integer.valueOf(50), "minecraft:torch");
/*  84 */     n.put(Integer.valueOf(51), "minecraft:fire");
/*  85 */     n.put(Integer.valueOf(52), "minecraft:mob_spawner");
/*  86 */     n.put(Integer.valueOf(53), "minecraft:oak_stairs");
/*  87 */     n.put(Integer.valueOf(54), "minecraft:chest");
/*  88 */     n.put(Integer.valueOf(55), "minecraft:redstone_wire");
/*  89 */     n.put(Integer.valueOf(56), "minecraft:diamond_ore");
/*  90 */     n.put(Integer.valueOf(57), "minecraft:diamond_block");
/*  91 */     n.put(Integer.valueOf(58), "minecraft:crafting_table");
/*  92 */     n.put(Integer.valueOf(59), "minecraft:wheat");
/*  93 */     n.put(Integer.valueOf(60), "minecraft:farmland");
/*  94 */     n.put(Integer.valueOf(61), "minecraft:furnace");
/*  95 */     n.put(Integer.valueOf(62), "minecraft:lit_furnace");
/*  96 */     n.put(Integer.valueOf(63), "minecraft:standing_sign");
/*  97 */     n.put(Integer.valueOf(64), "minecraft:wooden_door");
/*  98 */     n.put(Integer.valueOf(65), "minecraft:ladder");
/*  99 */     n.put(Integer.valueOf(66), "minecraft:rail");
/* 100 */     n.put(Integer.valueOf(67), "minecraft:stone_stairs");
/* 101 */     n.put(Integer.valueOf(68), "minecraft:wall_sign");
/* 102 */     n.put(Integer.valueOf(69), "minecraft:lever");
/* 103 */     n.put(Integer.valueOf(70), "minecraft:stone_pressure_plate");
/* 104 */     n.put(Integer.valueOf(71), "minecraft:iron_door");
/* 105 */     n.put(Integer.valueOf(72), "minecraft:wooden_pressure_plate");
/* 106 */     n.put(Integer.valueOf(73), "minecraft:redstone_ore");
/* 107 */     n.put(Integer.valueOf(74), "minecraft:lit_redstone_ore");
/* 108 */     n.put(Integer.valueOf(75), "minecraft:unlit_redstone_torch");
/* 109 */     n.put(Integer.valueOf(76), "minecraft:redstone_torch");
/* 110 */     n.put(Integer.valueOf(77), "minecraft:stone_button");
/* 111 */     n.put(Integer.valueOf(78), "minecraft:snow_layer");
/* 112 */     n.put(Integer.valueOf(79), "minecraft:ice");
/* 113 */     n.put(Integer.valueOf(80), "minecraft:snow");
/* 114 */     n.put(Integer.valueOf(81), "minecraft:cactus");
/* 115 */     n.put(Integer.valueOf(82), "minecraft:clay");
/* 116 */     n.put(Integer.valueOf(83), "minecraft:reeds");
/* 117 */     n.put(Integer.valueOf(84), "minecraft:jukebox");
/* 118 */     n.put(Integer.valueOf(85), "minecraft:fence");
/* 119 */     n.put(Integer.valueOf(86), "minecraft:pumpkin");
/* 120 */     n.put(Integer.valueOf(87), "minecraft:netherrack");
/* 121 */     n.put(Integer.valueOf(88), "minecraft:soul_sand");
/* 122 */     n.put(Integer.valueOf(89), "minecraft:glowstone");
/* 123 */     n.put(Integer.valueOf(90), "minecraft:portal");
/* 124 */     n.put(Integer.valueOf(91), "minecraft:lit_pumpkin");
/* 125 */     n.put(Integer.valueOf(92), "minecraft:cake");
/* 126 */     n.put(Integer.valueOf(93), "minecraft:unpowered_repeater");
/* 127 */     n.put(Integer.valueOf(94), "minecraft:powered_repeater");
/* 128 */     n.put(Integer.valueOf(95), "minecraft:stained_glass");
/* 129 */     n.put(Integer.valueOf(96), "minecraft:trapdoor");
/* 130 */     n.put(Integer.valueOf(97), "minecraft:monster_egg");
/* 131 */     n.put(Integer.valueOf(98), "minecraft:stonebrick");
/* 132 */     n.put(Integer.valueOf(99), "minecraft:brown_mushroom_block");
/* 133 */     n.put(Integer.valueOf(100), "minecraft:red_mushroom_block");
/* 134 */     n.put(Integer.valueOf(101), "minecraft:iron_bars");
/* 135 */     n.put(Integer.valueOf(102), "minecraft:glass_pane");
/* 136 */     n.put(Integer.valueOf(103), "minecraft:melon_block");
/* 137 */     n.put(Integer.valueOf(104), "minecraft:pumpkin_stem");
/* 138 */     n.put(Integer.valueOf(105), "minecraft:melon_stem");
/* 139 */     n.put(Integer.valueOf(106), "minecraft:vine");
/* 140 */     n.put(Integer.valueOf(107), "minecraft:fence_gate");
/* 141 */     n.put(Integer.valueOf(108), "minecraft:brick_stairs");
/* 142 */     n.put(Integer.valueOf(109), "minecraft:stone_brick_stairs");
/* 143 */     n.put(Integer.valueOf(110), "minecraft:mycelium");
/* 144 */     n.put(Integer.valueOf(111), "minecraft:waterlily");
/* 145 */     n.put(Integer.valueOf(112), "minecraft:nether_brick");
/* 146 */     n.put(Integer.valueOf(113), "minecraft:nether_brick_fence");
/* 147 */     n.put(Integer.valueOf(114), "minecraft:nether_brick_stairs");
/* 148 */     n.put(Integer.valueOf(115), "minecraft:nether_wart");
/* 149 */     n.put(Integer.valueOf(116), "minecraft:enchanting_table");
/* 150 */     n.put(Integer.valueOf(117), "minecraft:brewing_stand");
/* 151 */     n.put(Integer.valueOf(118), "minecraft:cauldron");
/* 152 */     n.put(Integer.valueOf(119), "minecraft:end_portal");
/* 153 */     n.put(Integer.valueOf(120), "minecraft:end_portal_frame");
/* 154 */     n.put(Integer.valueOf(121), "minecraft:end_stone");
/* 155 */     n.put(Integer.valueOf(122), "minecraft:dragon_egg");
/* 156 */     n.put(Integer.valueOf(123), "minecraft:redstone_lamp");
/* 157 */     n.put(Integer.valueOf(124), "minecraft:lit_redstone_lamp");
/* 158 */     n.put(Integer.valueOf(125), "minecraft:double_wooden_slab");
/* 159 */     n.put(Integer.valueOf(126), "minecraft:wooden_slab");
/* 160 */     n.put(Integer.valueOf(127), "minecraft:cocoa");
/* 161 */     n.put(Integer.valueOf(128), "minecraft:sandstone_stairs");
/* 162 */     n.put(Integer.valueOf(129), "minecraft:emerald_ore");
/* 163 */     n.put(Integer.valueOf(130), "minecraft:ender_chest");
/* 164 */     n.put(Integer.valueOf(131), "minecraft:tripwire_hook");
/* 165 */     n.put(Integer.valueOf(132), "minecraft:tripwire");
/* 166 */     n.put(Integer.valueOf(133), "minecraft:emerald_block");
/* 167 */     n.put(Integer.valueOf(134), "minecraft:spruce_stairs");
/* 168 */     n.put(Integer.valueOf(135), "minecraft:birch_stairs");
/* 169 */     n.put(Integer.valueOf(136), "minecraft:jungle_stairs");
/* 170 */     n.put(Integer.valueOf(137), "minecraft:command_block");
/* 171 */     n.put(Integer.valueOf(138), "minecraft:beacon");
/* 172 */     n.put(Integer.valueOf(139), "minecraft:cobblestone_wall");
/* 173 */     n.put(Integer.valueOf(140), "minecraft:flower_pot");
/* 174 */     n.put(Integer.valueOf(141), "minecraft:carrots");
/* 175 */     n.put(Integer.valueOf(142), "minecraft:potatoes");
/* 176 */     n.put(Integer.valueOf(143), "minecraft:wooden_button");
/* 177 */     n.put(Integer.valueOf(144), "minecraft:skull");
/* 178 */     n.put(Integer.valueOf(145), "minecraft:anvil");
/* 179 */     n.put(Integer.valueOf(146), "minecraft:trapped_chest");
/* 180 */     n.put(Integer.valueOf(147), "minecraft:light_weighted_pressure_plate");
/* 181 */     n.put(Integer.valueOf(148), "minecraft:heavy_weighted_pressure_plate");
/* 182 */     n.put(Integer.valueOf(149), "minecraft:unpowered_comparator");
/* 183 */     n.put(Integer.valueOf(150), "minecraft:powered_comparator");
/* 184 */     n.put(Integer.valueOf(151), "minecraft:daylight_detector");
/* 185 */     n.put(Integer.valueOf(152), "minecraft:redstone_block");
/* 186 */     n.put(Integer.valueOf(153), "minecraft:quartz_ore");
/* 187 */     n.put(Integer.valueOf(154), "minecraft:hopper");
/* 188 */     n.put(Integer.valueOf(155), "minecraft:quartz_block");
/* 189 */     n.put(Integer.valueOf(156), "minecraft:quartz_stairs");
/* 190 */     n.put(Integer.valueOf(157), "minecraft:activator_rail");
/* 191 */     n.put(Integer.valueOf(158), "minecraft:dropper");
/* 192 */     n.put(Integer.valueOf(159), "minecraft:stained_hardened_clay");
/* 193 */     n.put(Integer.valueOf(160), "minecraft:stained_glass_pane");
/* 194 */     n.put(Integer.valueOf(161), "minecraft:leaves2");
/* 195 */     n.put(Integer.valueOf(162), "minecraft:log2");
/* 196 */     n.put(Integer.valueOf(163), "minecraft:acacia_stairs");
/* 197 */     n.put(Integer.valueOf(164), "minecraft:dark_oak_stairs");
/* 198 */     n.put(Integer.valueOf(165), "minecraft:slime");
/* 199 */     n.put(Integer.valueOf(166), "minecraft:barrier");
/* 200 */     n.put(Integer.valueOf(167), "minecraft:iron_trapdoor");
/* 201 */     n.put(Integer.valueOf(168), "minecraft:prismarine");
/* 202 */     n.put(Integer.valueOf(169), "minecraft:sea_lantern");
/* 203 */     n.put(Integer.valueOf(170), "minecraft:hay_block");
/* 204 */     n.put(Integer.valueOf(171), "minecraft:carpet");
/* 205 */     n.put(Integer.valueOf(172), "minecraft:hardened_clay");
/* 206 */     n.put(Integer.valueOf(173), "minecraft:coal_block");
/* 207 */     n.put(Integer.valueOf(174), "minecraft:packed_ice");
/* 208 */     n.put(Integer.valueOf(175), "minecraft:double_plant");
/* 209 */     n.put(Integer.valueOf(176), "minecraft:standing_banner");
/* 210 */     n.put(Integer.valueOf(177), "minecraft:wall_banner");
/* 211 */     n.put(Integer.valueOf(178), "minecraft:daylight_detector_inverted");
/* 212 */     n.put(Integer.valueOf(179), "minecraft:red_sandstone");
/* 213 */     n.put(Integer.valueOf(180), "minecraft:red_sandstone_stairs");
/* 214 */     n.put(Integer.valueOf(181), "minecraft:double_stone_slab2");
/* 215 */     n.put(Integer.valueOf(182), "minecraft:stone_slab2");
/* 216 */     n.put(Integer.valueOf(183), "minecraft:spruce_fence_gate");
/* 217 */     n.put(Integer.valueOf(184), "minecraft:birch_fence_gate");
/* 218 */     n.put(Integer.valueOf(185), "minecraft:jungle_fence_gate");
/* 219 */     n.put(Integer.valueOf(186), "minecraft:dark_oak_fence_gate");
/* 220 */     n.put(Integer.valueOf(187), "minecraft:acacia_fence_gate");
/* 221 */     n.put(Integer.valueOf(188), "minecraft:spruce_fence");
/* 222 */     n.put(Integer.valueOf(189), "minecraft:birch_fence");
/* 223 */     n.put(Integer.valueOf(190), "minecraft:jungle_fence");
/* 224 */     n.put(Integer.valueOf(191), "minecraft:dark_oak_fence");
/* 225 */     n.put(Integer.valueOf(192), "minecraft:acacia_fence");
/* 226 */     n.put(Integer.valueOf(193), "minecraft:spruce_door");
/* 227 */     n.put(Integer.valueOf(194), "minecraft:birch_door");
/* 228 */     n.put(Integer.valueOf(195), "minecraft:jungle_door");
/* 229 */     n.put(Integer.valueOf(196), "minecraft:acacia_door");
/* 230 */     n.put(Integer.valueOf(197), "minecraft:dark_oak_door");
/* 231 */     n.put(Integer.valueOf(198), "minecraft:end_rod");
/* 232 */     n.put(Integer.valueOf(199), "minecraft:chorus_plant");
/* 233 */     n.put(Integer.valueOf(200), "minecraft:chorus_flower");
/* 234 */     n.put(Integer.valueOf(201), "minecraft:purpur_block");
/* 235 */     n.put(Integer.valueOf(202), "minecraft:purpur_pillar");
/* 236 */     n.put(Integer.valueOf(203), "minecraft:purpur_stairs");
/* 237 */     n.put(Integer.valueOf(204), "minecraft:purpur_double_slab");
/* 238 */     n.put(Integer.valueOf(205), "minecraft:purpur_slab");
/* 239 */     n.put(Integer.valueOf(206), "minecraft:end_bricks");
/* 240 */     n.put(Integer.valueOf(207), "minecraft:beetroots");
/* 241 */     n.put(Integer.valueOf(208), "minecraft:grass_path");
/* 242 */     n.put(Integer.valueOf(209), "minecraft:end_gateway");
/* 243 */     n.put(Integer.valueOf(210), "minecraft:repeating_command_block");
/* 244 */     n.put(Integer.valueOf(211), "minecraft:chain_command_block");
/* 245 */     n.put(Integer.valueOf(212), "minecraft:frosted_ice");
/* 246 */     n.put(Integer.valueOf(213), "minecraft:magma");
/* 247 */     n.put(Integer.valueOf(214), "minecraft:nether_wart_block");
/* 248 */     n.put(Integer.valueOf(215), "minecraft:red_nether_brick");
/* 249 */     n.put(Integer.valueOf(216), "minecraft:bone_block");
/* 250 */     n.put(Integer.valueOf(217), "minecraft:structure_void");
/* 251 */     n.put(Integer.valueOf(218), "minecraft:observer");
/* 252 */     n.put(Integer.valueOf(219), "minecraft:white_shulker_box");
/* 253 */     n.put(Integer.valueOf(220), "minecraft:orange_shulker_box");
/* 254 */     n.put(Integer.valueOf(221), "minecraft:magenta_shulker_box");
/* 255 */     n.put(Integer.valueOf(222), "minecraft:light_blue_shulker_box");
/* 256 */     n.put(Integer.valueOf(223), "minecraft:yellow_shulker_box");
/* 257 */     n.put(Integer.valueOf(224), "minecraft:lime_shulker_box");
/* 258 */     n.put(Integer.valueOf(225), "minecraft:pink_shulker_box");
/* 259 */     n.put(Integer.valueOf(226), "minecraft:gray_shulker_box");
/* 260 */     n.put(Integer.valueOf(227), "minecraft:light_gray_shulker_box");
/* 261 */     n.put(Integer.valueOf(228), "minecraft:cyan_shulker_box");
/* 262 */     n.put(Integer.valueOf(229), "minecraft:purple_shulker_box");
/* 263 */     n.put(Integer.valueOf(230), "minecraft:blue_shulker_box");
/* 264 */     n.put(Integer.valueOf(231), "minecraft:brown_shulker_box");
/* 265 */     n.put(Integer.valueOf(232), "minecraft:green_shulker_box");
/* 266 */     n.put(Integer.valueOf(233), "minecraft:red_shulker_box");
/* 267 */     n.put(Integer.valueOf(234), "minecraft:black_shulker_box");
/* 268 */     n.put(Integer.valueOf(255), "minecraft:structure_block");
/* 269 */     n.put(Integer.valueOf(256), "minecraft:iron_shovel");
/* 270 */     n.put(Integer.valueOf(257), "minecraft:iron_pickaxe");
/* 271 */     n.put(Integer.valueOf(258), "minecraft:iron_axe");
/* 272 */     n.put(Integer.valueOf(259), "minecraft:flint_and_steel");
/* 273 */     n.put(Integer.valueOf(260), "minecraft:apple");
/* 274 */     n.put(Integer.valueOf(261), "minecraft:bow");
/* 275 */     n.put(Integer.valueOf(262), "minecraft:arrow");
/* 276 */     n.put(Integer.valueOf(263), "minecraft:coal");
/* 277 */     n.put(Integer.valueOf(264), "minecraft:diamond");
/* 278 */     n.put(Integer.valueOf(265), "minecraft:iron_ingot");
/* 279 */     n.put(Integer.valueOf(266), "minecraft:gold_ingot");
/* 280 */     n.put(Integer.valueOf(267), "minecraft:iron_sword");
/* 281 */     n.put(Integer.valueOf(268), "minecraft:wooden_sword");
/* 282 */     n.put(Integer.valueOf(269), "minecraft:wooden_shovel");
/* 283 */     n.put(Integer.valueOf(270), "minecraft:wooden_pickaxe");
/* 284 */     n.put(Integer.valueOf(271), "minecraft:wooden_axe");
/* 285 */     n.put(Integer.valueOf(272), "minecraft:stone_sword");
/* 286 */     n.put(Integer.valueOf(273), "minecraft:stone_shovel");
/* 287 */     n.put(Integer.valueOf(274), "minecraft:stone_pickaxe");
/* 288 */     n.put(Integer.valueOf(275), "minecraft:stone_axe");
/* 289 */     n.put(Integer.valueOf(276), "minecraft:diamond_sword");
/* 290 */     n.put(Integer.valueOf(277), "minecraft:diamond_shovel");
/* 291 */     n.put(Integer.valueOf(278), "minecraft:diamond_pickaxe");
/* 292 */     n.put(Integer.valueOf(279), "minecraft:diamond_axe");
/* 293 */     n.put(Integer.valueOf(280), "minecraft:stick");
/* 294 */     n.put(Integer.valueOf(281), "minecraft:bowl");
/* 295 */     n.put(Integer.valueOf(282), "minecraft:mushroom_stew");
/* 296 */     n.put(Integer.valueOf(283), "minecraft:golden_sword");
/* 297 */     n.put(Integer.valueOf(284), "minecraft:golden_shovel");
/* 298 */     n.put(Integer.valueOf(285), "minecraft:golden_pickaxe");
/* 299 */     n.put(Integer.valueOf(286), "minecraft:golden_axe");
/* 300 */     n.put(Integer.valueOf(287), "minecraft:string");
/* 301 */     n.put(Integer.valueOf(288), "minecraft:feather");
/* 302 */     n.put(Integer.valueOf(289), "minecraft:gunpowder");
/* 303 */     n.put(Integer.valueOf(290), "minecraft:wooden_hoe");
/* 304 */     n.put(Integer.valueOf(291), "minecraft:stone_hoe");
/* 305 */     n.put(Integer.valueOf(292), "minecraft:iron_hoe");
/* 306 */     n.put(Integer.valueOf(293), "minecraft:diamond_hoe");
/* 307 */     n.put(Integer.valueOf(294), "minecraft:golden_hoe");
/* 308 */     n.put(Integer.valueOf(295), "minecraft:wheat_seeds");
/* 309 */     n.put(Integer.valueOf(296), "minecraft:wheat");
/* 310 */     n.put(Integer.valueOf(297), "minecraft:bread");
/* 311 */     n.put(Integer.valueOf(298), "minecraft:leather_helmet");
/* 312 */     n.put(Integer.valueOf(299), "minecraft:leather_chestplate");
/* 313 */     n.put(Integer.valueOf(300), "minecraft:leather_leggings");
/* 314 */     n.put(Integer.valueOf(301), "minecraft:leather_boots");
/* 315 */     n.put(Integer.valueOf(302), "minecraft:chainmail_helmet");
/* 316 */     n.put(Integer.valueOf(303), "minecraft:chainmail_chestplate");
/* 317 */     n.put(Integer.valueOf(304), "minecraft:chainmail_leggings");
/* 318 */     n.put(Integer.valueOf(305), "minecraft:chainmail_boots");
/* 319 */     n.put(Integer.valueOf(306), "minecraft:iron_helmet");
/* 320 */     n.put(Integer.valueOf(307), "minecraft:iron_chestplate");
/* 321 */     n.put(Integer.valueOf(308), "minecraft:iron_leggings");
/* 322 */     n.put(Integer.valueOf(309), "minecraft:iron_boots");
/* 323 */     n.put(Integer.valueOf(310), "minecraft:diamond_helmet");
/* 324 */     n.put(Integer.valueOf(311), "minecraft:diamond_chestplate");
/* 325 */     n.put(Integer.valueOf(312), "minecraft:diamond_leggings");
/* 326 */     n.put(Integer.valueOf(313), "minecraft:diamond_boots");
/* 327 */     n.put(Integer.valueOf(314), "minecraft:golden_helmet");
/* 328 */     n.put(Integer.valueOf(315), "minecraft:golden_chestplate");
/* 329 */     n.put(Integer.valueOf(316), "minecraft:golden_leggings");
/* 330 */     n.put(Integer.valueOf(317), "minecraft:golden_boots");
/* 331 */     n.put(Integer.valueOf(318), "minecraft:flint");
/* 332 */     n.put(Integer.valueOf(319), "minecraft:porkchop");
/* 333 */     n.put(Integer.valueOf(320), "minecraft:cooked_porkchop");
/* 334 */     n.put(Integer.valueOf(321), "minecraft:painting");
/* 335 */     n.put(Integer.valueOf(322), "minecraft:golden_apple");
/* 336 */     n.put(Integer.valueOf(323), "minecraft:sign");
/* 337 */     n.put(Integer.valueOf(324), "minecraft:wooden_door");
/* 338 */     n.put(Integer.valueOf(325), "minecraft:bucket");
/* 339 */     n.put(Integer.valueOf(326), "minecraft:water_bucket");
/* 340 */     n.put(Integer.valueOf(327), "minecraft:lava_bucket");
/* 341 */     n.put(Integer.valueOf(328), "minecraft:minecart");
/* 342 */     n.put(Integer.valueOf(329), "minecraft:saddle");
/* 343 */     n.put(Integer.valueOf(330), "minecraft:iron_door");
/* 344 */     n.put(Integer.valueOf(331), "minecraft:redstone");
/* 345 */     n.put(Integer.valueOf(332), "minecraft:snowball");
/* 346 */     n.put(Integer.valueOf(333), "minecraft:boat");
/* 347 */     n.put(Integer.valueOf(334), "minecraft:leather");
/* 348 */     n.put(Integer.valueOf(335), "minecraft:milk_bucket");
/* 349 */     n.put(Integer.valueOf(336), "minecraft:brick");
/* 350 */     n.put(Integer.valueOf(337), "minecraft:clay_ball");
/* 351 */     n.put(Integer.valueOf(338), "minecraft:reeds");
/* 352 */     n.put(Integer.valueOf(339), "minecraft:paper");
/* 353 */     n.put(Integer.valueOf(340), "minecraft:book");
/* 354 */     n.put(Integer.valueOf(341), "minecraft:slime_ball");
/* 355 */     n.put(Integer.valueOf(342), "minecraft:chest_minecart");
/* 356 */     n.put(Integer.valueOf(343), "minecraft:furnace_minecart");
/* 357 */     n.put(Integer.valueOf(344), "minecraft:egg");
/* 358 */     n.put(Integer.valueOf(345), "minecraft:compass");
/* 359 */     n.put(Integer.valueOf(346), "minecraft:fishing_rod");
/* 360 */     n.put(Integer.valueOf(347), "minecraft:clock");
/* 361 */     n.put(Integer.valueOf(348), "minecraft:glowstone_dust");
/* 362 */     n.put(Integer.valueOf(349), "minecraft:fish");
/* 363 */     n.put(Integer.valueOf(350), "minecraft:cooked_fish");
/* 364 */     n.put(Integer.valueOf(351), "minecraft:dye");
/* 365 */     n.put(Integer.valueOf(352), "minecraft:bone");
/* 366 */     n.put(Integer.valueOf(353), "minecraft:sugar");
/* 367 */     n.put(Integer.valueOf(354), "minecraft:cake");
/* 368 */     n.put(Integer.valueOf(355), "minecraft:bed");
/* 369 */     n.put(Integer.valueOf(356), "minecraft:repeater");
/* 370 */     n.put(Integer.valueOf(357), "minecraft:cookie");
/* 371 */     n.put(Integer.valueOf(358), "minecraft:filled_map");
/* 372 */     n.put(Integer.valueOf(359), "minecraft:shears");
/* 373 */     n.put(Integer.valueOf(360), "minecraft:melon");
/* 374 */     n.put(Integer.valueOf(361), "minecraft:pumpkin_seeds");
/* 375 */     n.put(Integer.valueOf(362), "minecraft:melon_seeds");
/* 376 */     n.put(Integer.valueOf(363), "minecraft:beef");
/* 377 */     n.put(Integer.valueOf(364), "minecraft:cooked_beef");
/* 378 */     n.put(Integer.valueOf(365), "minecraft:chicken");
/* 379 */     n.put(Integer.valueOf(366), "minecraft:cooked_chicken");
/* 380 */     n.put(Integer.valueOf(367), "minecraft:rotten_flesh");
/* 381 */     n.put(Integer.valueOf(368), "minecraft:ender_pearl");
/* 382 */     n.put(Integer.valueOf(369), "minecraft:blaze_rod");
/* 383 */     n.put(Integer.valueOf(370), "minecraft:ghast_tear");
/* 384 */     n.put(Integer.valueOf(371), "minecraft:gold_nugget");
/* 385 */     n.put(Integer.valueOf(372), "minecraft:nether_wart");
/* 386 */     n.put(Integer.valueOf(373), "minecraft:potion");
/* 387 */     n.put(Integer.valueOf(374), "minecraft:glass_bottle");
/* 388 */     n.put(Integer.valueOf(375), "minecraft:spider_eye");
/* 389 */     n.put(Integer.valueOf(376), "minecraft:fermented_spider_eye");
/* 390 */     n.put(Integer.valueOf(377), "minecraft:blaze_powder");
/* 391 */     n.put(Integer.valueOf(378), "minecraft:magma_cream");
/* 392 */     n.put(Integer.valueOf(379), "minecraft:brewing_stand");
/* 393 */     n.put(Integer.valueOf(380), "minecraft:cauldron");
/* 394 */     n.put(Integer.valueOf(381), "minecraft:ender_eye");
/* 395 */     n.put(Integer.valueOf(382), "minecraft:speckled_melon");
/* 396 */     n.put(Integer.valueOf(383), "minecraft:spawn_egg");
/* 397 */     n.put(Integer.valueOf(384), "minecraft:experience_bottle");
/* 398 */     n.put(Integer.valueOf(385), "minecraft:fire_charge");
/* 399 */     n.put(Integer.valueOf(386), "minecraft:writable_book");
/* 400 */     n.put(Integer.valueOf(387), "minecraft:written_book");
/* 401 */     n.put(Integer.valueOf(388), "minecraft:emerald");
/* 402 */     n.put(Integer.valueOf(389), "minecraft:item_frame");
/* 403 */     n.put(Integer.valueOf(390), "minecraft:flower_pot");
/* 404 */     n.put(Integer.valueOf(391), "minecraft:carrot");
/* 405 */     n.put(Integer.valueOf(392), "minecraft:potato");
/* 406 */     n.put(Integer.valueOf(393), "minecraft:baked_potato");
/* 407 */     n.put(Integer.valueOf(394), "minecraft:poisonous_potato");
/* 408 */     n.put(Integer.valueOf(395), "minecraft:map");
/* 409 */     n.put(Integer.valueOf(396), "minecraft:golden_carrot");
/* 410 */     n.put(Integer.valueOf(397), "minecraft:skull_item");
/* 411 */     n.put(Integer.valueOf(398), "minecraft:carrot_on_a_stick");
/* 412 */     n.put(Integer.valueOf(399), "minecraft:nether_star");
/* 413 */     n.put(Integer.valueOf(400), "minecraft:pumpkin_pie");
/* 414 */     n.put(Integer.valueOf(401), "minecraft:fireworks");
/* 415 */     n.put(Integer.valueOf(402), "minecraft:firework_charge");
/* 416 */     n.put(Integer.valueOf(403), "minecraft:enchanted_book");
/* 417 */     n.put(Integer.valueOf(404), "minecraft:comparator");
/* 418 */     n.put(Integer.valueOf(405), "minecraft:netherbrick");
/* 419 */     n.put(Integer.valueOf(406), "minecraft:quartz");
/* 420 */     n.put(Integer.valueOf(407), "minecraft:tnt_minecart");
/* 421 */     n.put(Integer.valueOf(408), "minecraft:hopper_minecart");
/* 422 */     n.put(Integer.valueOf(409), "minecraft:prismarine_shard");
/* 423 */     n.put(Integer.valueOf(410), "minecraft:prismarine_crystals");
/* 424 */     n.put(Integer.valueOf(411), "minecraft:rabbit");
/* 425 */     n.put(Integer.valueOf(412), "minecraft:cooked_rabbit");
/* 426 */     n.put(Integer.valueOf(413), "minecraft:rabbit_stew");
/* 427 */     n.put(Integer.valueOf(414), "minecraft:rabbit_foot");
/* 428 */     n.put(Integer.valueOf(415), "minecraft:rabbit_hide");
/* 429 */     n.put(Integer.valueOf(416), "minecraft:armor_stand");
/* 430 */     n.put(Integer.valueOf(417), "minecraft:iron_horse_armor");
/* 431 */     n.put(Integer.valueOf(418), "minecraft:golden_horse_armor");
/* 432 */     n.put(Integer.valueOf(419), "minecraft:diamond_horse_armor");
/* 433 */     n.put(Integer.valueOf(420), "minecraft:lead");
/* 434 */     n.put(Integer.valueOf(421), "minecraft:name_tag");
/* 435 */     n.put(Integer.valueOf(422), "minecraft:command_block_minecart");
/* 436 */     n.put(Integer.valueOf(423), "minecraft:mutton");
/* 437 */     n.put(Integer.valueOf(424), "minecraft:cooked_mutton");
/* 438 */     n.put(Integer.valueOf(425), "minecraft:banner");
/* 439 */     n.put(Integer.valueOf(426), "minecraft:end_crystal");
/* 440 */     n.put(Integer.valueOf(427), "minecraft:spruce_door");
/* 441 */     n.put(Integer.valueOf(428), "minecraft:birch_door");
/* 442 */     n.put(Integer.valueOf(429), "minecraft:jungle_door");
/* 443 */     n.put(Integer.valueOf(430), "minecraft:acacia_door");
/* 444 */     n.put(Integer.valueOf(431), "minecraft:dark_oak_door");
/* 445 */     n.put(Integer.valueOf(432), "minecraft:chorus_fruit");
/* 446 */     n.put(Integer.valueOf(433), "minecraft:chorus_fruit_popped");
/* 447 */     n.put(Integer.valueOf(434), "minecraft:beetroot");
/* 448 */     n.put(Integer.valueOf(435), "minecraft:beetroot_seeds");
/* 449 */     n.put(Integer.valueOf(436), "minecraft:beetroot_soup");
/* 450 */     n.put(Integer.valueOf(437), "minecraft:dragon_breath");
/* 451 */     n.put(Integer.valueOf(438), "minecraft:splash_potion");
/* 452 */     n.put(Integer.valueOf(439), "minecraft:spectral_arrow");
/* 453 */     n.put(Integer.valueOf(440), "minecraft:tipped_arrow");
/* 454 */     n.put(Integer.valueOf(441), "minecraft:lingering_potion");
/* 455 */     n.put(Integer.valueOf(442), "minecraft:shield");
/* 456 */     n.put(Integer.valueOf(443), "minecraft:elytra");
/* 457 */     n.put(Integer.valueOf(444), "minecraft:spruce_boat");
/* 458 */     n.put(Integer.valueOf(445), "minecraft:birch_boat");
/* 459 */     n.put(Integer.valueOf(446), "minecraft:jungle_boat");
/* 460 */     n.put(Integer.valueOf(447), "minecraft:acacia_boat");
/* 461 */     n.put(Integer.valueOf(448), "minecraft:dark_oak_boat");
/* 462 */     n.put(Integer.valueOf(449), "minecraft:totem_of_undying");
/* 463 */     n.put(Integer.valueOf(450), "minecraft:shulker_shell");
/* 464 */     n.put(Integer.valueOf(451), "");
/* 465 */     n.put(Integer.valueOf(452), "");
/* 466 */     n.put(Integer.valueOf(453), "");
/* 467 */     n.put(Integer.valueOf(454), "");
/* 468 */     n.put(Integer.valueOf(455), "");
/* 469 */     n.put(Integer.valueOf(456), "");
/* 470 */     n.put(Integer.valueOf(457), "");
/* 471 */     n.put(Integer.valueOf(458), "");
/* 472 */     n.put(Integer.valueOf(459), "");
/* 473 */     n.put(Integer.valueOf(460), "");
/* 474 */     n.put(Integer.valueOf(461), "");
/* 475 */     n.put(Integer.valueOf(462), "");
/* 476 */     n.put(Integer.valueOf(463), "");
/* 477 */     n.put(Integer.valueOf(464), "");
/* 478 */     n.put(Integer.valueOf(465), "");
/* 479 */     n.put(Integer.valueOf(2256), "minecraft:record_13");
/* 480 */     n.put(Integer.valueOf(2257), "minecraft:record_cat");
/* 481 */     n.put(Integer.valueOf(2258), "minecraft:record_blocks");
/* 482 */     n.put(Integer.valueOf(2259), "minecraft:record_chirp");
/* 483 */     n.put(Integer.valueOf(2260), "minecraft:record_far");
/* 484 */     n.put(Integer.valueOf(2261), "minecraft:record_mall");
/* 485 */     n.put(Integer.valueOf(2262), "minecraft:record_mellohi");
/* 486 */     n.put(Integer.valueOf(2263), "minecraft:record_stal");
/* 487 */     n.put(Integer.valueOf(2264), "minecraft:record_strad");
/* 488 */     n.put(Integer.valueOf(2265), "minecraft:record_ward");
/* 489 */     n.put(Integer.valueOf(2266), "minecraft:record_11");
/* 490 */     n.put(Integer.valueOf(2267), "minecraft:record_wait");
/* 491 */     n.put(Integer.valueOf(2268), "");
/* 492 */     n.put(Integer.valueOf(2269), "");
/* 493 */     n.put(Integer.valueOf(2270), "");
/* 494 */     n.put(Integer.valueOf(2271), "");
/*     */     
/* 496 */     for (Map.Entry<Integer, String> entry : n.entrySet()) {
/* 497 */       Integer type = (Integer)entry.getKey();
/* 498 */       String name = ((String)entry.getValue()).toLowerCase();
/* 499 */       i.put(name, type);
/*     */     }
/*     */   }
/*     */ }


/* Location:              D:\[ Plugins ] Minecraft - Editar\CoreProtect_2.14.2.jar!\net\coreprotect\model\BlockInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */