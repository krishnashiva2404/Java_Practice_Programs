package Arrays;

import java.util.Arrays;

public class FindMaxAndMinimumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,5,8,7,6};
		MaxMinimumAray(arr);

	}
	
	public static void MaxMinimumAray(int[] arr) {
		
		Arrays.sort(arr);
		System.out.println("Minimum : "+arr[0]+"\n"+"Maximum : "+arr[arr.length-1]);
		
	}

}
