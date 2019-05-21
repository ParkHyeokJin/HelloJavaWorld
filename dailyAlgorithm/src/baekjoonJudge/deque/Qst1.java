package baekjoonJudge.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

/*
 * 	����
	������ �����ϴ� ��(Deque)�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	����� �� ���� �����̴�.
	
	push_front X: ���� X�� ���� �տ� �ִ´�.
	push_back X: ���� X�� ���� �ڿ� �ִ´�.
	pop_front: ���� ���� �տ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	pop_back: ���� ���� �ڿ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	size: ���� ����ִ� ������ ������ ����Ѵ�.
	empty: ���� ��������� 1��, �ƴϸ� 0�� ����Ѵ�.
	front: ���� ���� �տ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	back: ���� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	�Է�
	ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. �Ѥ� �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.
	
	���
	����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
 */

public class Qst1 {

	public static void main(String[] args) throws Exception {
		Deque<Integer> deque = new LinkedList<>();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt  = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < cnt; i++) {
			String[] inputString = reader.readLine().split(" ");
			
			switch (inputString[0]) {
			case "push_front":
				deque.addFirst(Integer.parseInt(inputString[1]));
				break;
			case "push_back":
				deque.addLast(Integer.parseInt(inputString[1]));
				break;
			case "pop_front":
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.pollFirst());
				}
				break;
			case "pop_back":
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.pollLast());
				}
				break;
			case "size":
				System.out.println(deque.size());
				break;
			case "empty":
				if(deque.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				break;
			case "front":
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.getFirst());
				}
				break;
			case "back":
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.getLast());
				}
				break;
			default:
				break;
			}
		}
	}
}
