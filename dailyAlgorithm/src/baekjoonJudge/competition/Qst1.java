package baekjoonJudge.competition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
	문제
	신원이는 백준에서 배수에 관한 문제를 풀다가 감명을 받아 새로운 문제를 만들어보았다. 자연수 N과 M개의 자연수 Ki가 주어진다. Ki의 배수들 중 N 이하인 숫자의 합을 구하여라.
	
	입력
	첫 번째 줄에 N과 M가 주어진다. (2 ≤ N ≤ 1000, 1 ≤ M < N)
	
	그다음 줄에 M 개의 배수 K가 주어진다. (2 ≤ K ≤ 1000)
	
	동일한 배수는 주어지지 않으며, 오름차순으로 정렬되어 주어진다.
	
	출력
	배수들의 합을 출력한다.
	
	단, 겹치는 배수는 한 번만 더한다. 
 */
public class Qst1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstLine = reader.readLine().split(" ");
		String[] secLine = reader.readLine().split(" ");
		
		int N = Integer.parseInt(firstLine[0]);
		int M = Integer.parseInt(firstLine[1]);
		
		List<Integer> K = new ArrayList();
		for (String strNum : secLine) {
			K.add(Integer.parseInt(strNum));
		}
		
		Qst1 qst1 = new Qst1();
		System.out.println(qst1.drainSum(N, M, K));
	}
	
	/*
	 * @Param 자연수 N
	 * @Param M 자연수의 갯수
	 * @param K 자연수
	 */
	int drainSum(int N, int M, List<Integer> K) {
		List<Integer> result = new ArrayList();
		for(int i = 0; i < M; i++) {
			List<Integer> tmpList = getDrainNumbers(N, K.get(i));
			for (Integer drainNum : tmpList) {
				if(!result.contains(drainNum)) {
					result.add(drainNum);
				}
			}
		}
		return result.stream().reduce(0, Integer::sum);
	}
	
	List<Integer> getDrainNumbers(int N, int K) {
		List<Integer> result = new ArrayList();
		int i = 1;
		while(K * i <= N) {
			result.add(K * i);
			i++;
		}
		return result;
	}
}
