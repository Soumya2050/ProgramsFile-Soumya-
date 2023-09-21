package mapProgram;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapProgram {
	
	public static void main(String[] args) {
		
		IdentityHashMap map = new IdentityHashMap();
		Integer i1 = new Integer(10);
		Integer i2= new Integer(10);
		
		map.put(i1, "soumya");
		map.put(i2, "jena");
		
		System.out.println(map);
	}

}
