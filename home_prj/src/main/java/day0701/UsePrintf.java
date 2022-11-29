package day0701;

/**
 * JDK1.5에서 부터 지원되는 console 출력 method
 * @author user
 */
public class UsePrintf {

	public static void main(String[] args) {
		int day = 1;
		System.out.println("안녕하세요?"+day+"일 입니다.");//출력 메세지와 출력값이 섞여 사용.
		System.out.printf("안녕하세요? %d일 입니다.", day);//출력메세지와 출력값이 분리되어 사용
		
		System.out.printf("정수출력 %d\n", day);
		double d =2022.0701;
		System.out.printf("실수출력 %f\n", d);
		char c = 'A';
		System.out.printf("문자출력 %c\n", c);
		String str = "어쩔티비 저쩔티비 우짤래미";
		System.out.printf("문자열출력 %s\n", str);
		System.out.printf("[%d][%6d][%-6d]\n",2022,2022,2022);
		System.out.printf("[%c][%6c][%-6c]\n",'A','A','A');
		System.out.printf("[%.2f][%10.2f][%-10.2f]\n",2022.0701,2022.0701,2022.0701);
		System.out.printf("[%s][%5s][%-5s]\n","차승주","차승주","차승주");
		//291쪽 배열, 등등 
	}//main
}//class
