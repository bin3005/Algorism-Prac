import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch1654 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int goal = in.nextInt();
		int lineNum = 0;
		long result = 0;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0 ; i < num; i++) {
			list.add(in.nextInt());
		}
		
		Collections.sort(list);
		
		long start = list.get(list.size()-1);
		long end = 1;
		long mid = 0;
		while(end <= start) {
			lineNum = 0;
			mid = (end+start)/2;
			for(int i =0 ; i < list.size();i++) {
				lineNum += list.get(i) / mid;
			}
			if(lineNum < goal) {
				start = mid -1;
			}else {
				end = mid + 1;
			}
			
			if(lineNum >= goal && result< mid) {
				result = (int)mid;
			}
			
		}
		
		System.out.println(result);
	}

}
