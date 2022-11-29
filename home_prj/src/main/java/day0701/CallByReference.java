package day0701;

/**
 *
 * @author user
 */
public class CallByReference {
	int i;
	int j;
	
	public void swap( CallByReference cbr ) {
		int temp = 0;
		temp = cbr.i;
		cbr.i = cbr.j;
		cbr.j =temp;
		System.out.println("swap method 내 i = " + cbr.i + ", j = " + cbr.j);
	}
	
	public static void main(String[] args) {
		CallByReference cbr = new CallByReference();
		cbr.i = 7;
		cbr.j = 1;
		System.out.println("swap method 전 i = " + cbr.i + ", j = " + cbr.j);
		cbr.swap(cbr);
		
		System.out.println("swap method 후 i = " + cbr.i + ", j = " + cbr.j);
	}//main
}//class
