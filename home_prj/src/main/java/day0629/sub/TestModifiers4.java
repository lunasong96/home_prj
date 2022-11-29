package day0629.sub;

import day0629.TestModifiers;

/**
 *  자식 클래스에서 다른 패키지의 부모클래스의 존재하는 인스턴스 변수의 사용.
 *  
 *  TestModifiers - 부모클래스.
 *  TestModeifiers4 - 자식 클래스.
 *  
 *  public, protected 사용 가능.
 *  default, private은 사용 불가.
 * @author user
 */
public class TestModifiers4 extends TestModifiers {
	
	public static void main(String[] args) {
//		i=10;//인스턴스 변수는 총 2단계로 사용되는데 이전 단계가 없어서 에러. (직접 사용불가)
		//1. 객체화)  클래스명 객체명=new 클래스명();
		TestModifiers4 tm=new TestModifiers4();
		//2.사용)
		System.out.println("public : " + tm.i  );
		System.out.println("protected : " + tm.j  );
//		System.out.println("default : " + tm.k  );
//		System.out.println("private : " + tm.l  );
	}//main

}//class
