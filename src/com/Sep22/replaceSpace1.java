package com.Sep22;

public class replaceSpace1 {
	
	public String replaceSpace(StringBuffer str) {
		return str.toString().replaceAll("\\s", "%20");
	}
	
	public static void main(String[] args) {
		replaceSpace1 rs = new replaceSpace1();
		StringBuffer str = new StringBuffer("we are happy");
		System.out.println(rs.replaceSpace(str));
	}

}
