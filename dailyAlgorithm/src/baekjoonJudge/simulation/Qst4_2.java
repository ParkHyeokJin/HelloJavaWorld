package baekjoonJudge.simulation;

import org.junit.*;
/*
	����
	N�� L�� �־��� ��, ���� N�̸鼭, ���̰� ��� L�̸鼭 ���� ª�� ���ӵ� ���� �ƴ� ���� ����Ʈ�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է�
	ù° �ٿ� N�� L�� �־�����. N�� 1,000,000,000���� �۰ų� ���� �ڿ����̰�, L�� 2���� ũ�ų� ����, 100���� �۰ų� ���� �ڿ����̴�.
	
	���
	���� ����Ʈ�� ���̰� 100���� �۰ų� ������, ���ӵ� ���� ù° �ٿ� �������� �����Ͽ� ����Ѵ�. ���� ���̰� 100���� ũ�ų� �׷��� ������ ���� ���� -1�� ����Ѵ�.
*/
public class Qst4_2 {

	public static void main(String[] args) {
		int N = 0;
		int L = 0;
		N = 18;
		L = 2;
		int sum = 0;
		for(int j = L; j < 100; j++) {
			//L �� Ȧ�� �� ���( N % L = 0 �̿��� �Ѵ�. �¿� ��Ī)
			System.out.println(j);
			if(N % L == 0) {
				System.out.println("Ȧ��");
				for (int i = (N/j)-(j/2); i <= (N/j)+(j/2); i++) {
					sum += i;
					if(sum > N) {
						break;
					}
				}
			}else {
				System.out.println("¦��");
				for (int i = N/j-(j/2-1); i <= N % j; i++) {
					sum += i;
					if(sum > N) {
						break;
					}
				}
			}
			if(sum == N) {
				System.out.println(sum);
				break;
			}
		}
	}
	
	private static void oddNum(int i, int j) {
		
	}

	private static void evenNum(int N, int L) {
		
	}
	
	@Test
	public void testCase1() {
		
	}
}
