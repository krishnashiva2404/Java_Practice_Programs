package programs;

public class StringcontainsVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringvowel("shivakrishna"));

	}
	public static boolean stringvowel(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }

}
