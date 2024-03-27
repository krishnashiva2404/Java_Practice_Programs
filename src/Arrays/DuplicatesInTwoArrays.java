package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {10,20,30,40,50,60,70};
		int[] arr2= {20,40,80,10,60,90,75};
		duplicatrsarrays(arr1,arr2);

	}
	
	public static void duplicatrsarrays(int[] arr1,int[] arr2) {
		
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
			
		}
		for(int j=0;j<arr2.length;j++) {
			if(set.contains(arr2[j])) {
				System.out.println(arr2[j]);
			}
		}
		
	}

}
