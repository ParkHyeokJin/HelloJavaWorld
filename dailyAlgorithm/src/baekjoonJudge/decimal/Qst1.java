package baekjoonJudge.decimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 *  ����
	�־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է�
	ù �ٿ� ���� ���� N�� �־�����. N�� 100�����̴�. �������� N���� ���� �־����µ� ���� 1,000 ������ �ڿ����̴�.
	
	���
	�־��� ���� �� �Ҽ��� ������ ����Ѵ�.
 */
public class Qst1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		List<Integer> primeList = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(reader.readLine());
		String[] primeNumbers = reader.readLine().split(" ");
		
		for (String i : primeNumbers) {
			int number = Integer.parseInt(i);
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
		System.out.println(list.size());
	}
}
