package dao;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
@Component("foo")
public class Foo implements Serializable {
	@Resource(name="ttt")
	private Ttt t;
	public void talk() {
		System.out.println(t);
	}
}
