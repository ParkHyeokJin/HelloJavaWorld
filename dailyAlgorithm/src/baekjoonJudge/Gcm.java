package baekjoonJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 *  문제
		모든 자리가 1로만 이루어져있는 두 자연수 A와 B가 주어진다. 이때, A와 B의 최대 공약수를 구하는 프로그램을 작성하시오.
		예를 들어, A가 111이고, B가 1111인 경우에 A와 B의 최대공약수는 1이고, A가 111이고, B가 111111인 경우에는 최대공약수가 111이다.
	
	입력
		첫째 줄에 두 자연수 A와 B를 이루는 1의 개수가 주어진다. 입력되는 수는 263보다 작은 자연수이다.
	
	출력
		첫째 줄에 A와 B의 최대공약수를 출력한다. 정답은 천만 자리를 넘지 않는다.
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
	
	//최대공약수 (유클리드 호제법)
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
}