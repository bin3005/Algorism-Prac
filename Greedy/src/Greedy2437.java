import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Greedy2437 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int weight = 0;
		
		for( int i = 0 ; i < N ; i++) {
			list.add(in.nextInt());
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			if(weight+1 >= list.get(i)) {
				weight += list.get(i);
			}else {
				break;
			}
		}
		
		System.out.println(weight+1);
		
	}

}
