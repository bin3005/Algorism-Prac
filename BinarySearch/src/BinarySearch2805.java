import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch2805 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int treeNum = in.nextInt();
		int goal = in.nextInt();
		int result = 0 ;
		ArrayList<Integer> treeList = new ArrayList<Integer>();
		
		for(int i = 0 ; i < treeNum ; i++) {
			treeList.add(in.nextInt());
		}
		
		long high = 0;
		for(int i = 0 ; i < treeList.size(); i++) {
			if( treeList.get(i) > high) {
				high = treeList.get(i);
			}
		}
		long mid = 0;
		long low = 0 ;
		long answer = 0;
		while(true) {
			mid = (high + low) / 2;
			result = 0;
			for(int i = 0 ; i < treeList.size(); i++) {
				if(treeList.get(i)-mid > 0) {
					result += treeList.get(i)-mid;
				}
			}
			if(result >= goal) {
				if(mid > answer) {
					answer = mid;
				}
				low = mid +1;
			}else {
				high = mid -1;
			}
			
			if(low > high) {
				break;
			}
		
		}
		
		System.out.println(answer);
	}

}
