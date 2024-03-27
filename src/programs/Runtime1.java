package programs;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Runtime1 {

	public static void main(String[] args) throws IOException {
		// 2 array duplicates
		int ar[]= {50,70,60,10,20,30,40,50};
		int temp=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			System.out.println(ar[i]);
		}
		
	}
		

}
