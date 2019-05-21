package baekjoonJudge.decimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
   	����
	1���� ū �ڿ��� �߿���  1�� �ڱ� �ڽ��� ������ ����� ���� �ڿ����� �Ҽ���� �Ѵ�. ���� ���, 5�� 1�� 5�� ������ ����� ���� ������ �Ҽ��̴�. ������, 6�� 6 = 2 �� 3 �̱� ������ �Ҽ��� �ƴϴ�.
	
	�������� ������ ������ �������� ���ذ� ������, 2���� ū ��� ¦���� �� �Ҽ��� ������ ��Ÿ�� �� �ִٴ� ���̴�. �̷��� ���ڸ� ������ ���ڶ�� �Ѵ�. 
	��, ¦���� �� �Ҽ��� ������ ��Ÿ���� ǥ���� �� ������ ������ ��Ƽ���̶�� �Ѵ�. 
	���� ���, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7�̴�. 
	10000���� �۰ų� ���� ��� ¦�� n�� ���� ������ ��Ƽ���� �����Ѵ�.
	
	2���� ū ¦�� n�� �־����� ��, n�� ������ ��Ƽ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ������ n�� ������ ��Ƽ���� ���� ������ ��쿡�� �� �Ҽ��� ���̰� ���� ���� ���� ����Ѵ�.
	
	�Է�
	ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ� ¦�� n�� �־�����. (4 �� n �� 10,000)
	
	���
	�� �׽�Ʈ ���̽��� ���ؼ� �־��� n�� ������ ��Ƽ���� ����Ѵ�. ����ϴ� �Ҽ��� ���� �ͺ��� ���� ����ϸ�, �������� �����Ѵ�.
 */
public class Qst5 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(reader.readLine());
		for(int i = 0; i < cnt; i++) {
			int num =  Integer.parseInt(reader.readLine());
			List<Integer> primeList = primeNumber(num);
			
			System.out.println(golebachConjecture(primeList, num));
		}
	}
	
	private static String golebachConjecture(List<Integer> primeList, int num) {
		String result = "";
		if(primeList.contains(num /2)) {
			result = num / 2 + " " + num / 2;
		}else {
			for(int j = 0; j < primeList.size(); j++) {
				int refNum = primeList.get(j);
				int rangeNum = 0;
				for(int k = j+1; k < primeList.size(); k++) {
					int sumNumber = refNum + primeList.get(k);
					if(num == sumNumber) {
						int subNum = refNum - primeList.get(k);
						if(rangeNum == 0) {
							rangeNum = subNum;
							result = refNum + " " + primeList.get(k);
						}else {
							if(rangeNum > subNum) {
								rangeNum = subNum;
								result = refNum + " " + primeList.get(k);
							}
						}
					}
				}
			}
		}
		return result;
	}
	
	private static List<Integer> primeNumber(int num) {
		int m = 1;
		int n = num;
		
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
		List<Integer> resultList = new ArrayList<>();
		for(int i=m+1; i<=n; i++){
			if(primeList.get(i) == true){
				resultList.add(i);
			}
		}
		return resultList;
	}
}
