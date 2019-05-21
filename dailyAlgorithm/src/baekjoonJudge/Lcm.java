package baekjoonJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/***
 * 
 * @author User
 *
 	문제
	두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다. 이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 
	예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.
	두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 둘째 줄부터 T개의 줄에 걸쳐서 A와 B가 주어진다. (1 ≤ A, B ≤ 45,000)
	
	출력
	첫째 줄부터 T개의 줄에 A와 B의 최소공배수를 입력받은 순서대로 한 줄에 하나씩 출력한다.
	
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
	
	//최대공약수
	//gcd(A,B) = gcd(B,R) / ex) gcd(15,12) = gcd(12,3)
	static long gcd(long a, long b) {
		long max = 0;
		long min = 0;
		
		//큰수 계산
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
	
	//최소 공배수
	//LCM = a x b x GCD = A x B / gcd
	static long lcm(long a, long b, long gcd) {
		return (a * b) / gcd;
	}
}
