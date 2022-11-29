package day0623;
/**
삼항(조건)연산자
 - 연산에 필요한 항이 모두 3개 연산자
  ( 연산식 ? 항1 : 항2 ) 괄호를 이렇게 해줘야 연산이 된다.
*/
class Operator6 
{
	public static void main(String[] args) 
	{
		int i = -6;
		System.out.println( i + "는 " + ( i < 0  ? " 음수" : "양수" ) );

		/* 10 % 2 = 0
		     11 % 2  = 1
		*/
		i = 10;
		System.out.println( i + "는 " + ( i % 2 == 0 ? "짝수" : "홀수" ) );

		int score = 50; // -1 또는 100 초과
		//score가 0 ~ 100 사이라면 "유효 점수" 그렇지 않으면 "잘못된 점수" 출력하는 코드를 작성.
		System.out.println( score + "점 은 " + ( ( score < 101 && score > -1 ) ? "유효점수" : "잘못된 점수" ) );

		int temp = 10;
			//~를 사용하여 temp의 값을 같은 값의 음수로 변경하여 출력
		System.out.println("~temp = " + (~temp+1));
		
		System.out.println();
		System.out.println();

	}
}