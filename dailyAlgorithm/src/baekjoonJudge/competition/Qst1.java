package baekjoonJudge.competition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
	����
	�ſ��̴� ���ؿ��� ����� ���� ������ Ǯ�ٰ� ������ �޾� ���ο� ������ �����Ҵ�. �ڿ��� N�� M���� �ڿ��� Ki�� �־�����. Ki�� ����� �� N ������ ������ ���� ���Ͽ���.
	
	�Է�
	ù ��° �ٿ� N�� M�� �־�����. (2 �� N �� 1000, 1 �� M < N)
	
	�״��� �ٿ� M ���� ��� K�� �־�����. (2 �� K �� 1000)
	
	������ ����� �־����� ������, ������������ ���ĵǾ� �־�����.
	
	���
	������� ���� ����Ѵ�.
	
	��, ��ġ�� ����� �� ���� ���Ѵ�. 
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
	 * @Param �ڿ��� N
	 * @Param M �ڿ����� ����
	 * @param K �ڿ���
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
