package day0627;

/**
 * 6월 27일 과제
 * 
 * @author user
 */
public class Work0627 {
	public static final int TOWNBUS = 800;
	public static final int BUS = 1250;
	public static final int SUBWAY = 1300;
	public static void main(String[] args) {
		int fare = 0; //요금
		int distance = Integer.parseInt(args[1]); //거리
		int oneFare = 0; //편도요금
		int rtFare = 0; //왕복요금
		int totalFare = 0; //총 요금
		///////////////////////////거리별 요금 계산////////////////////////////////////////////////////
		distance -= 10;
		distance /= 5;
		/////////////////////////////////////////////////////////////////////////////////////////////////
		if (args[0].equals("마을버스" ) || args[0].equals("버스") || args[0].equals("지하철") ){
			System.out.println("입력하신 교통수단 "+args[0]+"이고, 이동거리는" + args[1]+"km이다.");
			switch (args[0]) {
			case  "마을버스" : fare = TOWNBUS; break;
			case  "버스" : fare = BUS; break;
			default: fare = SUBWAY; break;
			}
			//////////////////////////////////////////교통요금 계산식///////////////////////////////////////////
			oneFare = fare + (distance * 100); //편도 요금 계산식
			rtFare = oneFare * 2; // 왕복 요금 계산식
			totalFare = rtFare * 20; //총 요금 계산식
			////////////////////////////////////////////////////////////////////////////////////////////////
			System.out.println("교통수단의 기본요금은 "+fare+"원입니다.");
			System.out.println("편도요금 "+oneFare+"원, 왕복요금 "+rtFare+"원 한달 20일 기준이용 총 이용요금 "+totalFare+"원 입니다.");
		}
		else {
			System.out.println("대중교통수단이 아닙니다.");
		}
	}//main

}//class