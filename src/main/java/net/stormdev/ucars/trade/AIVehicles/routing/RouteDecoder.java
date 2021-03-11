package net.stormdev.ucars.trade.AIVehicles.routing;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;

import java.util.HashMap;
import java.util.Map;

public class RouteDecoder {
	private static final Map<Material, BlockRouteData> lookup = new HashMap<>(12);
	private static final BlockRouteData DEFAULT_DIRECTION = new BlockRouteData(null, null);
	private static final Material DEFAULT_MATERIAL = Material.BLACK_STAINED_GLASS;

	static {
		lookup.put(Material.WHITE_STAINED_GLASS, new BlockRouteData(RouteBlockType.DIRECTIONAL, BlockFace.NORTH));
		lookup.put(Material.ORANGE_STAINED_GLASS, new BlockRouteData(RouteBlockType.DIRECTIONAL, BlockFace.NORTH_EAST));
		lookup.put(Material.MAGENTA_STAINED_GLASS, new BlockRouteData(RouteBlockType.DIRECTIONAL, BlockFace.EAST));
		lookup.put(Material.LIGHT_BLUE_STAINED_GLASS, new BlockRouteData(RouteBlockType.DIRECTIONAL, BlockFace.SOUTH_EAST));
		lookup.put(Material.YELLOW_STAINED_GLASS, new BlockRouteData(RouteBlockType.DIRECTIONAL, BlockFace.SOUTH));
		lookup.put(Material.LIME_STAINED_GLASS, new BlockRouteData(RouteBlockType.DIRECTIONAL, BlockFace.SOUTH_WEST));
		lookup.put(Material.PINK_STAINED_GLASS, new BlockRouteData(RouteBlockType.DIRECTIONAL, BlockFace.WEST));
		lookup.put(Material.GRAY_STAINED_GLASS, new BlockRouteData(RouteBlockType.DIRECTIONAL, BlockFace.NORTH_WEST));
		lookup.put(Material.LIGHT_GRAY_STAINED_GLASS, new BlockRouteData(RouteBlockType.JUNCTION, null));
		lookup.put(Material.CYAN_STAINED_GLASS, new BlockRouteData(RouteBlockType.CONTINUE, null));
		lookup.put(Material.PURPLE_STAINED_GLASS, new BlockRouteData(RouteBlockType.DIRECTIONAL, BlockFace.UP));
		lookup.put(Material.BLUE_STAINED_GLASS, new BlockRouteData(RouteBlockType.DIRECTIONAL, BlockFace.DOWN));
	}

	public static BlockRouteData getDirection(Material type){
		return lookup.getOrDefault(type, DEFAULT_DIRECTION);
	}

	public static Material getMaterial(RouteBlockType type, BlockFace direction) {
		for (Map.Entry<Material, BlockRouteData> entry : lookup.entrySet()) {
			final BlockRouteData data = entry.getValue();
			if (data.getType().equals(type) && data.getDirection() == direction) {
				return entry.getKey();
			}
		}
		return DEFAULT_MATERIAL;
	}
}
