import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Greedy2839 {

	public static void main(String[] args) {
		//NŰ�α׷� ���� ���
		//������ 3Ű�ο� 5Ű��
		// 3 <= N <= 5000
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		int smallSugar = 0;
		
		while(true) {
			if(n % 5 ==0) {
				System.out.println(n / 5 + smallSugar );
				break;
			}else if( n <= 0) {
				System.out.println(-1);
				break;
			}
			
			n -= 3;
			smallSugar++;
			
		}
	}

}
