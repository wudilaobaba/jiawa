package map;

import java.util.HashMap;

/**
 * ��Ϊkey���࣬������ڸ�key�����кܺõ���дequals��hashCode�����������HashMap��������
 * @author Administrator
 */
public class MapHashCodeDemo06 {
	public static void main(String[] args) {
		HashMap<Player,String>map = new HashMap<>();
		map.put(new Player(1), "�Լ�");
		map.put(new Player(2), "Ӣ������");
		map.put(new Player(3), "Ӣ������");
		Player one = new Player(1);
		System.out.println(map.get(one));
	}
}

class Player{
	private int id;
	public Player(int id){
		this.id = id;
	}
	
	//Source-- GeneratorHashCode()��������hashCode��equals����
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