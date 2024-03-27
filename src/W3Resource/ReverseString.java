package W3Resource;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=Reverse("shiva");
		System.out.println(s);

	}
	public static String Reverse(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		return rev;
	}

}
