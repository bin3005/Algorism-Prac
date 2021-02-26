import java.util.Scanner;

public class BInarySearch1072 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long X = in.nextInt();
		long Y = in.nextInt();

		long Z = 100 * Y / X;
		long result = Z;
		long pre = 100;
		long left = 1;
		long right = 1000000000;

		long originX = X;
		long originY = Y;
		long nowY = 0;
		while (left <= right) {
			long mid = (left + right) / 2;

			X = originX + mid;
			Y = originY + mid;
			result = 100*Y / X;
			if (pre >= result && result > Z) {
				pre = result;
				nowY = Y;
			}
			
			
			if (Z == result) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
//
		}
		if(pre==100) {
			System.out.println(-1);
		}else {
			System.out.println(nowY - originY);
			
		}
		
	}

}
