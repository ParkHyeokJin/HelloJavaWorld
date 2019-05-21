package baekjoonJudge.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;
/*
 * ����
	���� (stack)�� �⺻���� �ڷᱸ�� �� �ϳ���, ��ǻ�� ���α׷��� �ۼ��� �� ���� �̿�Ǵ� �����̴�. 
	������ �ڷḦ �ִ� (push) �Ա��� �ڷḦ �̴� (pop) �Ա��� ���� ���� ���߿� �� �ڷᰡ ���� ���� ������ (LIFO, Last in First out) Ư���� ������ �ִ�.
	
	1���� n������ ���� ���ÿ� �־��ٰ� �̾� �þ�������ν�, �ϳ��� ������ ���� �� �ִ�. �̶�, ���ÿ� push�ϴ� ������ �ݵ�� ���������� ��Ű���� �Ѵٰ� ����. 
	������ ������ �־����� �� ������ �̿��� �� ������ ���� �� �ִ��� ������, �ִٸ� � ������ push�� pop ������ �����ؾ� �ϴ����� �˾Ƴ� �� �ִ�. �̸� ����ϴ� ���α׷��� �ۼ��϶�.
	
	�Է�
	ù �ٿ� n (1 �� n �� 100,000)�� �־�����. ��° �ٺ��� n���� �ٿ��� ������ �̷�� 1�̻� n������ ������ �ϳ��� ������� �־�����. ���� ���� ������ �� �� ������ ���� ����.
	
	���
	�Էµ� ������ ����� ���� �ʿ��� ������ �� �ٿ� �� ���� ����Ѵ�. push������ +��, pop ������ -�� ǥ���ϵ��� �Ѵ�. �Ұ����� ��� NO�� ����Ѵ�.
	
	��Ʈ
	1���� n������ ���� ���� ���ʷ� [push, push, push, push, pop, pop, push, push, pop, push, push, pop, pop, pop, pop, pop] ������ �����ϸ� 
	���� [4, 3, 6, 8, 7, 5, 2, 1]�� ���� �� �ִ�.
 */


public class Qst2 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int tmp = 1;
			int cnt = Integer.parseInt(br.readLine());
			List<String> arr = new ArrayList<>();
			for (int i = 0; i < cnt; i++) {
				int inputNum = Integer.parseInt(br.readLine());
				//4
				if(stack.contains(inputNum)){
					for (int j = 0; j < cnt; j++) {
						if(inputNum != stack.peek()){
							stack.pop();
							arr.add("-");
						}else{
							stack.pop();
							arr.add("-");
							break;							
						}
					}					
				}else{
					for (int j = tmp; j <= inputNum; j++) {
						stack.push(tmp++);
						arr.add("+");
					}
					stack.pop();
					arr.add("-");
				}
			}
			for (String num : arr) {
				System.out.println(num);
			}
		}catch(EmptyStackException e){
			System.out.println("NO");
		}catch (IOException e) {
		}
	}
}
