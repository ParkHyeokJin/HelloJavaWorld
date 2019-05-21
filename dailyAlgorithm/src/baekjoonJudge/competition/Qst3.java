package baekjoonJudge.competition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
      문제
	혁진이는 알고리즘 문제를 만들라는 독촉을 받아 스트레스다. 하지만 피보나치 문제는 너무 많이 봐서 지겹기 그지없다. 
	그러나 문제를 만들 시간이 없는 혁진이는 피보나치 문제를 응용해서 문제를 만들려 한다.
	
	 int fibonacci(int n) { // 호출
	  if (n < 2) {
	    return n;
	  }  
	  return fibonacci(n-2) + fibonacci(n-1);
	}
	위와 같이 코딩하였을 때 fibonacci(n)를 입력했을 때에 fibonacci 함수가 호출되는 횟수를 계산해보자.
	
	입력
	fibonacci 함수에 인자로 입력할 N이 주어진다. (0 ≤ N ≤ 50)
	
	출력
	fibonacci 함수가 호출된 횟수를 출력한다.
	
	출력값이 매우 커질 수 있으므로 정답을 1,000,000,007 로 나눈 나머지를 출력한다.
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
	int fibonacci(int n) { // 호출
		cnt ++;
		if (n < 2) {
			return n;
		}
		return fibonacci(n - 2) + fibonacci(n - 1);
	}
}
