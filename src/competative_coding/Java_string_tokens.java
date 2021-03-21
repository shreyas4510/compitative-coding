package competative_coding;

import java.util.Scanner;

public class Java_string_tokens {
	public static void main(String args[]) {
		String check = " !,?._'@", str;
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		scan.close();
		str = str.trim().replaceAll(" +", " ");
		for (int i = 0; i < check.length(); i++) {
			str = str.replace(check.charAt(i), '#');
		}
		String[] arr = {};
		str = str.trim().replaceAll("#+", "#");
		if(!str.isEmpty()) {
			arr = str.split("#");		
		}
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
