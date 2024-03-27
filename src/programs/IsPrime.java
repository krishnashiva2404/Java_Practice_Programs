package programs;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prime(11));
		System.out.println(prime(47));

	}
	public static boolean prime(int n) {
		if(n==0||n==1) {
			return false;
		}
		if(n==2) {
			return true;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%2==0) {
				return false;
			}
		}
		return true;
	}

}
