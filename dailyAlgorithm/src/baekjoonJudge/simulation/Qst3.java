package baekjoonJudge.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

/*
 	문제
	김지민은 N명이 참가하는 스타 토너먼트에 진출했다. 토너먼트는 다음과 같이 진행된다. 
	일단 N명의 참가자는 번호가 1번부터 N번까지 배정받는다. 그러고 난 후에 서로 인접한 번호끼리 스타를 한다. 
	이긴 사람은 다음 라운드에 진출하고, 진 사람은 그 라운드에서 떨어진다. 만약 그 라운드의 참가자가 홀수명이라면, 마지막 번호를 가진 참가자는 다음 라운드로 자동 진출한다. 
	다음 라운드에선 다시 참가자의 번호를 1번부터 매긴다. 이때, 번호를 매기는 순서는 처음 번호의 순서를 유지하면서 1번부터 매긴다. 
	이 말은 1번과 2번이 스타를 해서 1번이 진출하고, 3번과 4번이 스타를 해서 4번이 진출했다면, 4번은 다음 라운드에서 번호 2번을 배정받는다. 
	번호를 다시 배정받은 후에 한 명만 남을 때까지 라운드를 계속 한다.
	
	마침 이 스타 대회에 임한수도 참가했다. 김지민은 갑자기 스타 대회에서 우승하는 욕심은 없어지고, 몇 라운드에서 임한수와 대결하는지 궁금해졌다. 
	일단 김지민과 임한수는 서로 대결하기 전까지 항상 이긴다고 가정한다. 1 라운드에서 김지민의 번호와 임한수의 번호가 주어질 때, 과연 김지민과 임한수가 몇 라운드에서 대결하는지 출력하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 참가자의 수 N과 1 라운드에서 김지민의 번호와 임한수의 번호가 순서대로 주어진다. N은 100,000보다 작거나 같은 자연수이고, 김지민의 번호와 임한수의 번호는 N보다 작거나 같은 자연수이고, 서로 다르다.
	
	출력
	첫째 줄에 김지민과 임한수가 대결하는 라운드 번호를 출력한다. 만약 서로 대결하지 않을 때는 -1을 출력한다.
 */
public class Qst3 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = reader.readLine().split(" ");
		int ParticipantNum = Integer.parseInt(input[0]);
		int jimin = Integer.parseInt(input[1]);
		int hansu = Integer.parseInt(input[2]);
		System.out.println(tournament(ParticipantNum, jimin, hansu));
	}
	
	public static int tournament(int ParticipantNum, int jimin, int hansu) {
		Deque<Integer> member = new LinkedList<>();
		for(int i = 1; i <= ParticipantNum; i++) {
			member.add(i);
		}
		
		Deque<Integer> win = new LinkedList<>();
		int cnt = 0;
		while(true) {
			if(member.isEmpty()) {
				member.addAll(win);
				win.clear();
				cnt++;
			}
			if(member.size()==1) {
				win.add(member.poll());
			}else {
				int a = member.poll();
				int b = member.poll();
				if((a == jimin || a == hansu) && (b == jimin || b == hansu)) {
					System.out.println(a +"^"+b);
					cnt++;
					break;
				}else if (a == jimin || a == hansu){
					win.add(a);
				}else if (b == jimin || b == hansu){
					win.add(b);
				}else {
					win.add(a);
				}
			}
			System.out.println(win);
		}
		return cnt;
	}
	
	
	//홀수 체크
	public boolean oddNumberCheck(int num) {
		return num % 2 != 0 ? true : false;
	}
	
	@Test
	public void TestCase1() {
		Assert.assertEquals(tournament(8, 1, 6), 3);
		Assert.assertEquals(tournament(16, 8, 9), 4);
//		Assert.assertEquals(tournament(40, 1, 20), 5);
	}
}

