package day0629;

/**
 * 이름과 나이, 주소 저장 Person
 * @author user
 */
public class Person {
	//객체생성되고 객체마다 각각 저장되어야하는 값은 instance variable로 선언
	
	//모든 객체가 같이 사용하는 값은 static variable로 선언
	String name; //instance variable
	int age;

	static String addr;
	public static void main(String[] args) {

		Person.addr ="서울시 강남구 역삼동";
		Person junho = new Person();
		junho.name = "김준호";
		junho.age = 20;
		Person junsik = new Person();
		junsik.name ="김준식";
		junsik.age = 21;
		Person sujin = new Person();
		sujin.name = "김수진";
		sujin.age = 19;
		
		System.out.println("이름 : "+junho.name+", 나이 : "+junho.name + ", 주소 : "+Person.addr);
		System.out.println("이름 : "+junsik.name+", 나이 : "+junsik.name + ", 주소 : "+Person.addr);
		System.out.println("이름 : "+sujin.name+", 나이 : "+sujin.name + ", 주소 : "+Person.addr);
		
	}//main

}//class
