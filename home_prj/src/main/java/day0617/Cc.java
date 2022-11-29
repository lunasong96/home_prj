package day0617;
import java.util.*; // Scanner를 사용하기 위해 추가
public class Cc
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in); //Scanner클래스의 객체를 생성
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input1 = scanner.nextLine(); //입력받은 내용을 input에 저장
		int x = Integer.parseInt(input1); //입력받은 내용을 int타입의 값으로 전환
		System.out.print("두자리 정수를 하나 입력해주세요,>");
		String input2 = scanner.nextLine();
		int y = Integer.parseInt(input2);
		System.out.println("첫 번쨰 입력내용:"+x);
		System.out.println("첫 번쨰 입력내용:"+y);
		int tmp;
		tmp = x;
		x = y;
		y = tmp;
		System.out.println("변환한 x의 값"+x);
		System.out.println("변환한 y의 값"+y);
	}
}