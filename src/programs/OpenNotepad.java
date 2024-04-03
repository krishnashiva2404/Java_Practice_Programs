package programs;



public class OpenNotepad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime rt= Runtime.getRuntime();
		 try {
			 rt.exec("notepad");
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		

	}

}
