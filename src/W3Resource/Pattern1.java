package W3Resource;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
//		*****
//		*****
//		*****
//		*****
//		*****   for solid Rectangle

	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any Number : ");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("____________________________________________________");
//		
//		*****
//		****
//		***
//		**
//		*

		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("_____________________________________________________");
		
//		*
//		**
//		***
//		****
//		*****
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("______________________________________________________");
		
//	     *
//	    **
//	   ***
//	  ****
//	 *****

		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("______________________________________________________");
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
//		
		for(int i=n;i>=1;i--) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
