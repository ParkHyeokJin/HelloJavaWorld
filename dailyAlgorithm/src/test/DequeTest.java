package test;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeTest {

	public static void main(String[] args) {
		
		Deque<Integer> q = new LinkedList<>();
		long start = System.currentTimeMillis();
		for(int i=0; i < 1_000_000; i++) {
			q.add(i);
		}
		System.out.println(System.currentTimeMillis() - start + "ms");
		System.out.println(q.size());
		
		String command = "RRRRRRRRRR";
		
		start = System.currentTimeMillis();
		for(int i = 0; i < command.length(); i++) {
			q = R(q);
		}
		System.out.println(q.getFirst());
		System.out.println(System.currentTimeMillis() - start + "ms");			
		
		start = System.currentTimeMillis();
		boolean left = true;
		for(int i = 0; i < command.length(); i++) {
			if(left) {
				left = false;
			}else {
				left = true;
			}
		}	
		if(left) {
			System.out.println(q.getFirst());
		}else {
			q = R(q);
		}
		System.out.println(System.currentTimeMillis() - start + "ms");
	}
	
	//뒤집기(R은 배열에 있는 숫자의 순서를 뒤집는 함수)
	static Deque<Integer> R(Deque<Integer> q) {
		Deque<Integer> result = new LinkedList<Integer>();
		Iterator<Integer> it = q.descendingIterator();
		while(it.hasNext()) {
			result.add(it.next());
		}
		return result;
	}
}
