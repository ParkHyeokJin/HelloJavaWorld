package baekjoonJudge.simulation;

import org.junit.*;
/*
	문제
	N과 L이 주어질 때, 합이 N이면서, 길이가 적어도 L이면서 가장 짧은 연속된 음이 아닌 정수 리스트를 구하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 N과 L이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이고, L은 2보다 크거나 같고, 100보다 작거나 같은 자연수이다.
	
	출력
	만약 리스트의 길이가 100보다 작거나 같으면, 연속된 수를 첫째 줄에 공백으로 구분하여 출력한다. 만약 길이가 100보다 크거나 그러한 수열이 없을 때는 -1을 출력한다.
*/
public class Qst4_2 {

	public static void main(String[] args) {
		int N = 0;
		int L = 0;
		N = 18;
		L = 2;
		int sum = 0;
		for(int j = L; j < 100; j++) {
			//L 이 홀수 일 경우( N % L = 0 이여야 한다. 좌우 대칭)
			System.out.println(j);
			if(N % L == 0) {
				System.out.println("홀수");
				for (int i = (N/j)-(j/2); i <= (N/j)+(j/2); i++) {
					sum += i;
					if(sum > N) {
						break;
					}
				}
			}else {
				System.out.println("짝수");
				for (int i = N/j-(j/2-1); i <= N % j; i++) {
					sum += i;
					if(sum > N) {
						break;
					}
				}
			}
			if(sum == N) {
				System.out.println(sum);
				break;
			}
		}
	}
	
	private static void oddNum(int i, int j) {
		
	}

	private static void evenNum(int N, int L) {
		
	}
	
	@Test
	public void testCase1() {
		
	}
}
