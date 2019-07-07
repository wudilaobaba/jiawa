package map;

import java.util.HashMap;

/**
 * 作为key的类，如果不在该key的类中很好的重写equals和hashCode方法，会造成HashMap工作故障
 * @author Administrator
 */
public class MapHashCodeDemo06 {
	public static void main(String[] args) {
		HashMap<Player,String>map = new HashMap<>();
		map.put(new Player(1), "吃鸡");
		map.put(new Player(2), "英雄联盟");
		map.put(new Player(3), "英雄联盟");
		Player one = new Player(1);
		System.out.println(map.get(one));
	}
}

class Player{
	private int id;
	public Player(int id){
		this.id = id;
	}
	
	//Source-- GeneratorHashCode()即可生成hashCode和equals方法
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
//	public boolean equals(Object obj){
//		if(this==obj){
//			return true;
//		}
//		if(obj==null){
//			return true;
//		}
//		if(obj instanceof Player){
//			Player p = (Player)obj;
//			return p.id == this.id;
//		}
//		return false;
//	}
}