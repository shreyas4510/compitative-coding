package competative_coding;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		boolean flag = false;
		
		for (int i = 0; i < str.length() / 2; i++) {
			if(str.charAt(i) != str.charAt(str.length() - 1 -i)) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}
}
