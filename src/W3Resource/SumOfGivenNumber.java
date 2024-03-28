package W3Resource;

public class SumOfGivenNumber{
	
	public static void main(String[] args) {
		sumnumber(1234);
	}
	
	public static void sumnumber(int n) {
		int sum=0;
		while(n>0) {
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println(sum);
	}
}