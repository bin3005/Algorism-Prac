import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Greedy11047 {
	//����
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int coinNum = in.nextInt();
		int goalMoney = in.nextInt();
		int coin = 0;
		ArrayList<Integer> priceList = new ArrayList<>();
		
		for(int i = 0 ; i < coinNum; i++) {
			priceList.add(in.nextInt());
		}
		int index = priceList.size()-1;
		while(true) {
			
			if( goalMoney/ priceList.get(index) > 0) {
				coin += goalMoney/ priceList.get(index);
				goalMoney = goalMoney % priceList.get(index);
				
			}
			index--;
			
			if(index < 0 ) {
				break;
			}else if(goalMoney == 0) {
				break;
			}
		}
		System.out.println(coin);
		
	}

}
