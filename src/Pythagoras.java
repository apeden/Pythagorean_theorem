
/* 
 * File: Pythagoras.java
 * ------------------------
 * This is my attempt at assignment 2, question 4 (Stanford CSS 2007)
 * It calculates the length of the longest side of a right-angled triangle
 * 
 */

import java.util.Scanner;

public class Pythagoras {
/*Limit of result*/

/*runs the programme*/
	public static void run() {
		System.out.println("Enter values to compute pythagorean theorem "
				+ "\na:");
		Scanner Var_a = new Scanner(System.in);
		double a = Var_a.nextDouble();
		System.out.println("b:");
		Scanner Var_b = new Scanner(System.in);
		double b = Var_b.nextDouble();
		double hyp_squared = (a*a) +
						(b*b);
		double hyp = Math.sqrt(hyp_squared);
		System.out.println("\n" + hyp);	
		Var_a.close();
		Var_b.close();
	}
	public static void main(String[] args) {
		run();
	}
}