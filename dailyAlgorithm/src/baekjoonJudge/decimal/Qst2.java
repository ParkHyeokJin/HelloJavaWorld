package baekjoonJudge.decimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 *  ����
	�ڿ��� M�� N�� �־��� �� M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ��� �̵� �Ҽ��� �հ� �ּڰ��� ã�� ���α׷��� �ۼ��Ͻÿ�.
	
	���� ��� M=60, N=100�� ��� 60�̻� 100������ �ڿ��� �� �Ҽ��� 61, 67, 71, 73, 79, 83, 89, 97 �� 8���� �����Ƿ�, �̵� �Ҽ��� ���� 620�̰�, �ּڰ��� 61�� �ȴ�.
	
	�Է�
	�Է��� ù° �ٿ� M��, ��° �ٿ� N�� �־�����.
	
	M�� N�� 10,000������ �ڿ����̸�, M�� N���� �۰ų� ����.
	
	���
	M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ã�� ù° �ٿ� �� ����, ��° �ٿ� �� �� �ּڰ��� ����Ѵ�. 
	
	��, M�̻� N������ �ڿ��� �� �Ҽ��� ���� ���� ù° �ٿ� -1�� ����Ѵ�.
 */
public class Qst2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		List<Integer> primeList = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int min = Integer.parseInt(reader.readLine());
		int max = Integer.parseInt(reader.readLine());
		
		for(int i = min; i <= max; i++) {
			int number = i;
			if(number > 1) {
				primeList.add(number);
			}
		}
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < primeList.size(); i++) {
			boolean prime = true;
			int number = primeList.get(i);
			if (number > 2) {
				for(int j = 2; j < number; j++) {
					if(number % j == 0 ) {
						prime = false;
						break;
					}
				}
			}
			if(prime) {
				list.add(number);
			}
		}
		int sum = 0;
		if(list.size() > 0) {
			for (Integer integer : list) {
				sum += integer;
			}
			System.out.println(sum);
			System.out.println(list.get(0));
		}else {
			System.out.println(-1);
		}
	}
}
