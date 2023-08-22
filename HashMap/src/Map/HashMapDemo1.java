package Map;

import java.util.HashMap;
import java.util.Map;


public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Jack");
		map.put("1", "Jack");
		System.out.println(map.size());
		
		Integer i = new Integer(1);
		Integer i1 = new Integer(1);
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(i, "One");
		map1.put(i1, "One");
		System.out.println(map1.size());
	}

}