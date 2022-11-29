package day0629.sub;

import day0629.TestModifiers2;

/**
 * 같은 패키지의 다른 클래스에서 존재하는 인스턴스 변수의 사용.
 * public
 * @author user
 */
public class TestModifiers3 {

	public int i;
	protected int j;
	int k;
	private int l;
	public static void main(String[] args) {
//		i = 10; //인스턴스 변수는 총 2단계로 사용되는데 이전 단계가 없어서 에러. (직접 사용불가)
		//1. 객체화) 클래스명 객체명 = new 클래스명();
		TestModifiers2 tm=new TestModifiers2();
		//2.사용)
		System.out.println("public : " + tm.i);
//		System.out.println("protected : " + tm.j);
//		System.out.println("default : " + tm.k);
//		System.out.println("private : " + tm.l);
	}

}
