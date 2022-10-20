package control_statments;

import java.util.Scanner;

public class find_largest_number {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any three number");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>b&&a>c) {
			System.out.println("largest no"+a);
		}else if(b>c) {
			System.out.println("largest no"+b);
		}else {
			System.out.println("largest no"+c);
		}
		
		/*
		 * temp=a>b?a:b;
		 * 
		 * largest=c>temp?c:temp;
		 * 
		 * System.out.println("The largest number is: "+largest);
		 */
	}
	  
}
