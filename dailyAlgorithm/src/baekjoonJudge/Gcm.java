package baekjoonJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 *  ����
		��� �ڸ��� 1�θ� �̷�����ִ� �� �ڿ��� A�� B�� �־�����. �̶�, A�� B�� �ִ� ������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		���� ���, A�� 111�̰�, B�� 1111�� ��쿡 A�� B�� �ִ������� 1�̰�, A�� 111�̰�, B�� 111111�� ��쿡�� �ִ������� 111�̴�.
	
	�Է�
		ù° �ٿ� �� �ڿ��� A�� B�� �̷�� 1�� ������ �־�����. �ԷµǴ� ���� 263���� ���� �ڿ����̴�.
	
	���
		ù° �ٿ� A�� B�� �ִ������� ����Ѵ�. ������ õ�� �ڸ��� ���� �ʴ´�.
 */
public class Gcm {
	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] str = reader.readLine().toString().split(" ");
			long a = Long.parseLong(str[0]);
			long b = Long.parseLong(str[1]);
			long gcd = gcd(a, b);
			
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < gcd; i++) {
				sb.append("1");
			}
			System.out.print(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//�ִ����� (��Ŭ���� ȣ����)
	static long gcd(long a, long b) {
		long max = 0;
		long min = 0;
		
		//ū�� ���
		if ( a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		long r = max % min;
		if( r == 0) {
			return min;
		}else {
			return gcd(min, r);
		}
	}
}