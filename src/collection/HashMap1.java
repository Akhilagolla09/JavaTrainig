package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> M1= new HashMap<Integer,String>();
		
		Map M2 = new HashMap();
		
		M1.put(1, "akhila");
		M1.put(2, "abc");
		M1.put(3, "asdfghjk");
		
		
		M2.put('a',100);
		
		M1.clear();
		
		System.out.println(M1);
		System.out.println(M2);
	
		System.out.println(M1.size());
		
		M1.remove(1);
		System.out.println(M1); 
		
		M1.keySet();
		System.out.println(M1.keySet());
		
		M1.values();
		System.out.println(M1.values());
		
    	for(Object k:M1.keySet())
		{
			System.out.println(k+"  "+ M1.get(k));
		}                                                     
		
		
	}

}
