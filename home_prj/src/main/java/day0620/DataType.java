package day0620;

public class DataType {

	public static void main(String[] args) {
		//정수형 : byte, short, int, long가 있다.
		byte a = 10;
		short b = -32768;
		int c = 30;
		long d = 40;
		
		//long e = 5_900_000_000L;형명시를 사용하여 정수 literal의 크기를 변경한다.
		//정수가 길 때에는 가독성 향상을 위해서 값에 _를 넣을 수 있다. 
		//_는 console에 출력되지 않는다.
		long e = 5_900_000_000l;
		
		System.out.println("byte : " + a + ", short : " + b + ", int : " + c + ", long d : "
				+ d + ", long e : " + e);
		//문자상수 ('A')를 저장할 수 있는 문자 데이터형 : char
		//상수를 할당하면 상수에 해당하는 unicode 값이 할당 된다.
		//(unicode 값은 음수가 존재하지 않는다.) => unsignde Value라고 말할 수 있다.
		char f = 'A';
		char g = '0';
		char h = '가';
		float i = 6.21f;
		
		//char형을 출력하면 저장된 코드 값에 해당하는 문자가 출력된다.
		System.out.println("char f : " + f + ", char g : " + g + ", char h : " + h 
				+ "float i : " + i);
		
		//실수 상수 (6.2)를 저장할 수 있는 실수 데이터형 : float, double
		float j = 2022.06f;
		double k = 3.14;
		double l = 2022.06;
		System.out.println("float j : " + j + ", double k : " + k + ", double l : " + l);
		
		//불린상수 : true 또는 false를 저장할 수 있는 데이터형 : boolean
		boolean m = true;
		boolean n = false;
		System.out.println("boolean m : " + m + ", boolean n : " + n);
		char o = 'A';//65
		char p = 'B';//66
		String name = "java";
		
		System.out.println(name);
		//println에서 console로 출력되는 값은 unicode의 값이 출력된다.
	}//main
}//class
