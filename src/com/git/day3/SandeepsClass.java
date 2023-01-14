package com.git.day3;

public class SandeepsClass {

	public String reverse(String str) {

		String result = "";

		char[] strArr = str.toCharArray();

		for (int i = strArr.length - 1; i >= 0; i--) {

			result += strArr[i];
		}

		return result;
	}

	public static void main(String[] args) {

		System.out.println("GitHub");
	}

}
