package day0624;
/**
대입연산자.
=
+=, -=, *=, /=, %=,
<<=, >>=, >>>=
&=, |=, ^=
*/

class Operator7 
{
	public static void main(String[] args) 
	{
		//순수 대입
		int i = 6;
		//산술 대입
		i += 6; // i = i + 6;
		i -= 10; // i = i - 10;
		i *= 5; // i = i * 5;
		i /= 3; // i = i / 3;
		i %= 2; // i = i % 2;
		System.out.println( i );
		//쉬프트 대입
		i <<= 5; // i = i << 5; // 0000 0001 << 5 = 0010 0000;
		System.out.println( "---i is---" + i );
		i >>= 2; // i = i >> 2; // 0010 0000 >> 2 = 0000 1000;
		i >>>= 1; // i = i >>> 1; // 0000 1000 >>> 1 = 0000 0100;
		System.out.println( i );
		//비트논리 대입
		i &= 0xf; // i = i & 0xF; 0000 0100 & 0000 1111 = 0000 0100;
		i |= 0xA; // i = i | 0xA; 0000 0100 | 0000 1010 = 0000 1110;
		i ^= 9; // i = i ^ 9; 0000 1110 ^ 0000 1001 = 0000 0111;
		System.out.println( i );

	}//main //main method가 있는 클래스는 java application이라고 한다.
}//class
