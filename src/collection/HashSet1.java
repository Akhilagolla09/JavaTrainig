package collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * HashSet H1= new HashSet();
		 * 
		 * HashSet<Integer> H2 = new HashSet<Integer>();
		 * 
		 * HashSet<String> H3 = new HashSet<String>();
		 */

		Set H4 = new HashSet();

		H4.add(50);
		H4.add("Akhila");
		H4.add('A');
		H4.add(50);
		H4.add(null);
		H4.add(0);

		System.out.println(H4);

		System.out.println(H4.size());

		H4.remove(50);
		System.out.println(H4);

		System.out.println("\n");
		
		for (Object a : H4) {

			System.out.println(a);

		}
		
		
		
		
		
		

	}

}
