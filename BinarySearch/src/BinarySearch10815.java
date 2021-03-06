import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch10815 {
	
	public static boolean search(int[] card, int num) {
		int start = 0;
		int mid = 0;
		int end = card.length-1;
		while(start <= end) {
			mid = (start + end)/2;			
			
			if(card[mid]== num) {
				return true;
			}else if(card[mid] > num) {
				end = mid -1;
			}else{
				start = mid +1;
			}
			
			
		}
		
		return false;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner in = new Scanner(System.in);
		
		int num1 = in.nextInt();
		int[] card = new int[num1];
		for(int i = 0; i < num1 ; i++) {
			card[i] = in.nextInt();
		}
		
		int num2 = in.nextInt();
		int[] find = new int[num2];
		for(int i = 0; i < num2 ; i++) {
			find[i] = in.nextInt();
		}
		Arrays.sort(card);
		
		
		for(int i = 0 ; i < find.length; i++) {
			if( search(card,find[i]) ) {
				System.out.print("1 ");
			}else {
				System.out.print("0 ");
			}
		}
	}
	
	

}
