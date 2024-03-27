package programs;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,7,3,4,2,6,8};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
			}
			System.out.println(arr[i]);
		}

	}

}
