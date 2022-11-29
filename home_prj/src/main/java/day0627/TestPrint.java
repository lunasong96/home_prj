package day0627;

/**
 * System.out.println method가 프로그램 실행속도 끼치는 영향
 * @author user
 */
public class TestPrint {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();//현재시간을 ms로 반환하는일.
		int temp = 0;
		for(int i = 0; i < 1000; i++ )
		{
			temp += i;
//			System.out.println(i+ ", 누적값 : " + temp );
		} //end for;
		
		long endTime = System.currentTimeMillis();//현재시간을 ms로 반환하는일.
		System.out.println("0~999 까지 누적합 한 결과 "+temp);
		System.out.println("프로그램 실행 시간" + (endTime - startTime) + "ms");
	}//main

}//class
