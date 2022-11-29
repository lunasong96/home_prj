package day0629;

/**
 * 2022년 6월 29일 과제
 * @author user
 */
public class Work0629 {
	
	public void name() {
		System.out.println("송성우");
	}//자신의 이름을 출력하는 일
	
	public char initial()  {
		return  'S';
	}//자신의 이름 이니셜 첫 글자만 반환하는 일

	public void score(int score) {//숫자에 범위를 비교하는 것이기때문에 switch~case 보다는 if를 사용해서 코딩하세요.
			if(score >-1 && score <101) {
				switch (score / 10) {
				case 10:
				case 9:
				case 8:
				case 7:
				case 6: System.out.println("합격"); break;
				case 5: 
				case 4: System.out.println("다른과목 참조"); break;
				default: System.out.println("과락"); break;
				}
			} else {
				System.out.println("잘못된 점수 입니다.");
			}
	}
	
	public void letter(int letter) {
		
		if(letter > 96 && letter <123) {
			System.out.println("소문자입니다.");
			
		}else if( letter > 64 && letter <91 ) {
			System.out.println("대문자입니다.");
			
		} else {
			System.out.println("숫자입니다.");
		}
			
	}
	
	public int BirthDay(int day) {// method명은 소문자로 시작합니다. 
		return 2022-day+1;
	}
	
	public int bigNum(int a, int b) {
		//returnd을 많이 쓰는 것 보다는 값을 변수에 저장하고 가장 마지막에 한번만 리턴하는 문법을 더 권장합니ㅏ다.
		if ( a > b ){
			return a;
		} else if (b > a) {
			return b;
		} else {
			return a;
		}
	}
	
	public static void main(String[] args) {
		Work0629 wz = new Work0629();
		wz.name();
		char initail = wz.initial();
		System.out.println(initail);
		wz.score(70);
		wz.letter(12);
		
		int birthYear = wz.BirthDay(1996);
		System.out.println(birthYear);
		int num = wz.bigNum(2019, 2021);
		System.out.println(num);
	}//main

}//class
