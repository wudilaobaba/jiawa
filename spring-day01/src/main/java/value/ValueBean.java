package value;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ValueBean {
	private String name;
	private int age;
	private List<String> city;
	private Set<String> instrest;
	private Map<String,Double> score;
	private Properties db;
	
	
	public String getName() {
		return name;
	}
	public Map getScore() {
		return score;
	}
	public List<String> getCity() {
		return city;
	}
	public void setDb(Properties db) {
		this.db = db;
	}
	public void setScore(Map<String, Double> score) {
		this.score = score;
	}
	public void setInstrest(Set<String> instrest) {
		this.instrest = instrest;
	}
	public void setCity(List<String> city) {
		this.city = city;
	}
	public ValueBean(){
		System.out.println("ValueBean()");
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "ValueBean [name=" + name + ", age=" + age + ", city=" + city + ", instrest=" + instrest + ", score="
				+ score + ", db=" + db + "]";
	}	
}
