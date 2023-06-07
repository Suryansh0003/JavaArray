package pwnew;

import java.util.Arrays;

class anagramm {
	public void ana() {
		String s1 = "School master";
		String s2 = "The class room";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		s1 = s1.replace(" ", "");
		s2 = s2.replace(" ", "");

		char[] arr = s1.toCharArray();
		char[] arr2 = s2.toCharArray();

		Arrays.sort(arr);
		Arrays.sort(arr2);

		if (Arrays.equals(arr, arr2)) {
			System.out.println("This is an anagram ");
		} else
			System.out.println("This is not an anangram ");
	}

}

public class Anagram {

	public static void main(String[] args) {

		anagramm aa = new anagramm();
		aa.ana();

	}
}
