package day0630;

/**
 * 2022년 6월 30일 과제
 * 1.대상선정 = 라면<br>
 * 2.객체 모델링<br>
 * 눈에 보이는 특징 : 라면이름, 칼로리, 시간;<br>
 * 동작에 대한 특징 : 끓여먹기, 부셔먹기<br>
 * 3.클래스다이어그램 그림.<br>
 * 4. 객체를 생성.
 * 
 * 5. 객체 사용.
 * @author user
 */
public class Ramen {
	private String name; //라면 명칭
	private int count; //라면 갯수
	private int tictoc; //라면 끓이는 시간
	
	/**
	 * Ramen 기본 생성자
	 */
	public Ramen() {
		this( 1, 1);
	}//Ramen()
	
	public Ramen(int count, int tictoc) {
		this.count = count;
		this.tictoc = tictoc;
	}//Ramen
	
	/**
	 * 라면이름
	 * @param name
	 */
	public void setName(String name) {
		if( !( name.equals("신") || name.equals("열") || name.equals("너구리") ) ) {
			name = "신";
		}//유효성 검사
		this.name = name;
	}//setName
	
	public void setCount(int count) {
		if( !(count > 0 && count < 5) ) {
			count = 1;
		}//유효성 검사
		this.count=count;
	}//setCount
	
	public void setTictoc(int tictoc) {
		if( !(tictoc>2 && tictoc < 11) ) {
			tictoc = 3; 
		}//유효성 검사
		this.tictoc = tictoc;
	}//setTictoc
	
	public String getName() {
		return name;
	}//getName
	
	public int getCount() {
		return count;
	}//getCount
	
	public int getTictoc() {
		return tictoc;
	}//getTictoc
	

	/**
	 * @param eat 라면을 먹을 때 동작
	 * @return 몇 개를 먹을지에 대한 행동
	 */
	public String eat() {
		return name + "을 " + count + "개를 가져와 뿌셔먹었다.";
	}//eat
	
	public String eat( int count, int tictoc) {
		return name+"라면을 먹기 위해 "+ count+"개를 가져와 " +tictoc+"분 동안 끓여 먹었다.";
	}//eat(int, int)
}
