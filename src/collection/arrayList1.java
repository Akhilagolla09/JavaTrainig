package collection;

import java.util.ArrayList;
import java.util.List;

public class arrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList L1= new ArrayList();
		
//		ArrayList<Integer> L2 = new ArrayList<Integer>();
		
//		ArrayList<String> L3 = new ArrayList<String>();
	  
		List L4 =new ArrayList();                         
		
		L4.add(100);
		L4.add("Akhila");
		L4.add('A');
		L4.add(100);
		L4.add(0);
		L4.add(null);
		L4.add(null);
		
		L4.remove(2);  // index 2 is removes
		
		L4.add(2,99);    // added in index 2
		
		L4.get(1);
		
		System.out.println(L4);
		
		System.out.println(L4.get(1));
		
		System.out.println("\n");
		
		for(Object a:L4) {
			
			System.out.println(a);
			
		}
		
		System.out.println("\n");
		
		for(int i=0; i<L4.size();i++) {
			
			System.out.println(L4.get(i));
			
		}
		
		
		System.out.println(L4.size());
		
		
		
		
		
	}

}
