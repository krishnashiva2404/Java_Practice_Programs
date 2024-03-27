package Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={6,4,5,3,8,7,1,2,9};
		sorting(arr);

	}
	public static void sorting(int[] arr) {
		int temp=0;
		System.out.print("{");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
	
			}
			System.out.print(arr[i]+",");
		}
		System.out.print("}");
	}

}
