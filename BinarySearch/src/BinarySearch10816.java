import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;



public class BinarySearch10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cardNum = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] cardList = new int[cardNum];
		for(int i = 0; i < cardNum;i++) {
			cardList[i] = Integer.parseInt(st.nextToken());
		}
		
		int resultNum = Integer.parseInt(br.readLine());
		int[] resultList = new int[resultNum];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < resultNum;i++) {
			resultList[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(cardList);
		for(int i = 0 ; i < resultList.length;i++) {
			//upper_bound값이 카드더미의 마지막카드이고, 그 값이 찾는 값이면
			if(  upper_bound(cardList, resultList[i]) == cardNum -1 && cardList[cardNum-1]== resultList[i]) {
				bw.write(upper_bound(cardList, resultList[i]) - lower_bound(cardList, resultList[i])+1+" ");
			}else {
				bw.write(upper_bound(cardList, resultList[i]) - lower_bound(cardList, resultList[i])+" ");
			}
			
		}
		
		bw.flush();
		br.close();
		bw.close();
		
		
	}
	
	public static int lower_bound(int[] list, int target){
		int left = 0 ;
		int right = list.length-1;
		int mid = 0;
		
		while( left < right) {
			mid = (left+right)/2;
			if(list[mid] >= target) {
				right = mid;
			}else {
				left = mid +1;
			}
		}
		
		
		return right;
	}
	
	public static int upper_bound(int[] list, int target){
		int left = 0 ;
		int right = list.length-1;
		int mid = 0;
		
		while( left < right) {
			mid = (left+right)/2;
			if(list[mid] > target) {
				right = mid;
			}else {
				left = mid +1;
			}
		}
		
		
		return right;
	}
}
