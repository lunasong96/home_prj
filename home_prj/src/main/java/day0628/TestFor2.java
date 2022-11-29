package day0628;

/**
 * 다중 for : 바깥 for가 한 번 동작할 때 안쪽 for은 몇 번 동작하는가?
 * @author user
 */
public class TestFor2 {

	public static void main(String[] args) {

//		for ( int i = 0; i < 5; i++ ) {//5번 반복문
//			
//			System.out.println("바깥 for 시작");
//			for( int j = 0; j < 6; j++ ) {//6번 반복문
//				
//				System.out.println("i = " + i + ", j = " + j );
//				
//			}//end for j
//			System.out.println("바깥 for 끝");
//		}//end for i
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("---------------------------------------------------------------------");
		for ( int i = 2; i < 10; i++ ) {//8번 반복문
			
			System.out.println( i+"단 시작");
			
			for( int j = 1; j < 10; j++ ) {//9번 반복문
				
				System.out.print( i + " x " + j + " = " + ( i * j ) + "   ");
				
			}//end for j
			System.out.println(" "); //줄바꿈
		}//end for i
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		
//		for ( int i = 0; i < 4; i++ ) {
//			
//			for( int j = 0 ; j <= i; j++ ) {
//				
//				System.out.print( i + "  " + j + "  " );
//				
//			}//end for j
//			
//			System.out.println("  ");
//			
//		}//end for i
		
		//////////////////////////////////////////////////////////////////////////////////////////////////
		
//		for ( int i = 0; i < 5; i++ ) { //5번 반복
//			
//			for( int j = i+1; j < 6; j++ ) { // i+1부터 6전까지 반복
//				
//				System.out.print( i + "  " + j + "  " );
//				
//			}//end for j
//			
//			System.out.println("  "); //줄바꿈
//			
//		} //end for i
		
		////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
	}//main

}//class
