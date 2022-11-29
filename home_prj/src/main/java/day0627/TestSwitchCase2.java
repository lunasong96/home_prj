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
public class TestSwitchCase2 {

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
	
	public static void main(String[] args) {
		int score = 80; //점수
		char grade = ' '; //학점을 저장하는 변수
		
		if ( score > -1 && score <101 ) {
		switch ( score / 10 ) {
		case 10:
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F';
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
			case TestSwitchCase2.MONKEY: System.out.println(birth+"년생은 원숭이 띠입니다."); break;
			case TestSwitchCase2.DOG: System.out.println(birth+"년생은 개 띠입니다."); break;
			case TestSwitchCase2.CHICKEN: System.out.println(birth+"년생은 닭 띠입니다."); break;
			case TestSwitchCase2.PIG: System.out.println(birth+"년생은 돼지 띠입니다."); break;
			case TestSwitchCase2.RAT: System.out.println(birth+"년생은 쥐 띠입니다."); break;
			case TestSwitchCase2.COW: System.out.println(birth+"년생은 소 띠입니다."); break;
			case TestSwitchCase2.TIGER: System.out.println(birth+"년생은 호랑이 띠입니다."); break;
			case TestSwitchCase2.REBIT: System.out.println(birth+"년생은 토끼 띠입니다."); break;
			case TestSwitchCase2.DREGON: System.out.println(birth+"년생은 용 띠입니다."); break;
			case TestSwitchCase2.SNAKE: System.out.println(birth+"년생은 뱀 띠입니다."); break;
			case TestSwitchCase2.HORSE: System.out.println(birth+"년생은 말 띠입니다."); break;
			case TestSwitchCase2.SHEEP: System.out.println(birth+"년생은 양 띠입니다."); break;
			default: System.out.println("잘못된 년도 입니다."); break;
		}
		} else {
			System.out.println("잘못 입력된 년도 입니다.");
		}
		
	}//main

}//class
