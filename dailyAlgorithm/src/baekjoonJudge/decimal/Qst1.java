package baekjoonJudge.decimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 *  문제
	주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
	
	입력
	첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
	
	출력
	주어진 수들 중 소수의 개수를 출력한다.
 */
public class Qst1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		List<Integer> primeList = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(reader.readLine());
		String[] primeNumbers = reader.readLine().split(" ");
		
		for (String i : primeNumbers) {
			int number = Integer.parseInt(i);
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
		System.out.println(list.size());
	}
}
