/*
 * CCC 2020 Junior 1: Dog Treats
 * 
 * Author: Charles Chen
 * 
 * Straight forward calculation and if else structure
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int small = input.nextInt();
		int medium = input.nextInt();
		int large = input.nextInt();
		input.close();
		
		int happiness = (3 * large) + (2 * medium) + small;
		if (happiness >= 10) {
			System.out.println("happy");
		} else {
			System.out.println("sad");
		}

	}

}
