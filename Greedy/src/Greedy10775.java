import java.util.PriorityQueue;
import java.util.Scanner;

public class Greedy10775 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int gateNum = in.nextInt();
		int airplaneNum = in.nextInt();
		int[] gate = new int[gateNum];
		int result = 0;
		
		for(int i = 0 ; i < airplaneNum ; i++) {
			int comeAir = in.nextInt();
			boolean isDoking = false;
			if(gate[comeAir-1] == 0) {
				gate[comeAir-1] = comeAir;
				result++;
				isDoking = true;
			}else {
				while(comeAir > 0) {
					if(gate[comeAir-1] == 0) {
						gate[comeAir-1] = comeAir;
						result++;
						isDoking = true;
						break;
					}
					comeAir--;
				}
			}
			
			if(!isDoking) {
				break;
			}
		}
		
		System.out.println(result);
		
	}

}
