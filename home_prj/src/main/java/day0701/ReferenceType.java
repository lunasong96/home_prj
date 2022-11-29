package day0701;

/**
 * 참조형 데이터형
 *  값은 메모리에 다른 곳에 저장되고 그 시작 주소를 가지는 데이터형.
 * @author user
 */
public class ReferenceType {

	private int i;
	private int j;
	public static void main(String[] args) {
		ReferenceType rt = null; //new ReferenceType();
		ReferenceType rt2 = null;
		System.out.println(rt);
		System.out.println(rt2);
		//1.객체생성
		rt=new ReferenceType();
		rt2=new ReferenceType();
		System.out.println(rt);
		System.out.println(rt2);
		
		rt.i=10;
		rt2.i= 20;
	}

}
