package oo.day04;

public class Test {
	Student[] stuArr;
	Doctor[] docArr;
	Teacher[] teaArr;
	void action(){
		stuArr = new Student[]{
			new Student("����",50,"ũ��","100236980"),
			new Student("��«",22,"С��","125695250"),
			new Student("�Ÿ�",50,"������","10526980")
		};
		for(int i=0;i<stuArr.length;i++){
			System.out.println(stuArr[i].name+","+stuArr[i].age+","+stuArr[i].address);
			stuArr[i].sayHi();
		}
		
		docArr = new Doctor[]{
			new Doctor("Mike",12,"Ӣ����",8000),
			new Doctor("JONE",12,"����",55)
		};
		for(int i=0;i<docArr.length;i++){
			System.out.println(docArr[i].name+","+docArr[i].age+","+docArr[i].address);
			docArr[i].sayHi();
		}
		
		teaArr = new Teacher[]{
			new Teacher("����ʦ",45,"����",100)
		};
		for(int i=0;i<teaArr.length;i++){
			System.out.println(teaArr[i].name+","+teaArr[i].age+","+teaArr[i].address);
			teaArr[i].sayHi();
		}
		
		System.out.println("====================================����Ϊ��������===========");
		
		Persion[] ps = new Persion[]{
			new Student("����",50,"ũ��","100236980"),
			new Student("��«",22,"С��","125695250"),
			new Student("�Ÿ�",50,"������","10526980"),
			new Doctor("Mike",12,"Ӣ����",8000),
			new Doctor("JONE",12,"����",55),
			new Teacher("����ʦ",45,"����",100)
		};
		for(int i=0;i<ps.length;i++){
			System.out.println(ps[i].name+","+ps[i].age+","+ps[i].address);
			//��д����������ʱ�������Ƕ��������
			ps[i].sayHi();
		}
		System.out.println("====================================������д����===========");
		Persion p1 = new Student("����ѧ��001",22,"ũ��1","111");
		Student p2 = new Student("����ѧ��002",20,"ũ��2","222");
		p1.sayHi();
		p2.sayHi();
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.action();
	}

}
