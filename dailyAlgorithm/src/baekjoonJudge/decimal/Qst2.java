package baekjoonJudge.decimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 *  문제
	자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
	
	예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.
	
	입력
	입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
	
	M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
	
	출력
	M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다. 
	
	단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
 */
public class Qst2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		List<Integer> primeList = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int min = Integer.parseInt(reader.readLine());
		int max = Integer.parseInt(reader.readLine());
		
		for(int i = min; i <= max; i++) {
			int number = i;
			if(number > 1) {
				primeList.add(number);
			}
		}
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < primeList.size(); i++) {
			boolean prime = true;
			int number = primeList.get(i);
			if (number > 2) {
				for(int j = 2; j < number; j++) {
					if(number % j == 0 ) {
						prime = false;
						break;
					}
				}
			}
			if(prime) {
				list.add(number);
			}
		}
		int sum = 0;
		if(list.size() > 0) {
			for (Integer integer : list) {
				sum += integer;
			}
			System.out.println(sum);
			System.out.println(list.get(0));
		}else {
			System.out.println(-1);
		}
	}
}
