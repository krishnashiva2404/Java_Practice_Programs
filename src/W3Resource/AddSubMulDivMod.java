package W3Resource;

import java.util.Scanner;

public class AddSubMulDivMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b=sc.nextInt();
		sc.close();
		int sum=0;
		int sub=0;
		int mul=0;
		int div=0;
		int mod=0;
		sum=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
		mod=a%b;
		System.out.println(a+"+"+b+"="+sum);
		System.out.println(a+"-"+b+"="+sub);
		System.out.println(a+"*"+b+"="+mul);
		System.out.println(a+"/"+b+"="+div);
		System.out.println(a+"mod"+b+"="+mod);

	}
	

}
