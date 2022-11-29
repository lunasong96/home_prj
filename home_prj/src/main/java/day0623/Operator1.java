package day0623;
/**
단항연산자
~, !, +, -, ++, --
*/

class  Operator1
{
	public static void main(String[] args) 
	{
		//~ (tilde) : 1의 보수 연산 ( 부호와 값이 모두 변경된다. ) //잘 사용하지 않음.
		int i = 10;
		int j = -10;
		System.out.println("~"+ i + " = "+ ~i); //~양수 : 부호변경 1감소
		System.out.println("~"+ j + " = "+ ~j); //~음수 : 부호변경 1감소

		// ! ( NOT ) : true < - > false로 변경
		boolean flag = true, flag2 = false;
		System.out.println("!"+ flag+ " = "+ !flag);
		System.out.println("!"+ flag2+ " = "+ !flag2);
		
		//System.out.println( !6 < 23 ); // 6앞에 !를 쓰는 것이 아니라 !(6 < 23)으로 사용해줘야 한다.
		System.out.println( "! (6 < 23) "+ !(6 < 23) ); //즉 이렇게 사용해주어야 error가 발생하지 않는다.
		
		//+ :  아무일도 안함.(형식적제공)
		System.out.println("+" + i + " = " + +i); // +양수 : 양수
		System.out.println("+" + j + " = " + +j); // +음수 : 음수

       //- : 2의 보수 연산.( 값은 그대로 두고 부호만 변경 )
	   System.out.println("+" + i + " = " + -i); // +양수 : 음수
	   System.out.println("+" + j + " = " + -j); // +음수 : 양수

	   //++ : 증가연산 : 대상체의 값을 변경
	   ++i; //전위: 10 -> 11
	   i++; //후위: 10 -> 11
	   System.out.println("증가연산 후 i : " + i);

	   //-- : 감소연산
	   --i; //전위: 12 -> 11 
	   i--; //후위: 11 -> 10
	   System.out.println("감소연산 후 i : " + i);

	   //전위와 후위가 대입연산자와 함께 사용되면 다른 값을 대입한다.
	   i = 6;
	   int result = 0;

	   result = ++i; //전위 연산 : 내 것 먼저
	   System.out.println("i: "+ i + ", result : "+ result); // 7 7
////////////////////////////////////////////////////////////////////////////////
		i = 6;
		result = 0;

		result = i++; //후위 연산 : 내 것 먼저
		System.out.println("i: "+ i + ", result : "+ result); // 7 6

		//연산에 참여할 때와 method에 값으로 넣을 때도 같은 동작을 수행
		//method에 값으로 넣을 때
		i=1;
		System.out.println(i++);
		System.out.println("후위 연산 후의 i의 값"+i);
		System.out.println(++i);
		System.out.println("전위 연산 후의 i의 값"+i);

		i = 10;
		result = 20 + ++i; //31이 들어간다. +1 증가 한 후에 i=11이 되고 대입이 된다.
		System.out.println(result);

		i = 10;
		result = 20 + i++; //30이 들어간다. i=10이 먼저 대입되고 +1이 증가 된 후에 11이된다.
		System.out.println(result);


	}//main
}//class