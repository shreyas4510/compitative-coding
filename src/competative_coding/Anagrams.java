package competative_coding;

import java.util.Scanner;

public class Anagrams {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next(), str2 = scan.next();
		scan.close();

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		boolean result = isAnagram(str1, str2);
		System.out.println(result ? "Anagrams" : "Not Anagrams");

	}

	static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		} else {
			if (str1.equals(str2)) {
				return true;
			} else {
				char[] arr1 = str1.toCharArray(), arr2 = str2.toCharArray();
				char temp;
				
				for (int i = 0; i < arr1.length; i++) {
					for (int j = 0; j < arr1.length; j++) {
						if (arr1[i] > arr1[j]) {
							temp = arr1[i];
							arr1[i] = arr1[j];
							arr1[j] = temp;
						}
					}
				}

				for (int i = 0; i < arr2.length; i++) {
					for (int j = 0; j < arr2.length; j++) {
						if(arr2[i] > arr2[j]) {
							temp = arr2[i];
							arr2[i] = arr2[j];
							arr2[j] = temp;
						}
					}
				}
				
				for (int i = 0; i < arr2.length; i++) {
					if(arr1[i] != arr2[i]) {
						return false;
					}
				}
				
				return true;

			}
		}
	}

}
