package day0627;

/**
 * if~else : 둘 중 하나의 코드가 반드시 실행되어야 할 때.
 * @author user
 */
public class TestIfElse {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		System.out.println( num + "은(는)");
		if ( num % 2 == 0 ) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}//end else

		//입력된 두 번째 arguments를 출력하고 0~100사이라면 "유효 점수"를 출력하고 그렇지 않으면
		//"잘못된 점수"를 출력.
		int score = Integer.parseInt(args[1]);
		System.out.println( score + "점은");
		if ( score > -1 && score < 101 )
		{
			System.out.println("유효범위 점수");
		}else {
			System.out.println("잘못된 점수");
		}//end else
		
		//9602181
		//입력된 세번쨰 arguments를 출력하고, "남자"면 주민번호의 7번째 자리가 1, 3, 5, 7, 9입니다.
		//"여자"면 주민번호의 7번째 자리가 0, 2, 4, 6, 8 입니다.
		
		int rrn = Integer.parseInt(args[2]);
		int pushrrn = rrn;
		System.out.println("입력하신 주민등록번호는 "+rrn+"입니다.");
		rrn %= 10;
		rrn %= 2;
		if ( rrn == 1 )
		{
			System.out.println("입력하신 주민번호 "+ pushrrn +"의 성별은 남자입니다.");
		}else {
			System.out.println("입력하신 주민번호 "+ pushrrn +"의 성별은 여자입니다.");
		}//end else
		
		int score1 = Integer.parseInt(args[3]);
		System.out.println( score1 + "은(는)");
		if ( score1 > 100 ) {
			System.out.println("100보다 작아서 실패");
		}else if (score1 < 0) {
			System.out.println("0보다 작아서 실패");
		}else {
			System.out.println("입력 성공");
		}//end else if
	}//main

}//class
