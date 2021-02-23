import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();

		String money = input.replace(",", "");
		
		String[] sliceMoney;
		if(money.length()% 4== 0) {
			sliceMoney = new String[money.length() / 4  ];
		}else {
			sliceMoney = new String[money.length() / 4 +1  ];
		}
		
		int four = money.length() - 1;
		for (int i = 0; i < sliceMoney.length; i++) {
						
			if (four - 4 < 0) {
				sliceMoney[i] = money.substring(0, four);
			} else {
				sliceMoney[i] = money.substring(four - 4, four);
			}
			
			four -= 4;
		}
		List<String> list = Arrays.asList(sliceMoney);
		Collections.reverse(list);
		sliceMoney = list.toArray(new String[list.size()]);

		if(sliceMoney[0].length()==1) {
			sliceMoney[0] = "000" + sliceMoney[0];
		}else if(sliceMoney[0].length()==2) {
			sliceMoney[0] = "00" + sliceMoney[0];
		}else if(sliceMoney[0].length()==3) {
			sliceMoney[0] = "00" + sliceMoney[0];
		}
		
		for(int i = 0 ; i < sliceMoney.length ; i++) {
			readMoney(sliceMoney[i]);
			
			if(!sliceMoney[i].equals("0000")) {
				if(sliceMoney.length - i == 4) {
					System.out.print("Á¶ ");
				}else if(sliceMoney.length - i == 3) {
					System.out.print("¾ï ");
				}else if(sliceMoney.length - i == 2) {
					System.out.print("¸¸ ");
				}else {
					System.out.print("¿ø");
				}
			}
		}
	}

	public static void readMoney(String s ) {
		for(int i = 0 ; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '9': {
				System.out.print("±¸"); break;
			}
			case '8': {
				System.out.print("ÆÈ"); break;
			}
			case '7': {
				System.out.print("Ä¥"); break;
			}
			case '6': {
				System.out.print("À°"); break;
			}
			case '5': {
				System.out.print("¿À"); break;
			}
			case '4': {
				System.out.print("»ç"); break;
			}
			case '3': {
				System.out.print("»ï"); break;
			}
			case '2': {
				System.out.print("ÀÌ"); break;
			}
			case '1': {
				if(i == s.length()-1) {
					System.out.print("ÀÏ");
				}else if(i == s.length()-2) {
					System.out.print("½Ê");
				}
				else if(i == s.length()-3) {
					System.out.print("¹é");
				}else {
					System.out.print("Ãµ");
				}
				break;
			}
			}
			
			if(s.charAt(i) != '1' && s.charAt(i)!='0') {
				if(i == s.length()-2) {
					System.out.print("½Ê");
				}
				else if(i == s.length()-3) {
					System.out.print("¹é");
				}else if(i == s.length()-4) {
					System.out.print("Ãµ");
				}
			}
		}
	}
}
