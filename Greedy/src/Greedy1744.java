import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Greedy1744 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		ArrayList<Integer> list = new ArrayList();
		ArrayList<Integer> plus = new ArrayList();
		ArrayList<Integer> minus = new ArrayList();
		
		int result = 0;
		
		for(int i=0; i < num; i++) {
			list.add(in.nextInt());
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		for(int i = 0 ; i < list.size(); i++) {
			if(list.get(i) > 0) {
				plus.add(list.get(i));
			}else {
				minus.add(list.get(i));				 
			}
		}
		Collections.sort(minus);
		for(int i = 0 ; i < plus.size(); i+=2) {
			if( i+1< plus.size() ) {
				if(plus.get(i)==1 || plus.get(i+1)==1) {
					result += plus.get(i) + plus.get(i+1);
				}else {
					result += plus.get(i)* plus.get(i+1);
				}
			}else {
				result += plus.get(i);
			}
		}
		for(int i = 0 ; i < minus.size(); i+=2) {
			if( i+1< minus.size() ) {
				result += minus.get(i)* minus.get(i+1);
			}else {
				result += minus.get(i);
			}
		}
		
		System.out.println(result);
	}

}
