package programs;

public class longsubstring {
	
	
	public static void main(String[] args) {
		int num=123;
		int rev=0;
		while(num>1) {
			
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}

}
