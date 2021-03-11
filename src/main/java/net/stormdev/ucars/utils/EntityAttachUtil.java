package net.stormdev.ucars.utils;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class EntityAttachUtil {
	public static void enforceAttached(final Entity passenger, final Entity vehicle,final double radius){
		/*final List<Player> online = new ArrayList<Player>(Bukkit.getOnlinePlayers());
		Bukkit.getScheduler().runTaskAsynchronously(main.plugin, new Runnable(){

			@Override
			public void run() {
				List<Player> res = new ArrayList<Player>();
				for(Player pl:online){
					if(pl.isOnline() && (SquareDistanceCheck.getShortestXZDistance(pl.getLocation(), vehicle.getLocation())) <= radius){
						res.add(pl);
					}
				}
				
				if(res.size() > 0){
					sendAttached(passenger, vehicle, res.toArray(new Player[res.size()]));
				}
				return;
			}});*/
	}
	
	public static void sendAttached(Entity passenger, Entity vehicle, Player... players){
		if(true){
			return;
		}
		/*int entID = ((CraftEntity)passenger).getHandle().getId();
		int vehId = ((CraftEntity)vehicle).getHandle().getId();
		
		ProtocolManager pm = ProtocolLibrary.getProtocolManager();
		PacketContainer packet = pm.createPacket(PacketType.Play.Server.ATTACH_ENTITY);
		packet.getIntegers().write(0, entID).write(1, vehId);
		for(Player pl:players){
			try {
				pm.sendServerPacket(pl, packet);
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}*/
	}
}
