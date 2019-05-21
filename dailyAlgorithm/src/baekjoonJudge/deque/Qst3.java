package baekjoonJudge.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/*
	����
	�����̴� �ָ��� �� ���� ��� ���ο� ��� AC�� �������. AC�� ���� �迭�� ������ �ϱ� ���� ���� ����̴�. �� ���� �� ���� �Լ� R(������)�� D(������)�� �ִ�.
	
	�Լ� R�� �迭�� �ִ� ������ ������ ������ �Լ��̰�, D�� ù ��° ���ڸ� ������ �Լ��̴�. �迭�� ����ִµ� D�� ����� ��쿡�� ������ �߻��Ѵ�.
	
	�Լ��� �����ؼ� �� ���� ����� �� �ִ�. ���� ���, "AB"�� A�� ������ ������ �ٷ� �̾ B�� �����ϴ� �Լ��̴�. ���� ���, "RDD"�� �迭�� ������ ���� ó�� �� ���ڸ� ������ �Լ��̴�.
	
	�迭�� �ʱⰪ�� ������ �Լ��� �־����� ��, ���� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է�
	ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. T�� �ִ� 100�̴�.
	
	�� �׽�Ʈ ���̽��� ù° �ٿ��� ������ �Լ� p�� �־�����. p�� ���̴� 1���� ũ�ų� ����, 100,000���� �۰ų� ����.
	
	���� �ٿ��� �迭�� ����ִ� ���� ���� n�� �־�����. (0 �� n �� 100,000)
	
	���� �ٿ��� [x1,...,xn]�� ���� ���·� �迭�� ����ִ� ���� �־�����. (1 �� xi �� 100)
	
	��ü �׽�Ʈ ���̽��� �־����� p�� ������ �հ� n�� ���� 70���� ���� �ʴ´�.
	
	���
	�� �׽�Ʈ ���̽��� ���ؼ�, �Է����� �־��� ���� �迭�� �Լ��� ������ ����� ����Ѵ�. ����, ������ �߻��� ��쿡�� error�� ����Ѵ�.
 */
public class Qst3 {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int T = Integer.parseInt(reader.readLine());
			
			for(int i=0; i < T; i++) {
				//������ �Լ� P
				String p = reader.readLine();
				int n = Integer.parseInt(reader.readLine());
				
				String arrStr = reader.readLine().replace("[","").replace("]", "");
				String[] arr = arrStr.split(",");
				
				//���� �ʱ�ȭ
				Deque q = new LinkedList<Integer>();
				//---------
				for(int j = 0; j < n; j++) {
					q.add(Integer.parseInt(arr[j]));
				}
				
				boolean result = true;
				boolean left = true;
				for(int j = 0 ; j < p.length(); j++) {
					switch(p.charAt(j)) {
					case 'R' :
						if(left) {
							left = false;
						}else {
							left = true;
						}
						break;
					case 'D' :
						if(q.isEmpty()) {
							result = false;
							break;
						}
						if(left) {
							q.pollFirst();
						}else {
							q.pollLast();
						}
						break;
					}
					
				}
				if(result) {
					StringBuilder sb = new StringBuilder();
					if(left) {
						sb.append(q);
					}else {
						sb.append(R(q));
					}
					System.out.println(sb.toString());
				}else {
					System.out.println("error");
				}
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	//������(R�� �迭�� �ִ� ������ ������ ������ �Լ�)
	static Deque<Integer> R(Deque<Integer> q) {
		Deque<Integer> result = new LinkedList<Integer>();
		Iterator<Integer> it = q.descendingIterator();
		while(it.hasNext()) {
			result.add(it.next());
		}
		return result;
	}
}
