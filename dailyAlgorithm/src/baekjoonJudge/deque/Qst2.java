package baekjoonJudge.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Qst2 {

	/*
	����
	�����̴� N���� ���Ҹ� �����ϰ� �ִ� ����� ��ȯ ť�� ������ �ִ�. �����̴� �� ť���� �� ���� ���Ҹ� �̾Ƴ����� �Ѵ�.
	
	�����̴� �� ť���� ������ ���� 3���� ������ ������ �� �ִ�.
	
	ù ��° ���Ҹ� �̾Ƴ���. �� ������ �����ϸ�, ���� ť�� ���Ұ� a1, ..., ak�̾��� ���� a2, ..., ak�� ���� �ȴ�.
	�������� �� ĭ �̵���Ų��. �� ������ �����ϸ�, a1, ..., ak�� a2, ..., ak, a1�� �ȴ�.
	���������� �� ĭ �̵���Ų��. �� ������ �����ϸ�, a1, ..., ak�� ak, a1, ..., ak-1�� �ȴ�.
	ť�� ó���� ���ԵǾ� �ִ� �� N�� �־�����. �׸��� �����̰� �̾Ƴ����� �ϴ� ������ ��ġ�� �־�����. (�� ��ġ�� ���� ó�� ť������ ��ġ�̴�.) 
	�̶�, �� ���Ҹ� �־��� ������� �̾Ƴ��µ� ��� 2��, 3�� ������ �ּڰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է�
	ù° �ٿ� ť�� ũ�� N�� �̾Ƴ����� �ϴ� ���� ���� M�� �־�����. N�� 50���� �۰ų� ���� �ڿ����̰�, M�� N���� �۰ų� ���� �ڿ����̴�. 
	��° �ٿ��� �����̰� �̾Ƴ����� �ϴ� ���� ��ġ�� ������� �־�����. ��ġ�� 1���� ũ�ų� ����, N���� �۰ų� ���� �ڿ����̴�.
	
	
	���
	ù° �ٿ� ������ ������ ����Ѵ�.
	 */
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputStr = reader.readLine().split(" ");
		//ť�� ũ��
		int n = Integer.parseInt(inputStr[0]);
		//�̾Ƴ����� �ϴ� ���� ����
		int m = Integer.parseInt(inputStr[1]);
		
		Deque<Integer> deque = new LinkedList<>();
		String[] popArr = reader.readLine().split(" ");
		
		for(int i = 1; i<=n; i++) {
			deque.add(i);
		}
		
		for(int i = 0; i < m; i++) {
			int searchNum = Integer.parseInt(popArr[i]);
			dequeSearch(deque, searchNum);
		}
		System.out.println(cnt);
	}
	
	static int cnt = 0;
	static int dequeSearch(Deque<Integer> deque, int searchNum) {
		int index = 0;
		Iterator it = deque.iterator();
		while(it.hasNext()) {
			int num = (int)it.next();
			if(num == searchNum) {
				break;
			}else {
				index++;
			}
		}
		
		if(deque.size() / 2 >= index) {
			if(deque.getFirst() == searchNum) {
				return deque.pollFirst(); 
			}else {
				cnt++;
				deque.addLast(deque.pollFirst());
				return dequeSearch(deque, searchNum);
			}
		}else {
			if(deque.getFirst() == searchNum) {
				return deque.pollLast(); 
			}else {
				cnt++;
				deque.addFirst(deque.pollLast());
				return dequeSearch(deque, searchNum);
			}
		}
	}

}
