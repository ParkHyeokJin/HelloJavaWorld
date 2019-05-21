package baekjoonJudge.decimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
   	����
	����Ʈ�� ������ ������ �ڿ��� n�� ���Ͽ�, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ��� �ϳ� �����Ѵٴ� ������ ��� �ִ�.
	
	�� ������ ������ ����Ʈ���� 1845�⿡ �����߰�, ������Ƽ ü������� 1850�⿡ �����ߴ�.
	
	���� ���, 10���� ũ��, 20���� �۰ų� ���� �Ҽ��� 4���� �ִ�. (11, 13, 17, 19) ��, 14���� ũ��, 28���� �۰ų� ���� �Ҽ��� 3���� �ִ�. (17,19, 23)
	
	n�� �־����� ��, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	
	�Է�
	�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� ���̽��� n�� �����ϸ�, �� �ٷ� �̷���� �ִ�. (n �� 123456)
	
	�Է��� ���������� 0�� �־�����.
	
	���
	�� �׽�Ʈ ���̽��� ���ؼ�, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ������ ����Ѵ�.
 */
public class Qst4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		while((num=Integer.parseInt(reader.readLine())) != 0){
			System.out.println(primeNumber(num));
		}
		
		
	}
	
	private static int primeNumber(int num) {
		int m = num;
		int n = num * 2;
		
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
		int primeCnt = 0;
		for(int i=m+1; i<=n; i++){
			if(primeList.get(i) == true){
				primeCnt++;
			}
		}
		return primeCnt;
	}
}
