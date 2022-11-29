package day0627;

/**
 * 학점 구하기
 * 90 ~ 100 : A
 * 80 ~ 89 : B
 * 70 ~ 79 : C
 * 60 ~ 69 : D
 * 0 ~ 59 : F
 * @author user
 */
public class TestSwitchCase3 {

	public static final int MONKEY = 0;
	public static final int DOG = 1;
	public static final int CHICKEN = 2;
	public static final int PIG = 3;
	public static final int RAT = 4;
	public static final int COW = 5;
	public static final int TIGER = 6;
	public static final int REBIT = 7;
	public static final int DREGON= 8;
	public static final int SNAKE = 9;
	public static final int HORSE = 10;
	public static final int SHEEP = 11;
	
	
	public static final int GRADE_A_TOP=10;
	public static final int GRADE_A=9;
	public static final int GRADE_B=8;
	public static final int GRADE_C=7;
	public static final int GRADE_D=6;
	
	public static void main(String[] args) {
		int score = 100; //점수
		char grade = 64; //학점을 저장하는 변수
		// A = 65, B = 66, C = 67, D = 68, E= 69 , F=70
		if ( score > -1 && score <101 ) {
		switch ( score / 10 ) {
		case GRADE_D:grade++; //grade++이 4번 동작되므로 grade = 68이 되어 D가 나온다
		case GRADE_C: grade++; //grade++이 3번 동작되므로 grade = 67이 되어 C가 나온다
		case GRADE_B: grade++; //grade++이 2번 동작되므로 grade = 66이 되어 B가 나온다
		case GRADE_A: //grade++이 1번 동작되므로 grade = 65이 되어 A가 나온다
		case GRADE_A_TOP: grade++; break; //grade++이 1번 동작되므로 grade = 65이 되어 A가 나온다
		default: grade+= 6; // grade=70이 되므로 F가 나온다.
		}//switch
		System.out.println(score + "점의 학점은 "+ grade);
		} else {
			System.out.println(score + "점 올바른 점수 아님.");
		}
		//0 - 원숭이 , 1 - 개, 2 - 닭, 3 - 돼지, 4 - 쥐, 5 - 소, 6 - 호랑이, 7 - 토끼, 8 - 용, 9 - 뱀, 10 - 말, 11 - 양 
		int birth = 1995;
		//switch 띠 출력하는 코드 작성.
		if (birth > -1 && birth <10000 )
		{
			switch (birth % 12) {
			case TestSwitchCase3.MONKEY: System.out.println(birth+"년생은 원숭이 띠입니다."); break;
			case TestSwitchCase3.DOG: System.out.println(birth+"년생은 개 띠입니다."); break;
			case TestSwitchCase3.CHICKEN: System.out.println(birth+"년생은 닭 띠입니다."); break;
			case TestSwitchCase3.PIG: System.out.println(birth+"년생은 돼지 띠입니다."); break;
			case TestSwitchCase3.RAT: System.out.println(birth+"년생은 쥐 띠입니다."); break;
			case TestSwitchCase3.COW: System.out.println(birth+"년생은 소 띠입니다."); break;
			case TestSwitchCase3.TIGER: System.out.println(birth+"년생은 호랑이 띠입니다."); break;
			case TestSwitchCase3.REBIT: System.out.println(birth+"년생은 토끼 띠입니다."); break;
			case TestSwitchCase3.DREGON: System.out.println(birth+"년생은 용 띠입니다."); break;
			case TestSwitchCase3.SNAKE: System.out.println(birth+"년생은 뱀 띠입니다."); break;
			case TestSwitchCase3.HORSE: System.out.println(birth+"년생은 말 띠입니다."); break;
			case TestSwitchCase3.SHEEP: System.out.println(birth+"년생은 양 띠입니다."); break;
			default: System.out.println("잘못된 년도 입니다."); break;
		}
		} else {
			System.out.println("잘못 입력된 년도 입니다.");
		}
		
	}//main

}//class
