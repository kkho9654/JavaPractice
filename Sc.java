package codingPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Sc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://programmers.co.kr/learn/courses/30/lessons/68644
	}
	public int[] solution(int[] numbers) {
		int[] answer;
		ArrayList list= new ArrayList();
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<i;j++) {
				int tmp=numbers[i]+numbers[j];
				if(list.indexOf(tmp)==-1) {
					list.add(tmp);
				}
			}
		}
		answer= new int[list.size()];
		list.sort(null);
		for(int i=0;i<list.size();i++) {
			answer[i]=(int) list.get(i);
		}
		
		

		return answer;
	}
}
