import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Greedy11399 {
	//ATM
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int n = in.nextInt();
		int sum = 0;
		for(int i = 0 ; i < n ; i++ ) {
			list.add(in.nextInt());
		}
		Collections.sort(list);
		

		for(int i = 0 ; i < n ; i++) {
			for(int j = i ; j >= 0 ; j--) {
				sum += list.get(j);				
			}
		}
		
		System.out.println(sum);
	}

}
