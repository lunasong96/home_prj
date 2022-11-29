package day0628;

import java.util.ArrayList;
import java.util.List;

/**
 * 개선된 for
 * 배열, List, Set 의 처음 방부터 끝 방까지 모든 방의 값을 출력할 수 있는 for.
 * @author user
 */
public class ImprovementFor {

	public static void main(String[] args) {

		int[] array = { 2022, 6, 28, 16, 4 }; //배열
		//이전의 for
//		for(int i = 0; i < array.length; i++) { //기본 for
		
//			System.out.println(array[i]);
		
//		}//end 기본for
		
		//개선된 for
		for( int i : array ) { //개선된 for
			
			System.out.println( i );//개선된 for는 순차적으로 출력한다.
			
		}//end 개선된for
		
		List<String> list = new ArrayList<String>();
		list.add("김강현");
		list.add("김도희");
		list.add("김소현");
		list.add("김수림");
		//이전의 for
		for( int i = 0; i <list.size(); i++  ) {
			System.out.println( list.get(i) );
		} //end for
		
		//개선된 for
		for(String name : list) {
			System.out.println( name );
		} //end for
		
	}//main

}//class
