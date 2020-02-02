package com.practiselab.java;

public class MirrorImageOfString {
	
	public String getImage(String str){
		StringBuffer str2 = new StringBuffer(str);
		str2.reverse();
		String newString = str + "|" + str2;
		return newString;
	}

	public static void main(String[] args) {
		MirrorImageOfString mirrorImage = new MirrorImageOfString();
		System.out.println(mirrorImage.getImage("EARTH"));

	}

}
