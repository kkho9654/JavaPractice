package codingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sd {

	 public int[] solution(int[] answers) {
		 int[] answer = {0,0,0};
			int[][] supo= {{1,2,3,4,5},
	                       {2,1,2,3,2,4,2,5},
	                       {1,1,2,2,3,3,4,4,5,5}};
	        
		    for(int i=0;i<answers.length;i++){
	            if(supo[0][i%5]==answers[i])answer[0]++;
	            if(supo[1][i%8]==answers[i])answer[1]++;
	            if(supo[2][i%10]==answers[i])answer[2]++;
	        }
	        
	        ArrayList<Integer> a= new ArrayList<Integer>();
    
	        int max=Math.max(answer[0], Math.max(answer[1], answer[2]));
			
			if(max==answer[0])
             a.add(1);
         if(max==answer[1])
             a.add(2);
         if(max==answer[2])
             a.add(3);
			
			int[] x= new int[a.size()];
			for(int i=0;i<x.length;i++) {
				x[i]=a.get(i);
			}
			
			return x;
		}
}
