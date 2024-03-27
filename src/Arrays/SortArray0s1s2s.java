package Arrays;

public class SortArray0s1s2s {
	
//	The problem was posed with three colors, here `0′, `1′ and `2′. The array is divided into four sections: 
//		arr[1] to arr[low – 1]
//		arr[low] to arr[mid – 1]
//		arr[mid] to arr[high – 1]
//		arr[high] to arr[n]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
//		Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
		
		int[] arr={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		int arrsize=arr.length;
		sort012(arr,arrsize);
		for(int i=0;i<arrsize;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void sort012(int[] arr, int arrsize) {
		int low=0;
		int high=arrsize-1;
		int mid=0;
		int temp=0;
		
		// Iterate till all the elements
        // are sorted
		
		while(mid<=high) {
			
			switch(arr[mid]) {
			
			case 0 :{
				temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
				break;
								
			}
			case 1:{
				mid++;
				break;
			}
			case 2:{
				temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
				break;
			}
			}
			
		}
	}
}

