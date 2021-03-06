import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Greedy2217 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int lineNum = in.nextInt();
		ArrayList<Integer> lineWeight = new ArrayList();
		int max = 0 ;
		for(int i = 0; i < lineNum ; i++) {
			lineWeight.add(in.nextInt());
		}
		
		Collections.sort(lineWeight, Collections.reverseOrder());
		
		for(int i = 0 ; i < lineWeight.size(); i++) {
			if(max < lineWeight.get(i) * (i+1)) {
				max = lineWeight.get(i) * (i+1);
			}
		}
		
		System.out.println(max);
	}

}
