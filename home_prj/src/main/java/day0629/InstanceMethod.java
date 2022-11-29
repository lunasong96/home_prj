package day0629;

/**
 * @author user
 *
 */
public class InstanceMethod {

	public void duplicationJop() {
		
		for(int i = 1; i < 10;  i++) {
			System.out.println(" 9 x "+i + " = " + (9 * i) );
		}//end for i
		
	}//duplicationJop
	
	public static void main(String[] args) {
		//직접호출할 수 없다.
		
		//1. 객체화
		InstanceMethod im = new InstanceMethod();
		//2. method 호출
		im.duplicationJop();
		
		im.duplicationJop();
		im.duplicationJop();
		
		
	}//main

}//class
