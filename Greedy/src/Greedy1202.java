import java.io.*;
import java.util.*;

public class Greedy1202 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Cube[] jewArr = new Cube[N];
		int[] bagArr = new int[K];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			jewArr[i] = new Cube(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		for (int i = 0; i < K; i++) {
			bagArr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(jewArr); // jewArr 무게 오름차순 정렬
		Arrays.sort(bagArr); // bagArr 무게 오름차순 정렬

		PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> Integer.compare(y, x));
		long priceSum = 0L;
		int idx = 0;
		for (int i = 0; i < K; i++) {
			while (idx < N && jewArr[idx].weight <= bagArr[i]) {
				pq.add(jewArr[idx].price);
				idx++;
			}
			if (!pq.isEmpty()) priceSum += pq.poll();
		}
		System.out.println(priceSum);
	}

	
}
class Cube implements Comparable<Cube>{
	int weight;
	int price;
	public Cube() {
		super();
	}
	public Cube(int weight, int price) {
		super();
		this.weight = weight;
		this.price = price;
	}
	@Override
	public int compareTo(Cube cube) {

		if(weight <= cube.weight) {
			return -1;
		}else {
			return 1;
		}
	}
	@Override
	public String toString() {
		return "Cube [weight=" + weight + ", price=" + price + "]";
	}
	
	
	
	
	
}