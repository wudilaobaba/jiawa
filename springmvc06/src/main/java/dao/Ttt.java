package dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("ttt")
public class Ttt {
	@Value("100")
	private int x;
	@Value("200")
	private int y;
	public void say() {
		System.out.println("Œ“ «TTT");
	}
	@Override
	public String toString() {
		return "Ttt [x=" + x + ", y=" + y + "]";
	}
	
	
}
