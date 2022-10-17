package day0620;

/*
 * Constant : 변수를 상수처럼 사용하기.(기준 값)
 * 작성법) public static final 데이터형 상수명 = 값;
 * 사용법) 클래스명.상수명;
 * */

public class Constant {
	
	public static final int MAX_SCORE = 100; //변경되지 않는 기준 값.

	public static void main(String[] args) {
		int maxScore = 100;
		int myScore = 85;
		//MAX_SCORE = 99; //final이 있어 값 변경이 되지 않는다.
		//maxScore=99; //기준 값이 변수인 경우에 값 변경이 가능해진다.
		System.out.println("클래스의 이름을 생략: " + MAX_SCORE);
		System.out.println("클래스의 이름을 사용: " + Constant.MAX_SCORE);
		System.out.println();
		System.out.println(MAX_SCORE - myScore);
		System.out.println("최고점수 : " + MAX_SCORE+"획득점수 : "+myScore+" 두 점수간 차이"
				+ (Constant.MAX_SCORE-myScore)+"점 ");
		System.out.println();
	}
}
