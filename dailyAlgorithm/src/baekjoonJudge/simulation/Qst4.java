package baekjoonJudge.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/*
	����
	N�� L�� �־��� ��, ���� N�̸鼭, ���̰� ��� L�̸鼭 ���� ª�� ���ӵ� ���� �ƴ� ���� ����Ʈ�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է�
	ù° �ٿ� N�� L�� �־�����. N�� 1,000,000,000���� �۰ų� ���� �ڿ����̰�, L�� 2���� ũ�ų� ����, 100���� �۰ų� ���� �ڿ����̴�.
	
	���
	���� ����Ʈ�� ���̰� 100���� �۰ų� ������, ���ӵ� ���� ù° �ٿ� �������� �����Ͽ� ����Ѵ�. ���� ���̰� 100���� ũ�ų� �׷��� ������ ���� ���� -1�� ����Ѵ�.
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
