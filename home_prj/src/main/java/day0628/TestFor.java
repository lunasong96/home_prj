package day0628;

/**
 * for문의 사용.
 * @author user
 */
public class TestFor {

	public static void main(String[] args) {
		
//		for( int i = 0; i < 10; i-- ) { // 10번 실행 for 반복문
//			
//			System.out.println("안녕하세요?"+i);
//			
//		}//10번 실행 for 반복문 END 

		//1에서부터 9까지 증가하는 수를 줄 변경없이 출력해보세요.
		
//		for( int i = 0; i < 10; i++ ) { //1에서 9까지 줄변경 없이 출력하는 반복문
//			
//			System.out.print(" " + i);
//			
//		}//1에서 9까지 줄변경 없이 출력하는 반복문 END
		
		//1에서부터 100까지 1씩 증가하는 수를 줄 변경 없이 출력해보세요.
		
//		for( int i = 1; i < 101; i++ ) { //줄 변경없이 1~100까지 출력하는 반복문
//			
//			System.out.print(" " + i);
//			
//		} //줄 변경없이 1~100까지 출력하는 반복문 END
		
		
		//1에서부터 100까지 1씩 증가하는 수를 홀수만 줄 변경 없이 출력해보세요.
		
//		for( int i = 1; i < 101; i++ ) {//100번 반복수행
//			
//			if( i % 2 == 1 ) { //홀수 조건문
//				System.out.print(" " + i );
//			}
//			
//		} //100번 반복수행 END
		
		//1에서부터 100까지 1씩 증가하는 수를 홀수만 줄 변경 없이 출력해보세요2.
		
//		int cnt = 0;
//		for( int i = 1; i < 101; i += 2 ) {//100번 반복수행
//			
//			cnt++;
//			
//			//if( i % 2 == 1 ) { //홀수 조건문
//			System.out.print(" " + i );
//			//}
//					
//		} //100번 반복수행 END
//		
//		System.out.println("\n반복횟수" + cnt);
		
		//1~100까지 합을 출력
		
//		int num = 0; //정수 저장 변수
//		
//		for( int i = 1; i <101; i++ ) { //100번 반복문
//			
//			num += i; //1~100까지 더해주는 코드
//			
//		} //100번 반복문 END
//		
//		System.out.println(num); //합을 출력
		
		//대문자 A ~ Z 까지를 출력
		
//		for( int i = 65; i < 91; i++ ) { //A ~ Z 반복문1
//			
//			System.out.print( (char) i + " "); //I 출력문
//			
//		}//end for
		
//		for( char i = 'A'; i <= 'Z'; i++ ) { //A ~ Z 반복문2
//			
//			System.out.print(  i + " "); //I 출력문
//			
//		}//end for
		
//		for( char i = 65; i < 91; i++ ) { //A ~ Z 반복문3
//			
//			System.out.print(  i + " "); //I 출력문
//			
//		}//end for
		
		// 1 ~ 9 까지 1씩 증가하는 for문

//		for ( int i = 1; i < 10; i++ ) { //1~9까지 출력 반복문
//			
//			System.out.println( "2 x " + i + " = " + (2 * i) ); //2x1
//										
//		}
		
		//구구단의 단을 입력받아 2~9단일 때 입력단을 사용한 구구단을 출력.
		//그렇지 않으면 "구구단은 2~9까지입니다."를 출력.
		
//		int  mutiple = Integer.parseInt(args[0]); //반복문 변수
//		if( mutiple > 1 && mutiple <10 ) { //구구단 2~9까지 조건문
//			int num = mutiple; //구구단 앞자리 변수
//			for( int i = 1; i < 10; i++ ) { //1~9까지의 반복문
//				System.out.println( num + " x " + mutiple + " = " + (mutiple * i) ); //
//			}//end for
//		} else {
//			System.out.println("구구단은 2~9까지입니다.");
//		}//end if
		
		// 1~100까지 반복시키면서 아래와 같이 출력
		// 1 2 짝 4 5 짝 7 8 짝 ... ( 3의 배수 일 때는 숫자가 아닌 "짝"을 출력)
		
		for( int i = 1; i < 101; i++) { // 1~100까지 반복문
			if ( i % 3 == 0) {
				System.out.print("짝 ");
			} else {
				System.out.print( i + " " );				
			}
			
		} //end if
		
		//소문자 z(122)부터 a까지 출력
		
//		for( int i = 122; i > 96; i--) {
//			System.out.print ((char)i+" ");
//		}
		
		//A(a), B(b), .. Z(z)
//		for(int i = 65; i < 91; i++) {
//			System.out.print( (char)i + "(" + (char)(i+32) + ")" + " " );
//		}
		
	}//main

}//class TestFor
