package baekjoonJudge.competition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
      ����
	�����̴� �˰��� ������ ������ ������ �޾� ��Ʈ������. ������ �Ǻ���ġ ������ �ʹ� ���� ���� ����� ��������. 
	�׷��� ������ ���� �ð��� ���� �����̴� �Ǻ���ġ ������ �����ؼ� ������ ����� �Ѵ�.
	
	 int fibonacci(int n) { // ȣ��
	  if (n < 2) {
	    return n;
	  }  
	  return fibonacci(n-2) + fibonacci(n-1);
	}
	���� ���� �ڵ��Ͽ��� �� fibonacci(n)�� �Է����� ���� fibonacci �Լ��� ȣ��Ǵ� Ƚ���� ����غ���.
	
	�Է�
	fibonacci �Լ��� ���ڷ� �Է��� N�� �־�����. (0 �� N �� 50)
	
	���
	fibonacci �Լ��� ȣ��� Ƚ���� ����Ѵ�.
	
	��°��� �ſ� Ŀ�� �� �����Ƿ� ������ 1,000,000,007 �� ���� �������� ����Ѵ�.
 */
public class Qst3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Qst3 q = new Qst3();
		q.cnt = 0;
		q.fibonacci(Integer.parseInt(reader.readLine()));
		System.out.println(q.cnt%1_000_000_007);
	}
	
	int cnt = 0;
	int fibonacci(int n) { // ȣ��
		cnt ++;
		if (n < 2) {
			return n;
		}
		return fibonacci(n - 2) + fibonacci(n - 1);
	}
}
