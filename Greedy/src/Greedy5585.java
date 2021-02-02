import java.util.Scanner;

public class Greedy5585 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int money = 1000 - in.nextInt();
		int coinNum = 0;
		int[] coin =  {500,100,50,10,5,1};
		
		for(int i = 0; i < coin.length; i++) {
			coinNum += money / coin[i];
			money %=  coin[i];
		}
		
		System.out.println(coinNum);
	
	}

}
