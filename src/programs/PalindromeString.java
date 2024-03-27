package programs;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ispalindrome("malayalama"));

	}
	static boolean ispalindrome(String input) {
		int length=input.length();
		boolean result=true;
		for(int i=0;i<=length/2;i++) {
			if(input.charAt(i)!=input.charAt(length-i-1)){
				result=false;
				break;
			}
		
		}
		return result;	
	}

}
