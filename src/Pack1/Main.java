package Pack1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> obj = new ArrayList<>();
		obj.add(111);
		obj.add(222);
		obj.add(333);
		obj.add(444);
		obj.add(555);
		obj.add(666);

		for (Integer x:obj) {
			System.out.println(x);
			//obj.remove(1);
		}

		

		
	}
}