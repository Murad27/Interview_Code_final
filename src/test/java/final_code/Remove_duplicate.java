package final_code;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Remove_duplicate {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList <Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(30);
		list.add(270);
		list.add(20);
		Set<Integer> abc= new LinkedHashSet<Integer>(list);
		System.out.println(abc);
		
		
	}

}
