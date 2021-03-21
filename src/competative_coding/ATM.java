package competative_coding;

import java.util.Scanner;

/*
 Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a 
 multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including 
 bank charges). For each successful withdrawal the bank charges 0.50 $US. Calculate Pooja's account balance 
 after an attempted transaction.
*/

public class ATM {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int withdraw = scan.nextInt();
		double balance = scan.nextDouble();
		scan.close();
				
		if( withdraw >  balance ) {
			System.out.printf("%.2f", balance);
		}
		else if( withdraw % 5 != 0 ) {
			System.out.printf("%.2f", balance);
		}
		else {
			System.out.printf("%.2f", (balance - withdraw - 0.50));
		}		
	}
}
