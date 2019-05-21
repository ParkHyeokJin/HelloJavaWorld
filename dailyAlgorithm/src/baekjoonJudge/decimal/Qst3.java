package baekjoonJudge.decimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 *  문제
	M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000)
	
	출력
	한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 */
public class Qst3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = reader.readLine().split(" ");
		
		int m = Integer.parseInt(str[0]);
		int n = Integer.parseInt(str[1]);
		
		List<Boolean> primeList = new ArrayList<>(n+1);
		// 0번째와 1번째를 소수 아님으로 처리
		primeList.add(false);
		primeList.add(false);
		// 2~ n 까지 소수로 설정
		for(int i=2; i<=n; i++ ) {
			primeList.add(i, true);
		}
		// 2 부터  ~ i*i <= n
		// 각각의 배수들을 지워간다.
		for(int i=2; (i*i)<=n; i++){
			if(primeList.get(i)){
				for(int j = i*i; j<=n; j+=i) primeList.set(j, false);
			}
		}
		StringBuffer sb = new StringBuffer();
		for(int i=m; i<=n; i++){
			if(primeList.get(i) == true){
				sb.append(i);
				sb.append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}
