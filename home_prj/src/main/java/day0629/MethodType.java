package day0629;

/**
 * method의 4가지 형태.
 * 고정 일, 가변 일, 고정 값, 가변 값.
 * @author user
 */
public class MethodType {
	/**
	 * 고정일: 여러번 호출해도 동일한 결과.
	 */
	public void typeA() {
		System.out.println("고정 일: 반환형 없고, 매개변수 없는 형.");
	}//typeA
	
	/**
	 * 가변 일: 입력값에 따라 다른 결과.
	 * @param i
	 */
	public void typeB(int i) {
		System.out.println("가변 일: 반환형 없고, 매개변수 있는 형."+ i);
	}//type B
	
	/**
	 * 고정 값 : 반환형 있고, 매개변수 없음.
	 * 여러번 호출해도 동일한 값이 반환.
	 * 
	 */
	public int typeC() {
		return 29;
	}//type C

	/**
	 * 가변 값: 반환형 있고, 매개변수 있는 형.
	 * 입력값에 따라 다른 값이 반환
	 * @param d 입력값
	 * @return 다른 값
	 */
	public int typeD(double d) {
		return (int)d;
	}//type D

	public static void main(String[] args) {
		MethodType mt = new MethodType();
		mt.typeA();
		mt.typeB(2022);
		int i =mt.typeC();
		System.out.println("고정값 : "+i);
		
		int i2 =mt.typeD(2022.29);
		System.out.println("가변값 : "+i2);
		
		int i3 =mt.typeD(6.29);
		System.out.println("가변값 : "+i3);
		//반환형이 있는 METHOD는 결과를 변수에 저장할 수 있다.
		
		
	}

}
