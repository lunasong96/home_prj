package day0623;
/**
산술 연산자
+, -, *, /, %
*/
class Operator2 
{
	public static void main(String[] args) 
	{
		/*
		/는 몫이 나온다
		*/
		int i = 23, j = 6;
		System.out.println(i+ " / " + j + " = " + i/j); // 정수 / 정수 = 정수;

		double d =23, c = 6; // d = 23.0; c = 6.0;
		System.out.println(d+ " / " + c + " = " + d/c); // 실수 / 정수 = 실수;
		System.out.println(i+ " / " + c + " = " + i/c); // 정수 / 실수 = 실수;
		System.out.println(d+ " / " + j + " = " + d/j); // 실수 / 정수 = 실수;
///////////////////////////////////////////////////////////////////////
		/*
		나머지가 나온다.
		*/
		System.out.println(i+ " % 2 = " + i % 2 ); //1

		int birth = 1996;
		System.out.println(birth+ "년 생은 " + birth % 12);
		//0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 중 하나가 나온다. 그 이상은 나오지 않는다.
		/*
		
		0 - 원숭이 , 1 - 개, 2 - 닭, 3 - 돼지, 4 - 쥐, 5 - 소, 6 - 호랑이, 7 - 토끼, 8 - 용, 9 - 뱀, 10 - 말, 11 - 양 
		*/
	}//main
}//class
