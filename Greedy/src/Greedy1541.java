import java.util.Scanner;

public class Greedy1541 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String sik = in.next();
		
		String[] sikMinus = sik.split("-");
		String[] sikPlus;
		int result = 0;
		for(int i = 0 ; i < sikMinus.length; i++) {
			if(i==0) {
				if(sikMinus[i].contains("+")) {
					sikPlus = sikMinus[i].split("\\+");
					for(int j = 0 ; j  < sikPlus.length;j++) {
						result += Integer.parseInt(sikPlus[j]);
					}
				}else {
					result += Integer.parseInt(sikMinus[i]);
				}
			}else if(sikMinus[i].contains("+")) {
				sikPlus = sikMinus[i].split("\\+");
				for(int j = 0 ; j  < sikPlus.length;j++) {
					result -= Integer.parseInt(sikPlus[j]);
				}
			}else {
				result -= Integer.parseInt(sikMinus[i]);
			}
		}
		
		System.out.println(result);
	}

}
