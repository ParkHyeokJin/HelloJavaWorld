package baekjoonJudge.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
	����
		4���� ��ȣ ��(��, ��)��, ��[��, ��]���� �̿��ؼ� ��������� ��ȣ�� �߿��� �ùٸ� ��ȣ���̶� ������ ���� ���ǵȴ�.
		
		�� ���� ��ȣ�θ� �̷���� ��()���� ��[]���� �ùٸ� ��ȣ���̴�. 
		���� X�� �ùٸ� ��ȣ���̸� ��(X)���̳� ��[X]���� ��� �ùٸ� ��ȣ���� �ȴ�. 
		X�� Y ��� �ùٸ� ��ȣ���̶�� �̵��� ������ XY�� �ùٸ� ��ȣ���� �ȴ�.
		���� ��� ��(()[[]])���� ��(())[][]�� �� �ùٸ� ��ȣ�������� ��([)]�� �� ��(()()[]�� �� ��� �ùٸ� ��ȣ���� �ƴϴ�. 
		�츮�� � �ùٸ� ��ȣ�� X�� ���Ͽ� �� ��ȣ���� ��(��ȣ��)�� �Ʒ��� ���� �����ϰ� ��(X)�� ǥ���Ѵ�. 
		
		��()�� �� ��ȣ���� ���� 2�̴�.
		��[]�� �� ��ȣ���� ���� 3�̴�.
		��(X)�� �� ��ȣ���� 2����(X) ���� ���ȴ�.
		��[X]�� �� ��ȣ���� 3����(X) ���� ���ȴ�.
		�ùٸ� ��ȣ�� X�� Y�� ���յ� XY�� ��ȣ���� ��(XY)= ��(X)+��(Y) �� ���ȴ�.
		���� ��� ��(()[[]])([])�� �� ��ȣ���� ���غ���.  ��()[[]]�� �� ��ȣ���� 2 + 3��3=11 �̹Ƿ�  ��(()[[ ]])���� ��ȣ���� 2��11=22 �̴�. 
		�׸���  ��([])���� ���� 2��3=6 �̹Ƿ� ��ü ��ȣ���� ���� 22 + 6 = 28 �̴�.
		
		�������� Ǯ��� �� ������ �־��� ��ȣ���� �а� �� ��ȣ���� �տ��� �����Ѵ�� ����Ͽ� ����ϴ� ���̴�. 
	
	�Է�
		ù° �ٿ� ��ȣ���� ��Ÿ���� ���ڿ�(��Ʈ��)�� �־�����. �� �� ���̴� 1 �̻�, 30 �����̴�.
	
	���
		ù° �ٿ� �� ��ȣ���� ���� ��Ÿ���� ������ ����Ѵ�. ���� �Է��� �ùٸ��� ���� ��ȣ���̸� �ݵ�� 0�� ����ؾ� �Ѵ�. 
*/
public class Qst4 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String values = reader.readLine();
		
		if(!vpsCheck(values)) {
			System.out.println("0");
			return;
		}
		
		Stack<String> stack = new Stack<>();
		for(int i = 0; i < values.length(); i++) {
			char tmp = values.charAt(i);
			stack.push(String.valueOf(tmp));
//			if(tmp == '(') {
//				stack.push("2");
//			}else if(tmp == '[') {
//				stack.push("3");
//			}
		}
		System.out.println(stack);
		
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) {
			String tmp = stack.pop();
			
			if(tmp.equals(")")) {
			}
			
		}
		System.out.println(sb);
	}
	
	static boolean vpsCheck(String sb){
		Stack<String> stack = new Stack<String>();
		for (int j = 0; j < sb.length(); j++) {
			char tmp = sb.charAt(j);
			if(tmp == '('){
				stack.push("(");
			}else if(tmp == ')'){
				if(stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}else if(tmp == '['){
				stack.push("[");
			}else if(tmp == ']'){
				if(stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}
