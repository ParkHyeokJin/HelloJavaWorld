package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] str = reader.readLine().toString().split(" ");
			long a = Long.parseLong(str[0]);
			long b = Long.parseLong(str[1]);
			long gcm = gcm(a, b);
			
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < gcm; i++) {
				sb.append("1");
			}
			System.out.print(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//최대공약수 (유클리드 호제법)
	//GCM(A,B) = GCM(B,R) / ex) GCM(15,12) = GCM(12,3)
	static long gcm(long a, long b) {
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
			return gcm(min, r);
		}
	}
}
