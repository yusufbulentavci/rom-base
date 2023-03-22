package com.bilgidoku.rom.base.ilk.util;

public class Str {

	public static String replaceChar(String s, char from, char to) {
		if(s==null)
			return null;
		StringBuilder sb=new StringBuilder();
		s.chars().forEach(c->sb.append(c==from?(char)to:(char)c));
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		System.out.println(replaceChar("ali.veli.deli",'.','_'));
	}
}
