package Arrays;

import java.util.Arrays;

public class TwoArraysEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {2,3,4,5,7};
		int[] arr2= {3,2,8,4,5};
		if(arrayEqual(arr1,arr2)) {
			System.out.println("Two arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}

	}
	public static boolean arrayEqual(int arr1[],int arr2[] ) {
		
		int n=arr1.length;
		int m=arr2.length;
		if(n!=m) {
			return false;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0;i<n;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}

}
