package baekjoonJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
      ����
	Ʈ���� Ÿ�� �̵��ϴ� ����̴� ������ �˹��� �ް� �Ǿ���. ������ ����̰� ����ϴ� ȭ���� �ϳ��ϳ� ��� Ȯ���� ���̱� ������, �˹��ϴµ� ��û���� ���� �ð��� �ɸ���.
	����̴� �ð��� ����� ���ؼ� ���� ������ �ϱ�� �ߴ�.	
	���� ��ó�� ���̴� ���� N���� ���̿� ���´�. �� ����, ���̿� ���� ���� M���� �������� ��, �������� ��� ���� �Ǵ� M�� ��� ã������ �Ѵ�. M�� 1���� Ŀ�� �Ѵ�.	
	N���� ���� �־����� ��, ������ M�� ��� ã�� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է�
	ù° �ٿ� ���̿� ���� ���� ���� N�� �־�����. (2 �� N �� 100)	
	���� �ٺ��� N�� �ٿ��� ���̿� ���� ���� �ϳ��� �־�����. �� ���� ��� 1���� ũ�ų� ����, 1,000,000,000���� �۰ų� ���� �ڿ����̴�. ���� ���� �� �� �̻� �־����� �ʴ´�.	
	�׻� M�� �ϳ� �̻� �����ϴ� ��츸 �Է����� �־�����.
	
	���
	ù° �ٿ� ������ M�� �������� �����Ͽ� ��� ����Ѵ�. �̶�, M�� �����ϴ� �����̾�� �Ѵ�.
 */
public class Check {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int count = Integer.parseInt(reader.readLine().toString()); // ������ ����
			int[] number = new int[count];
			for (int i = 0; i < count; i++) {
				number[i] = Integer.parseInt(reader.readLine().toString());		
			}
			Arrays.sort(number);	//���� �������� �����Ѵ�.
			int min = number[0]; 	//���� �������� �����Ѵ�.
			
			for(int i=2; i < min; i++) {
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
