package baekjoonJudge.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/*
 * 
  	����
	�����е� �˴ٽ��� �������� ������ ���� �������� �μ��ϰ��� �ϴ� ������ �μ� ����� ���� ��������Ρ�, �� ���� ��û�� ���� ���� �μ��Ѵ�. 
	���� ���� ������ ���δٸ� Queue �ڷᱸ���� �׿��� FIFO - First In First Out - �� ���� �μⰡ �ǰ� �ȴ�. 
	������ ����̴� ���ο� �����ͱ� ���� ����Ʈ��� �����Ͽ��µ�, �� �����ͱ�� ������ ���� ���ǿ� ���� �μ⸦ �ϰ� �ȴ�.
	
	���� Queue�� ���� �տ� �ִ� ������ ���߿䵵���� Ȯ���Ѵ�.
	������ ������ �� ���� �������� �߿䵵�� ���� ������ �ϳ��� �ִٸ�, �� ������ �μ����� �ʰ� Queue�� ���� �ڿ� ���ġ �Ѵ�. �׷��� �ʴٸ� �ٷ� �μ⸦ �Ѵ�.
	���� ��� Queue�� 4���� ����(A B C D)�� �ְ�, �߿䵵�� 2 1 4 3 ��� C�� �μ��ϰ�, �������� D�� �μ��ϰ� A, B�� �μ��ϰ� �ȴ�.
	
	�������� �� ����, ���� Queue�� �ִ� ������ ���� �߿䵵�� �־����� ��, � �� ������ �� ��°�� �μ�Ǵ��� �˾Ƴ��� ���̴�. ���� ��� ���� ������ C������ 1��°��, A������ 3��°�� �μ�ǰ� �ȴ�.
	
	�Է�
	ù �ٿ� test case�� ���� �־�����. 
	�� test case�� ���ؼ� ������ �� N(100����)�� �� ��°�� �μ�Ǿ����� �ñ��� ������ ���� Queue�� � ��ġ�� �ִ����� �˷��ִ� M(0�̻� N�̸�)�� �־�����. 
	�����ٿ� N�� ������ �߿䵵�� �־����µ�, �߿䵵�� 1 �̻� 9 �����̴�. �߿䵵�� ���� ������ ���� �� ���� ���� �ִ�. ���� ���� N=4, M=0(A������ �ñ��ϴٸ�), �߿䵵�� 2 1 4 3�� �ȴ�.
	
	���
	�� test case�� ���� ������ �� ��°�� �μ�Ǵ��� ����Ѵ�.
 */
public class Qst3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//�׽�Ʈ ���̽�
		int testCaseCnt = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < testCaseCnt; i++) {
			String[] document = reader.readLine().split(" ");
			
			//������ �� N(100����)
			int N = Integer.parseInt(document[0]);
			//Queue�� � ��ġ�� �ִ����� �˷��ִ� M(0�̻� N�̸�)
			int M = Integer.parseInt(document[1]);
			
			String[] order = reader.readLine().split(" ");
			PriorityQueue<Integer> printQ = new PriorityQueue<Integer>(N);
			for (int j = 0; j < N; j++) {
				printQ.add(Integer.parseInt(order[j]));
			}
			System.out.println(printQ);
			
			int orderCnt = 1;
			for (int j = 0; j < M; j++) {
				printQ.remove();
				orderCnt++;
			}
			System.out.println(orderCnt);
		}
	}
}
