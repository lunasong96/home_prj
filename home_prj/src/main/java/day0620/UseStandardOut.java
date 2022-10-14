package day0620;

public class UseStandardOut {

	public static void main(String[] args) {
		//println은 출력 후 줄 변경.
		System.out.println("오늘은 월요일입니다.");
		System.out.println("안녕자바");
		//print는 출력 후 줄변경을 하지 않는다.
		System.out.println("오늘은 월요일입니다.");
		System.out.println("안녕자바");
		//println();을 사용하면 줄을 변경해준다.
		System.out.println();
		System.out.println("다양한 값의 출력");
		//정수 출력
		System.out.println(2022);
		//실수 출력
		System.out.println(2022.06);
		//문자 : '로 묶여진 한자, '는 출력되지 않는다.
		System.out.println('A');
		System.out.println('1');
		System.out.println('가');
		//System.out.println('AA'); //'는 char(문자)형으로 한 글자만 사용할 수 있다.
		//문자열 : "로 묶여진 여러문자, "는 출력되지 않는다.
		System.out.println("Hello Java!!!");
		System.out.println("2022");// console에서는 정수와 문자가 구분되지 않는다.
	}//main
}//class
