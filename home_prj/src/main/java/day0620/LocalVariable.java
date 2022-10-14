package day0620;

/**
 * 지역변수의 사용.<br>
 * 1. 선언)
 * 데이터형 변수명;<br>
 * 2. 값 할당)
 * 변수명 = 값;<br>
 * 값 사용)
 * System.out.println(변수명);
 * @author user
 */
public class LocalVariable {

	public static void main(String[] args) {
		//1. 선언) 데이터형 변수명; //변수명은 {}(Local)안에서 유일하다.
		int age;
		//2. 값 할당)
		age = 20;
		//3. 값 사용 : 출력, 연산, 재할당
		System.out.println("나이는 " + age); //변수에 할당된 값이 출력된다.
		//--------------------------주의--------------------------//
		//같은 이름의 변수는 선언할 수 없다.
		//String age;
		//초기화 하지 않는 변수를 사용하면 Error가 발생한다.
		int i;
		//3. 사용
		//System.out.println(i);
		//지역변수의 초기화. (지역변수는 초기화 하지 않으면 에러가 발생하므로
		//가급적이면 초기화하여 사용한다.)
		i = 0;
		System.out.println(i);
		
		//변수명은 한글로 사용가능하다.
		//but, 가급적이면 사용하지 않는다. 아무도 사용하지 않는다!!)
		int 나이 = 25;
		System.out.println("나이 : " + 나이);
		
		//변수명은 숫자로 시작할 수 없다.
		//int myAge1; //숫자가 뒤에 있어서 사용 가능하다.
		//int 1myAge; // 숫자로 시작해서 에러가 발생한다.
		
		//현재년도는 2022년이고 내 나이는 xx살이다. 현재년도와 내 나이를 저장하는
		//변수를 만들고, 연산하여 태어난 해를 출력.
		//2022년 나이는 xx살 태어난 해는 xxxx년
		//1. 변수선언
		int year;
		int myAge;
		int happyYear;
		//값. 할당
		year = 2022;
		myAge = 27;
		happyYear = year - myAge +1;
		//3. 출력
		System.out.println(year + "년 나이는 " + myAge + "살 태어난 해는 " + happyYear + "년");
		//변수는 사용하기 전에 어떤 값이 할당되어 있는지 확인해야한다.
		//같은 변수를 사용했지만 다른 값이 사용된다.
	}//main
}//class
