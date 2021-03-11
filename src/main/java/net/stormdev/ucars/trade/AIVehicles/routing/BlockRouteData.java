package net.stormdev.ucars.trade.AIVehicles.routing;

import org.bukkit.block.BlockFace;

import java.io.Serializable;

public class BlockRouteData implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private BlockFace direction;
	private RouteBlockType type;
	
	public BlockRouteData(RouteBlockType type, BlockFace direction){
		this.direction = direction;
		this.type = type;
	}
	
	public BlockFace getDirection(){
		return this.direction;
	}
	
	public void setDirection(BlockFace dir){
		this.direction = dir;
	}
	
	public void setType(RouteBlockType type){
		this.type = type;
	}
	
	public RouteBlockType getType(){
		return this.type;
	}
	
	public boolean isJunction(){
		return type == null ? false : type.equals(RouteBlockType.JUNCTION);
	}
}
