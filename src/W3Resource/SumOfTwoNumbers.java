package W3Resource;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		
		sum(10,20);
		mul(2,6);
		devide(20,5);

	}
	public static void sum(int a,int b) {
		int sumvalue=0;
		sumvalue=a+b;
		System.out.println("The value of sum is: "+sumvalue);
	}
	public static void mul(int a, int b) {
		int mulvalue=0;
		mulvalue=a*b;
		System.out.println("The value of Multiplication is : "+mulvalue);
	}
	public static void devide(int a,int b) {
		double div=0;
		try {
			div=a/b;
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("The dived value is : "+div);
		
	}

}
