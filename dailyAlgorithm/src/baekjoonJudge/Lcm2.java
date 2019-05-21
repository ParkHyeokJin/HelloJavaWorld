package baekjoonJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 	����
		���� B�� 0���� ū ������ N�� ���� ���� A�� ���� �� �ִٸ�, A�� B�� ����̴�.
		
		��:
		
		10�� 5�� ����̴� (5*2 = 10)
		10�� 10�� ����̴�(10*1 = 10)
		6�� 1�� ����̴�(1*6 = 6)
		20�� 1, 2, 4,5,10,20�� ����̴�.
		�ٸ� ��:
		
		2�� 5�� �ּҰ������ 10�̰�, �� ������ 2�� 5���� ���� ������� ���� �����̴�.
		10�� 20�� �ּҰ������ 20�̴�.
		5�� 3�� �ּҰ������ 15�̴�.
		����� �� ���� ���Ͽ� �ּҰ������ ���ϴ� ���α׷��� �ۼ� �ϴ� ���� ��ǥ�̴�.
		
	�Է�
		�� �ٿ� �� ���� A�� B�� �������� �и��Ǿ� �־�����.
		
		50%�� �Է� �� A�� B�� 1000(103)���� �۴�. �ٸ� 50%�� �Է��� 1000���� ũ�� 100000000(108)���� �۴�.
		
		�߰�: ū �� �Է¿� ���Ͽ� ������ 64��Ʈ ������ �����Ͻÿ�. C/C++������ long long int�� ����ϰ�, Java������ long�� ����Ͻÿ�.
		
	���
		A�� B�� �ּҰ������ �� �ٿ� ����Ѵ�.
 */
public class Lcm2 {
	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			String[] str = reader.readLine().toString().split(" ");
			long a = Integer.parseInt(str[0]);
			long b = Integer.parseInt(str[1]);
			
			System.out.println(lcm(a, b, gcd(a, b)));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//�ִ�����
	//gcd(A,B) = gcd(B,R) / ex) gcd(15,12) = gcd(12,3)
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
	
	//�ּ� �����
	//LCM = a x b x GCD = A x B / gcd
	static long lcm(long a, long b, long gcd) {
		return (a * b) / gcd;
	}
}
