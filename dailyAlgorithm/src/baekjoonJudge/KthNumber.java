package baekjoonJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class KthNumber {

	/*
	 * K ��° ��(���� �˰��� 11004�� ����)
	 ����
	 	�� N�� A1, A2, ..., AN�� �־�����. A�� �������� �������� ��, �տ������� K��° �ִ� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 
	 �Է�
		ù° �ٿ� N(1 �� N �� 5,000,000)�� K (1 �� K �� N)�� �־�����.
		��°���� A1, A2, ..., AN�� �־�����. (-109 �� Ai �� 109)
		
	���
		A�� �������� ��, �տ������� K��° �ִ� ���� ����Ѵ�.
		
	����
		�Է� 
			5 2
			4 1 2 3 5
		���
			2
		
	 */
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] key = reader.readLine().split(" ");
			int maxNum = ValueToInt(key[0]);
			int chkNum= ValueToInt(key[1]);
			
			List<Integer> list = new ArrayList<>(maxNum);
			StringTokenizer st = new StringTokenizer(reader.readLine());
			while (st.hasMoreElements()) {
				list.add(ValueToInt(st.nextToken()));
			}
			
			list.sort(new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					if(o1 > o2) {
						return 1;
					}
					return -1;
				}
			});
			
			System.out.println(list.get(chkNum-1));
			
			//System.out.println(Sort(list, chkNum));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//�ð��ʰ���...
	public static int Sort(int[] list, int chkNum) {
		int result = 0;
		int tmp = 0;
		int minIdx = 0;
		for (int i = 0; i < list.length; i++) {
			int num = list[i];
			minIdx = i;
			for (int j = i+1; j < list.length; j++) {
				if(num >= list[j]) {
					num = list[j];
					minIdx = j;
				}
			}
			tmp = list[i];
			list[i] = list[minIdx];
			list[minIdx] = tmp;
			
			if(i == chkNum) {
				result = list[i-1];
				break;
			}
		}
		return result;
	}
	public static int ValueToInt(String num) {
		return Integer.parseInt(num);
	}
}
