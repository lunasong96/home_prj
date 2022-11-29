package day0628;

/**
 * 6월 27일 과제 강사님의 코드
 * 출력
 * 
 * @author user
 */
public class Work0627 {
	
	//교통요금은 한번 정해지면 자주 변경되지 않기 때문에 상수로 처리.
	public static final int TOWN_BUS = 800; //마을버스 기본요금
	public static final int BUS = 1250; //버스 기본 요금
	public static final int SUBWAY = 1300; //지하철 기본 요금
	
	public static void main(String[] args) {
		
		//int distance = Integer.parseInt(args[1]); // 여기에 넣으면 해당하지 않아도 불필요한 처리과정이 있으므로 좋지 않다.
		
		if (args[0].equals("마을버스") || args[0].equals("버스") || args[0].equals("지하철") ) { //마을버스, 버스, 지하철 인 경우
			int distance = Integer.parseInt(args[1]); //거리 변수 //변수는 실행 가능할 때 넣어주는 것이 좋다.
			int fare = 0; //기본요금.
			int overFare = 0; //거리초과 요금.
			
			switch ( args[0] ) {
			case "마을버스": fare = Work0627.TOWN_BUS; break;
			case "버스": fare = Work0627.BUS; break;
			case "지하철": fare = Work0627.SUBWAY; break;
			}//end switch //교통수단이 무엇인지 판별
			
			if(distance > 10) { //10km를 초과한 경우 초과요금을 구하기
				//매 5km마다 기본요금 가산식
				overFare = ( ( ( ( distance-10 ) / 5) + 1) * 100); 
				//overFare에 +1하는 이유는 0이 나온경우 0 * 100이 되므로 +1을 해주었다.
			}// end if
			
			System.out.println("입력하신 교통수단 ["+args[0]+"], 이동거리 ["+args[1]+"km]");
			System.out.println("["+args[0]+"]의 기본 요금 ["+fare+"원]");
			System.out.println("[" + (fare + overFare) + "]의 편도 요금 [" + ( (fare + overFare) * 2) + "원]");
			System.out.println("한달 20일 기준 총 이용요금 [" + ( (fare + overFare) * 40 ) + "원]");
			
		} else {//마을버스, 버스, 지하철 인지 판별
			System.out.println( args[0] + "는(은) 대중 교통수단이 아닙니다." );
		}//end if 

	}//main

}//class
