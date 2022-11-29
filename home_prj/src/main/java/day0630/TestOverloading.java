package day0630;

/**
 * 같은 이름의 method를 여러개 작성하는 것.
 * method overloading 선언
 * @author user
 */
public class TestOverloading {

	/**
	 * 별 하나를 출력하는 method
	 */
	public void printStar() {
		System.out.print("☆");
	}//printStar
	
	/**
	 * 별 여러 개를 출력하는 method
	 * @param cnt
	 */
	public void printStar(int cnt) {
		for(int i = 0; i < cnt; i++) {
			System.out.print("★");
		}//end for
	}//printStar
	
	public static void main(String[] args) {
		//System.out.println());
		//1. 객체화
		TestOverloading to = new TestOverloading();
		//2. method 호출
		to.printStar();
		to.printStar();
		to.printStar(5);
	}//main
}//class
