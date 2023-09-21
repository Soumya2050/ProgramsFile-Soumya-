package mapProgram;

import java.util.TreeMap;

public class TreeMapProgram {
	
	
	public static void main(String[] args) {
		
		TreeMap<Object, Object> map = new TreeMap<>(new MyComparator());
		map.put("a", 1);
		map.put("b", 2);
		map.put("z", 26);
		map.put("p", 16);
		map.put("x",null);
		System.out.println(map);
		
	}
}
