package day0624;

/**
 * Java 프로그램을 실행할 떄 main method에 입력 값(arguments)을 넣어 프로그램을
 * 동적으로 수행할 수 있다.
 * 
 * 실행법)
 * java 패키지명.클래스명 값 값 값
 * @author user
 */
public class ProgramArguments {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(" 처음 입력 값 "+args[0]);
//		System.out.println(" 두번 째 입력 값 "+args[1]);
//		System.out.println(" 세번 째 입력 값 "+args[2]);
		System.out.println(args[0]+args[1]); //문자열은 연산이 되지 않는다.
		//int i = args[0]; // 참조형데이터형(String에 args)은 기본형 데이터형(int)에 할당 될 수 없음.
		
		//Wrapper class를 사용하여 String을 int로 변환한다.
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2 ) ); //문자열은 연산이 되지 않는다.
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2 ) ); //문자열은 연산이 되지 않는다.
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2 ) ); //문자열은 연산이 되지 않는다.
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2 ) ); //문자열은 연산이 되지 않는다.
		double k = Double.parseDouble(args[0]);
		double l = Double.parseDouble(args[1]);
		System.out.println(k+l);
	} //main

 } //class
