import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Greedy1931 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		List<Timetable> list = new ArrayList<>();
		
		for(int i = 0 ; i < num; i ++) {
			Timetable time = new Timetable(in.nextInt(), in.nextInt());
			list.add(time);
		}
		
		Collections.sort(list);
		int cnt = 0;
		int endTime = -1;
		
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getStart() >= endTime) {
				cnt++;
				endTime = list.get(i).getEnd();
			}
		}
		
		System.out.println(cnt);
	}
	
	
	
	

}


class Timetable implements Comparable<Timetable>{
	int start;
	int end;
	public Timetable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Timetable(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	@Override
	public String toString() {
		return "start=" + start + ", end=" + end + "\n";
	}
	
	
	@Override
	public int compareTo(Timetable time) {
		//회의 종료시간으로 오름차순 정렬
		if(end > time.getEnd()) {
			return 1;
		}else if ( end == time.end) { //종료 시간이 같으면
			//시작시간 오름 차순
			if(start > time.start) {
				return 1;
			}
		}
		
		return -1;
	}
	
	
	
	
	
	
}
