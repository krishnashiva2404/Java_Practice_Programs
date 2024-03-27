package programs;

public class StringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// convert abbcccdddd to ab2c3d4
		
		String str="abbcccdddd";
		StringBuffer sb=new StringBuffer();
		for (int i=0;i<str.length();i++) {
			int count=1;
			while(i+1<str.length()&&str.charAt(i)==str.charAt(i+1)) {
				count++;
				i++;
			}
			sb.append(str.charAt(i));
			if(count>1) {
				sb.append(count);
			}
				}
		System.out.println(sb);

	}

}
