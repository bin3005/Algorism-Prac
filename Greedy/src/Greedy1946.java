import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Greedy1946 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int caseNum = in.nextInt();
		int[] cnt = new int[caseNum];
		
		for(int j = 0 ; j < caseNum; j++) {
			int peopleNum = in.nextInt();
			int maxScore2 = 0;
			ArrayList<People> list = new ArrayList();
			
			for(int i = 0 ; i < peopleNum; i++) {
				list.add( new People(in.nextInt(), in.nextInt() ) );
			}
			
			Collections.sort(list);
			
			maxScore2 = list.get(0).score2;
			cnt[j] =1;
			for(int i = 1 ; i < peopleNum; i++) {
				if( list.get(i).score2 < maxScore2  ) {
					cnt[j]++;
					maxScore2 = list.get(i).score2;
				}
			}
		}
		
		for(int i = 0 ; i < cnt.length;i++) {
			System.out.println(cnt[i]);
		}

				
		
	}
}
	
	class People implements Comparable<People>{
		int score1;
		int score2;
		
		
		public People() {
			super();
			// TODO Auto-generated constructor stub
		}


		public People(int score1, int score2) {
			super();
			this.score1 = score1;
			this.score2 = score2;
		}


		@Override
		public int compareTo(People p) {
			if(score1 > p.score1){
				return 1;
			}else {
				return -1;
			}
		}
	}

