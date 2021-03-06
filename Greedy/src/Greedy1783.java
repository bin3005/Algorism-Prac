import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Greedy1783 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int L = in.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0 ; i < N ; i++) {
			list.add(in.nextInt());
		}
		Collections.sort(list);
		int start = list.get(0);
		int cnt = 1;
		
		for(int i = 0 ; i < list.size(); i++) {
			if(start + L -1 < list.get(i)) {
				cnt++;
				start = list.get(i);
			}
		}
		
		System.out.println(cnt);
	}
}


