package day0630;

/**
 * 마카펜클래스를 사용하여 객체로 만들고 사용하기 위한 클래스
 * @author user
 */
public class UseMarker {

	/**
	 * Java Application
	 * @param args
	 */
	public static void main(String[] args) {
		//마카펜을 사용하기 위한 작업.
		//1. <<instantiate :인스턴스화>> 설계도에서 구현체를 생성.
		Marker black = new Marker();//instance variable가 heap메모리에 올라가면서 초기화 된다.
		//2. 생성된 객체에 필요한 값을 설정하고
		//color를 검은색, 뚜껑을 한개, 몸체를 한개로 설정해보세요.
//		black.color = "검은색" //직접설정 불가 => setter method를 사용.
		//0704일 코드 기본 생성자 추가 후 수정.
//		black.setColor("검은");
//		black.setCap(1);
//		black.setBody(1);
		//데이터형 변수명 = 객체명.method명();
		String color =black.getColor();
		int cap =black.getCap();
		int body =black.getBody();
		
		System.out.println("색 : " + color + "색, 뚜껑의 수 : " + cap + "개, 몸체의 갯수 : " + body +"개" );
		
		//3. 사용
		System.out.println(black.write("안녕하세요?"));
		
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		Marker blue =new Marker("파란", 1, 1);
		blue.setColor("파란");
		System.out.println("색 : " + blue.getColor() + "색, 뚜껑의 수 : " + blue.getCap() + "개, 몸체의 갯수 : " + blue.getBody() +"개" );
		
	}//main
}//class UseMarker
