package programs;

import java.util.ArrayList;
import java.util.List;

public class IntegerlistOddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		list.add(7);
		list.add(3);
		list.add(9);
		list.add(5);
		list.add(11);
		System.out.println(onlyOddNumbers(list));

	}
	public static boolean onlyOddNumbers(List<Integer> list) {
		for(int i:list) {
			if(i%2==0) {
				return false;
			}
			
		}
		return true;
	}

}
