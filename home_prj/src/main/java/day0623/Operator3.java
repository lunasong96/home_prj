package day0623;
/**
관계 연산자
>, <, >=, <=, ==, !=
*/
class Operator3 
{
	public static void main(String[] args) 
	{
		int i = 6, j = 23, k = 6;
		//== 같으면 true, 다르면 false 같은지를 물어보는 식이고
		System.out.println(i + " == " + j +" = " + ( i == j ) ); //같은지? false
		System.out.println(i + " == " + k +" = " + ( i == k ) ); //같은지? true
		//!= 같으면 false, 다르면 true 다른지를 물어보는 식이라 할 수 있다.
		System.out.println(i + " != " + j +" = " + ( i != j ) ); //다른지? true
		System.out.println(i + " != " + k +" = " + ( i != k ) ); //다른지? false
		System.out.println();
	}//main
}//class
