package baekjoonJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Radius {
	public static void main(String[] args) {	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int cnt = Integer.parseInt(reader.readLine());
			String[] value = reader.readLine().split(" ");
			int[] ringArr = new int[cnt];
			for (int i = 0; i < value.length; i++) {
				ringArr[i] = Integer.parseInt(value[i]);
			}
			
			int firstRing = ringArr[0];
			for (int i = 1; i < ringArr.length; i++) {
				int lcm = lcm(firstRing, ringArr[i], gcd(firstRing, ringArr[i]));
				System.out.println((lcm / ringArr[i])+"/"+(lcm / firstRing));
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	//최대공약수
	//gcd(A,B) = gcd(B,R) / ex) gcd(15,12) = gcd(12,3)
	static int gcd(int a, int b) {
		int max = 0;
		int min = 0;
		
		//큰수 계산
		if ( a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		int r = max % min;
		if( r == 0) {
			return min;
		}else {
			return gcd(min, r);
		}
	}
	
	//최소 공배수
	//LCM = a x b x GCD = A x B / gcd
	static int lcm(int a, int b, int gcd) {
		return (a * b) / gcd;
	}
	
}
