package baekjoonJudge.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

/*
 	����
	�������� N���� �����ϴ� ��Ÿ ��ʸ�Ʈ�� �����ߴ�. ��ʸ�Ʈ�� ������ ���� ����ȴ�. 
	�ϴ� N���� �����ڴ� ��ȣ�� 1������ N������ �����޴´�. �׷��� �� �Ŀ� ���� ������ ��ȣ���� ��Ÿ�� �Ѵ�. 
	�̱� ����� ���� ���忡 �����ϰ�, �� ����� �� ���忡�� ��������. ���� �� ������ �����ڰ� Ȧ�����̶��, ������ ��ȣ�� ���� �����ڴ� ���� ����� �ڵ� �����Ѵ�. 
	���� ���忡�� �ٽ� �������� ��ȣ�� 1������ �ű��. �̶�, ��ȣ�� �ű�� ������ ó�� ��ȣ�� ������ �����ϸ鼭 1������ �ű��. 
	�� ���� 1���� 2���� ��Ÿ�� �ؼ� 1���� �����ϰ�, 3���� 4���� ��Ÿ�� �ؼ� 4���� �����ߴٸ�, 4���� ���� ���忡�� ��ȣ 2���� �����޴´�. 
	��ȣ�� �ٽ� �������� �Ŀ� �� �� ���� ������ ���带 ��� �Ѵ�.
	
	��ħ �� ��Ÿ ��ȸ�� ���Ѽ��� �����ߴ�. �������� ���ڱ� ��Ÿ ��ȸ���� ����ϴ� ����� ��������, �� ���忡�� ���Ѽ��� ����ϴ��� �ñ�������. 
	�ϴ� �����ΰ� ���Ѽ��� ���� ����ϱ� ������ �׻� �̱�ٰ� �����Ѵ�. 1 ���忡�� �������� ��ȣ�� ���Ѽ��� ��ȣ�� �־��� ��, ���� �����ΰ� ���Ѽ��� �� ���忡�� ����ϴ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է�
	ù° �ٿ� �������� �� N�� 1 ���忡�� �������� ��ȣ�� ���Ѽ��� ��ȣ�� ������� �־�����. N�� 100,000���� �۰ų� ���� �ڿ����̰�, �������� ��ȣ�� ���Ѽ��� ��ȣ�� N���� �۰ų� ���� �ڿ����̰�, ���� �ٸ���.
	
	���
	ù° �ٿ� �����ΰ� ���Ѽ��� ����ϴ� ���� ��ȣ�� ����Ѵ�. ���� ���� ������� ���� ���� -1�� ����Ѵ�.
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
	
	
	//Ȧ�� üũ
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

