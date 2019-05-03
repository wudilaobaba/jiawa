package oo.day04;

public class Test {
	Student[] stuArr;
	Doctor[] docArr;
	Teacher[] teaArr;
	void action(){
		stuArr = new Student[]{
			new Student("王刚",50,"农村","100236980"),
			new Student("葫芦",22,"小卡","125695250"),
			new Student("张刚",50,"长江街","10526980")
		};
		for(int i=0;i<stuArr.length;i++){
			System.out.println(stuArr[i].name+","+stuArr[i].age+","+stuArr[i].address);
			stuArr[i].sayHi();
		}
		
		docArr = new Doctor[]{
			new Doctor("Mike",12,"英格兰",8000),
			new Doctor("JONE",12,"非洲",55)
		};
		for(int i=0;i<docArr.length;i++){
			System.out.println(docArr[i].name+","+docArr[i].age+","+docArr[i].address);
			docArr[i].sayHi();
		}
		
		teaArr = new Teacher[]{
			new Teacher("张老师",45,"厂里",100)
		};
		for(int i=0;i<teaArr.length;i++){
			System.out.println(teaArr[i].name+","+teaArr[i].age+","+teaArr[i].address);
			teaArr[i].sayHi();
		}
		
		System.out.println("====================================以下为向上造型===========");
		
		Persion[] ps = new Persion[]{
			new Student("王刚",50,"农村","100236980"),
			new Student("葫芦",22,"小卡","125695250"),
			new Student("张刚",50,"长江街","10526980"),
			new Doctor("Mike",12,"英格兰",8000),
			new Doctor("JONE",12,"非洲",55),
			new Teacher("张老师",45,"厂里",100)
		};
		for(int i=0;i<ps.length;i++){
			System.out.println(ps[i].name+","+ps[i].age+","+ps[i].address);
			//重写方法被调用时，看的是对象的类型
			ps[i].sayHi();
		}
		System.out.println("====================================以下重写测试===========");
		Persion p1 = new Student("测试学生001",22,"农村1","111");
		Student p2 = new Student("测试学生002",20,"农村2","222");
		p1.sayHi();
		p2.sayHi();
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.action();
	}

}
