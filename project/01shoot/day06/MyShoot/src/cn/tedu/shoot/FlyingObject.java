package cn.tedu.shoot;
import java.util.Random;
//所有飞行物的超类
public class FlyingObject {
	int width;
	int height;
	int x;
	int y;
	//以下的构造函数是专门给大敌机、小敌机、小蜜蜂提供的
	FlyingObject(int width, int height){
		Random rand = new Random();
		this.width = width;
		this.height = height;
		this.x = rand.nextInt(400-this.width);
		this.y = -this.height;
	}
	//以下的构造函数是专门给英雄机、子弹、天空提供的...
	FlyingObject(int width, int height, int x, int y){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	void step(){
		System.out.println("飞行物移动啦");
	}
}
