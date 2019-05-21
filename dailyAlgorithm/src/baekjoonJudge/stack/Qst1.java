package baekjoonJudge.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/*
 * ����
	������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	����� �� �ټ� �����̴�.
	
	push X: ���� X�� ���ÿ� �ִ� �����̴�.
	pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
	empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
	top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	�Է�
	ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.
	
	���
	����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
 */

public class Qst1 {

	static Stack<Integer> result = new Stack<Integer>();
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int cnt = Integer.parseInt(br.readLine());
			for (int i = 0; i < cnt; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				stackProc(st);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	static void stackProc(StringTokenizer st){
		switch (st.nextToken()) {
		case "push":
			result.push(Integer.parseInt(st.nextToken()));
			break;
		case "pop":
			if(!result.isEmpty()){
				System.out.println(result.pop());
			}else{
				System.out.println(-1);
			}
			break;
		case "size":
			System.out.println(result.size());
			break;
		case "empty":
			if(result.isEmpty()){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
			break;
		case "top":
			if(result.isEmpty()){
				System.out.println(-1);
			}else{
				System.out.println(result.peek());
			}
			break;
		default:
			break;
		}
	}
}
