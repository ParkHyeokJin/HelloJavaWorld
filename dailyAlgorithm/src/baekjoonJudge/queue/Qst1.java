package baekjoonJudge.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/*
	����
	������ �����ϴ� ť�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	����� �� ���� �����̴�.
	
	push X: ���� X�� ť�� �ִ� �����̴�.
	pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	size: ť�� ����ִ� ������ ������ ����Ѵ�.
	empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
	front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	�Է�
	ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.
	
	���
	����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
 */
public class Qst1 {
	static LinkedList<Integer> queue = new LinkedList<Integer>();
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int commandCnt = Integer.parseInt(reader.readLine());
		for(int i=0; i < commandCnt; i++) {
			queueProc(reader.readLine());	
		}
	}
	
	private static void queueProc(String commandStr) {
		StringTokenizer st = new StringTokenizer(commandStr);
		String command = st.nextToken();
		switch (command) {
		case "push":
			queue.add(Integer.parseInt(st.nextToken()));
			break;
		case "front":
			if(queue.peekFirst() != null) {
				System.out.println(queue.peekFirst());
			}else {
				System.out.println(-1);
			}
			break;
		case "back":
			if(queue.peekLast() != null) {
				System.out.println(queue.peekLast());
			}else {
				System.out.println(-1);
			}
			break;
		case "size":
			System.out.println(queue.size());
			break;
		case "empty":
			if(queue.isEmpty()) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
			break;
		case "pop":
			if(queue.peekFirst() != null) {
				System.out.println(queue.pop());
			}else {
				System.out.println(-1);
			}
			break;
		default:
			break;
		}
	}
}
