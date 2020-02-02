package com.practiselab.java;

import java.util.ArrayList;
import java.util.List;

public class RemoveList {
	
	public List<String> removeElements(List<String> list1, List<String> list2){
		
		list2.removeAll(list1);
		
		return list2;
	}

	public static void main(String[] args) {
		RemoveList removelist = new RemoveList();
		List<String> list1 = new ArrayList();
		List<String> list2 = new ArrayList();
		list1.add("sri");
		list1.add("teja");
		list1.add("deepu");
		list2.add("sri");
		list2.add("teja");
		list2.add("deepu");
		list2.add("satish");
		list2.add("sameera");
		System.out.println(list2);
		System.out.println("The result : " + removelist.removeElements(list1, list2) );
		
 		// TODO Auto-generated method stub

	}

}
