package W3Resource;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,4,7,8,9};
		int[] arr2= {4,6,5,3,2};
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
