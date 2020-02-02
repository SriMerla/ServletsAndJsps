package com.practiselab.java;

import java.util.ArrayList;
import java.util.List;

public class RemoveList2 {
	public List<String> removeElements(List<String> list1, List<String> list2){
		
	    list1.retainAll(list2);
		
		return list1;
	}

	public static void main(String[] args) {
		RemoveList2 removelist2 = new RemoveList2();
		List<String> list1 = new ArrayList();
		List<String> list2 = new ArrayList();
		list1.add("sri");
		list1.add("teja");
		list1.add("deepu");
		list1.add("satish");
		list1.add("sameera");
	
		list2.add("satish");
		list2.add("sameera");
		System.out.println(list1);
		System.out.println("The result : " + removelist2.removeElements(list1, list2) );
		

	}

}
