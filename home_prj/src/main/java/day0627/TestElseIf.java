package day0627;

/**
 * else if : 연관된 여러 조건을 비교할 때 사용
 * @author user
 */
public class TestElseIf {

	public static void main(String[] args) {
		//수를 입력받아 판정을 내리는 프로그램.
		// 0점 미만인 경우 : 점수는 0점보다 작을 수 없습니다.
		// 100점 초과인 경우 : 점수는 100점보다 클 수 없습니다.
		// 그렇지 않는 경우 : "입력성공"을 출력
		int score = Integer.parseInt(args[0]);
		System.out.print( score + "점은");
		if ( score < 0 ) {
			System.out.println(" 0점보다 작을 수 없습니다.");
		}else if (score > 100) {
			System.out.println(" 100점보다 클 수 없습니다.");
		}else {
			System.out.println(" 입력 성공.");
		}//end else if
		
		//두 번쨰 arguments에는 이름이 입력된다.
		//이름을 출력하고 
		//이름이 "차승주" 반장을 출력하고, 이름이 자신의 이름이면 "본인"을 출력하고
		//그렇지 않으면 "평민"을 출력한다.
		System.out.println(args[1]);
		if (args[1].equals("차승주"))
		{
			System.out.println("반장");
		} else if (args[1].equals("송성우"))
		{
			System.out.println("본인");
		} else {
			System.out.println("평민");
		}
	
		
	}//main

}//class
