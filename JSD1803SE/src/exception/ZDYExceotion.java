package exception;

public class ZDYExceotion {

	public static void main(String[] args) {
		Person09 p = new Person09();
		try {
			p.setAge(1000);
		} catch (IllegaAgeException08 e) {
			e.printStackTrace();
		}

	}

}
