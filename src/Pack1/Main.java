package Pack1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {


		Map<String,String> map = new HashMap<>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
		
		Set<String> allVall=map.keySet();
		for(String val: allVall) {
			System.out.println(val+" "+map.get(val));
		}
		System.out.println("--------------------");
		map.remove("ONE");
		map.remove("FOUR");
		
		Set<String> allVall1=map.keySet();
		for(String val: allVall1) {
			System.out.println(val+" "+map.get(val));
		}

		
//		Iterator<String> it=map.keySet().iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}


//	    System.out.println("My HashSet content:"+obj);
//	    obj.clear();
//	    System.out.println("Clearing HashSet:");
//	    System.out.println("Content After clear");
	   // System.out.println(obj);
		
//		}
		// System.out.println("Does HashSet contains first
		// element?"+obj.contains("first"));
	}
}