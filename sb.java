package codingPractice;

import java.util.Arrays;

public class sb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d= {1,3,2,5,3,1,3,4,6};
		for(int i:d)
			System.out.print(i);
		Arrays.sort(d);
		
		System.out.print(Arrays.toString(d));
		

	}
}
