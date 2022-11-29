package day0701;

/**
 * 사용자 정의 자료형.
 * 필요한 데이터형을 조합하여 새로운 이름을 사용한 것.
 * @author user
 */
public class UseDefine {

	public static void main(String[] args) {
		PersonData pd = new PersonData();
		pd.setName("테스트");
		pd.setAge(20);
		pd.setGender('남');
		pd.setAddr(" 서울시");
		
		System.out.println( pd.getName()+", "+pd.getAge()+ ", "+pd.getAddr()+", " +pd.getGender());

	}

}
