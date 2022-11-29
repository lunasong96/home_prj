package day0628;

/**
 * do~while : 시작과 끝을 모를 때 사용하는 반복문. 최소 1번 수행 최대 조건까지 수행. !!조건을 나중에 물어보기 때문에 무조건
 * 1번은 실행되는 것이 do~while의 특징이다.
 * 
 * @author user
 */
public class TestDoWhile {

	public static void main(String[] args) {

		int i = 10; // 초기 값;
		do {
			System.out.println("반복 " + i); // 반복수행문장
			i++; // 증.감식
		} while (i < 10); // 조건식

	}// main
}// class
