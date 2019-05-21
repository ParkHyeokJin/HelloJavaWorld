package baekjoonJudge.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/*
	문제
	N과 L이 주어질 때, 합이 N이면서, 길이가 적어도 L이면서 가장 짧은 연속된 음이 아닌 정수 리스트를 구하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 N과 L이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이고, L은 2보다 크거나 같고, 100보다 작거나 같은 자연수이다.
	
	출력
	만약 리스트의 길이가 100보다 작거나 같으면, 연속된 수를 첫째 줄에 공백으로 구분하여 출력한다. 만약 길이가 100보다 크거나 그러한 수열이 없을 때는 -1을 출력한다.
*/
public class Qst4 {

	public static void main(String[] args) throws IOException {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String[] input = reader.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int L = Integer.parseInt(input[1]);
		qst4(N, L);
	}
	
	public static void qst4(int N, int L) {
		Map<Integer, int[]> resultMap = new HashMap<>();
		int startNum = L;
		while(true) {
			int sum = 0;
			for(int i = startNum; i < N; i++) {
				sum += i;
				if((i - startNum) > 100) {
					break;
				}
				if(sum > N) {
					break;
				}else if(sum == N) {
					int[] tmp = {startNum, i};
					resultMap.put(i - startNum, tmp);
				}
			}
			startNum++;
			if(startNum == N) {
				break;
			}
		}
		print(resultMap);
	}
	
	public static void print(Map<Integer, int[]> resultMap) {
		if(resultMap.size() == 0) {
			System.out.println(-1);
		}else {
			ArrayList<Integer> nums = new ArrayList<>(resultMap.keySet());
			Collections.sort(nums);
			if(nums.get(0) > 100) {
				System.out.println(-1);
			}else {
				int[] resultNums = resultMap.get(nums.get(0));
				for(int i = resultNums[0]; i <= resultNums[1]; i++) {
					System.out.print(i+" ");
				}
			}
		}
	}
}
