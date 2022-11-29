package day0627;

/**
 * 단일 if: 조건에 맞을 때에만 코드를 실행해야 할 때.
 * @author user
 */
public class TestIf {

	public static void main(String[] args) {
		
		//절대 값 구하여 출력.
		int i = -6;//필수코드
		
		if ( i < 0 ) { //선택코드를 실행하기 위한 조건. 즉, 
			i = -i; // 절대값으로 변환하는 코드, 선택 코드
		}//end if( i < 0 )
		
		System.out.println( i );
		
		//문자열은 같은지만 ==보다는 equals method를 사용하여 비교한다.
		
		System.out.println(args[0]);
		if( args[0].equals("송성우") )
		{
			System.out.print("본인");
		}//end if
		System.out.println("등판!!!");
		
		//args[1]을 출력하고, args[1]이 짝수일 때만 "짝수" 메세지를 출력
		int remainder = Integer.parseInt(args[1]);
		System.out.println("입력된 args[1]의 값은 "+remainder+"입니다.");
		remainder %= 2;
		if( remainder == 0) // %2로 나누어 주었을 때 0이 나오면 짝수이다.
		{
			System.out.println("args[1]의 값"+Integer.parseInt(args[1])+"은 짝수입니다.");
		}
		else if( remainder == 1) //%2로 나누어 주었을 때 1이 나오면 홀수이다.
		{
			System.out.println("args[1]의 값"+Integer.parseInt(args[1])+"은 홀수입니다.");
		}
	}//main

}//class
