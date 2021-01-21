package codingPractice;

class Solution {
	public static void main(String args[]) {
		int[][] board={{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves= {1,5};
		System.out.println(solution(board,moves));
		String s="asd asdfg asdf";
		String answer = "";
		String[] str= s.split(" ");

		for(int i=0;i<str.length;i++){
			for(int j=0;j<str[i].length();j++){
				if(j%2==0){
					String tmp=""+str[i].charAt(j);
					answer+=tmp.toUpperCase();
				}else{
					String tmp=""+str[i].charAt(j);
					answer+=tmp.toLowerCase();
				}
			}
			if(i!=str.length-1)
				answer+=" ";
		}
		System.out.println(answer);
	}


	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		int[] arr=new int[moves.length];
		int pindex=0;
		int movesindex=0;
		for(int i=0;i<moves.length;i++){
			int tmp=0;
			while(true){
				if(board[tmp][moves[movesindex]-1]!=0)
					break;
				if(tmp==board.length-1)
					break;
				tmp++;
			}
			if(tmp!=board.length-1){
				arr[pindex]=board[tmp][moves[movesindex]-1];
				board[tmp][moves[movesindex]-1]=0;
			}else{
				if(board[tmp][moves[movesindex]-1]==0)
					pindex--;
				else{
					arr[pindex]=board[tmp][moves[movesindex]-1];
					board[tmp][moves[movesindex]-1]=0;
				}
			}
			if(pindex>1&&arr[pindex]==arr[pindex-1]){
                answer=answer+2;
                pindex=pindex-2;
            }
            movesindex++;
			pindex++;
		}
        
		return answer;
	}
}
