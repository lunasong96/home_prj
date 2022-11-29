package day0628;

/**
 * 예습 contiune; p230 ~ p240 2.5절 객체 배열 전까지. 
 * 246p 변수와 메소드, 247p 인스턴스 변수 p246~ p260
 *과제 1. 구구단 전체 단 출력.(다중for문)
 * 2 x 1 = 2 3 x 1 = 3 .. 9 x 1 = 9
 * 2 x 9 = 18 3 x 9 = 27 .. 9 x 9 = 81
 * 과제 2. 아래와 같이 출력
 * 0
 *  1
 *   2
 *    3
 *     4
 *      5
 *       6
 *        7
 *         8
 *          9
 * @author user
 */
public class Work0628 {

	public static void main(String[] args) {
		//과제 1. 구구단 옆으로 출력
		for (int i = 2, j=1; j < 10; j++) { // j를 밑으로 증가시키는 반복문
			
			for(i=2; i < 10; i++) { //i를 옆으로 증가시키는 반복문
				System.out.print( i + " x " + j + " = " + (i * j) + "\t" );
				//System.out.print(" ");// 줄바꿈
				
			}//end for i
			System.out.println(" ");// 줄바꿈
		}//end for j
		System.out.println("--------------------------------------------------------------------------------");
		//과제 2. 아래와 같이 출력
		for( int k = 0; k < 10; k++) {
			
			for(int p = 0; p < k; p++) {
				System.out.print(" ");
			}//end for p
			System.out.println(k);
		}//end for k
		
	}//main
}//class
