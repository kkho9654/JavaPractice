package codingPractice;

import java.util.Scanner;

public class Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//º°Âï±â https://www.acmicpc.net/problem/2442
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i;j--) 
				System.out.print(" ");
			for(int j=0;j<2*i+1;j++) 
				System.out.print("*");
			System.out.println();
		}
		
		
		
	}

}
