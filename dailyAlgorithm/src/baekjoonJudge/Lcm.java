package baekjoonJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/***
 * 
 * @author User
 *
 	����
	�� �ڿ��� A�� B�� ���ؼ�, A�� ����̸鼭 B�� ����� �ڿ����� A�� B�� �������� �Ѵ�. �̷� ����� �߿��� ���� ���� ���� �ּҰ������� �Ѵ�. 
	���� ���, 6�� 15�� ������� 30, 60, 90���� ������, �ּ� ������� 30�̴�.
	�� �ڿ��� A�� B�� �־����� ��, A�� B�� �ּҰ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է�
	ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. ��° �ٺ��� T���� �ٿ� ���ļ� A�� B�� �־�����. (1 �� A, B �� 45,000)
	
	���
	ù° �ٺ��� T���� �ٿ� A�� B�� �ּҰ������ �Է¹��� ������� �� �ٿ� �ϳ��� ����Ѵ�.
	
 */
public class Lcm {
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
