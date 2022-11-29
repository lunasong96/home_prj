package day0623;
/**

*/
class Work0623
{
	public static void main(String[] args) 
	{
		//------1번 문제------//
		int i = 12;
		System.out.println(" ~i = " + (~i+1) );
		//~같이 보수연산자를 사용하면 1의보수 연산이므로 12 => -13이 되므로 2의 보수연산처럼 만들기 위해서는 +1을 해줘야 -12가 된다.
		//------2번 문제------//
		int temp1 = 10, temp2 =20;
		System.out.println( ++temp1 + temp2-- ); // 11 + 20 = 31
		/* ++temp1는 연산자가 전열에 있으므로 10에서 +1이 되어 11이 대입되고  
		temp2--는 연산자가 후열에 있으므로 20이 대입되어 11 + 20 = 31이 된다.
		되고 그 후 temp2는 -1 하여 19가 된다.
		*/
		System.out.println( "temp1 = " + temp1 + " / temp2 = " + temp2 ); // 11+19 = 30
		/*즉 위의 주석 설명으로 인해 temp1는 위아래 식 모두 11이지만
		temp2는 위에서는 20이지만 아래식에서는 19가 대입된다.
		*/
		//------3번 문제------//
		int temp3 = 0;
		temp3 = Integer.MAX_VALUE;
		System.out.println("Integer.MAX_VALUE의 값 : " + temp3 );
		//int = Integer이며 Integer.MAX_VALUE는 Integer에 있는 최대값을 가져오는 것이다.
		System.out.println(temp3 << 4);
		//왼쪽으로 4번 Shift를 하면 -16이 나온다.
		//------4번 문제------//
		System.out.println(temp3 & 65535 );
		System.out.println(temp3 & (int)Character.MAX_VALUE );
		System.out.println(temp3 & 0x0000FFFF );
		/*
		Integer.MAX_VALUE는 0111 1111 / 1111 1111 / 1111 1111 / 1111 1111이다.
											0111 1111 / 1111 1111 / 1111 1111 / 1111 1111
		하위 2Byte를 출력하려면 & 65535(0x0000FFFF, (int)Character.MAX_VALUE )를 대입하면
		0000 0000 0000 0000 1111 1111 1111 1111가 되므로 하위 2Byte만 출력되게 되어 65535가 출력된다.
		*/
	}
}
