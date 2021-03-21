package competative_coding;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram_hashmap {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next(), str2 = scan.next();
		scan.close();
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		HashMap<Character, Integer> storeCount1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> storeCount2 = new HashMap<Character, Integer>();
		
		if(str1.length() != str2.length()) {
			System.out.println("Not Anagrams");
		}
		else {
			
			if(str1.equals(str2)) {
				System.out.println("Anagrams");
			}
			else {
				for (int i = 0; i < str1.length(); i++) {
					if(storeCount1.get(str1.charAt(i)) != null) {
						storeCount1.put(str1.charAt(i), (storeCount1.get(str1.charAt(i)) + 1));
					}
					else {
						storeCount1.put(str1.charAt(i), 1);
					}
				}
				
				for (int i = 0; i < str2.length(); i++) {
					if(storeCount2.get(str2.charAt(i)) != null) {
						storeCount2.put(str2.charAt(i), (storeCount2.get(str2.charAt(i)) + 1));
					}
					else {
						storeCount2.put(str2.charAt(i), 1);
					}
				}
				
				for (int i = 0; i < str1.length(); i++) {
					if(storeCount1.get(str1.charAt(i)) != storeCount2.get(str1.charAt(i))) {
						System.out.println("Not Anagrams");
						break;
					}
					if(i == str1.length() - 1) {
						System.out.println("Anagrams");
					}
				}				
			}
		}
	}
}
