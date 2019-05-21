package baekjoonJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindFraction {
	/*
	����
		������ ū �迭�� ������ ���� �м����� �����ִ�.
		
		1/1	1/2	1/3	1/4	1/5	��
		2/1	2/2	2/3	2/4	��	��
		3/1	3/2	3/3	��	��	��
		4/1	4/2	��	��	��	��
		5/1	��	��	��	��	��
		��	��	��	��	��	��
		�̿� ���� ������ �м����� 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> �� �� ���� ������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м���� ����.
		
		X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
	�Է�
		ù° �ٿ� X(1 �� X �� 10,000,000)�� �־�����.
		
	���
		ù° �ٿ� �м��� ����Ѵ�.
	 */
	static int cnt = 1;
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(reader.readLine());
		int m = molecule(x);
		System.out.println(cnt + "/" + m);
	}
	private static int molecule(int num) {
		if(num <= 10) {
			return num;
		}else {
			cnt++;
			return molecule(num-10);
		} 
	}
}	
