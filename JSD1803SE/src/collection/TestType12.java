package collection;

public class TestType12 {
	public static void main(String[] args) {
		Type11<Integer,String> t = new Type11<Integer,String>(1,"2");
		t.setX(52);
		int x = t.getX();
		
		Type11<String,Integer> t2 = new Type11<String,Integer>("1",2);
		
		Type11<String,String> t3 = new Type11<String,String>("һ","��");
		t3.setX("��");
		String s = t3.getX();
	}

}
