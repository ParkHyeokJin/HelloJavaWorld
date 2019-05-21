package baekjoonJudge.decimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 *  ����
	M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է�
	ù° �ٿ� �ڿ��� M�� N�� �� ĭ�� ���̿� �ΰ� �־�����. (1 �� M �� N �� 1,000,000)
	
	���
	�� �ٿ� �ϳ���, �����ϴ� ������� �Ҽ��� ����Ѵ�.
 */
public class Qst3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = reader.readLine().split(" ");
		
		int m = Integer.parseInt(str[0]);
		int n = Integer.parseInt(str[1]);
		
		List<Boolean> primeList = new ArrayList<>(n+1);
		// 0��°�� 1��°�� �Ҽ� �ƴ����� ó��
		primeList.add(false);
		primeList.add(false);
		// 2~ n ���� �Ҽ��� ����
		for(int i=2; i<=n; i++ ) {
			primeList.add(i, true);
		}
		// 2 ����  ~ i*i <= n
		// ������ ������� ��������.
		for(int i=2; (i*i)<=n; i++){
			if(primeList.get(i)){
				for(int j = i*i; j<=n; j+=i) primeList.set(j, false);
			}
		}
		StringBuffer sb = new StringBuffer();
		for(int i=m; i<=n; i++){
			if(primeList.get(i) == true){
				sb.append(i);
				sb.append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}
