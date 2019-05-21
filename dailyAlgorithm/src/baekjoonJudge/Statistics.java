package baekjoonJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Statistics {

	/*
	  ����
		���� ó���ϴ� ���� ����п��� ����� �߿��� ���̴�. ����п��� N���� ���� ��ǥ�ϴ� �⺻ ��谪���� ������ ���� �͵��� �ִ�. ��, N�� Ȧ����� ��������.
		
		������ : N���� ������ ���� N���� ���� ��
		�߾Ӱ� : N���� ������ �����ϴ� ������ �������� ��� �� �߾ӿ� ��ġ�ϴ� ��
		�ֺ� : N���� ���� �� ���� ���� ��Ÿ���� ��
		���� : N���� ���� �� �ִ񰪰� �ּڰ��� ����
		N���� ���� �־����� ��, �� ���� �⺻ ��谪�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
	�Է�
		ù° �ٿ� ���� ���� N(1 �� N �� 500,000)�� �־�����. �� ���� N���� �ٿ��� �������� �־�����. �ԷµǴ� ������ ������ 4,000�� ���� �ʴ´�.
		
	���
		ù° �ٿ��� �������� ����Ѵ�. �Ҽ��� ���� ù° �ڸ����� �ݿø��� ���� ����Ѵ�.
		
		��° �ٿ��� �߾Ӱ��� ����Ѵ�.
		
		��° �ٿ��� �ֺ��� ����Ѵ�. ���� �� ���� ������ �ֺ� �� �� ��°�� ���� ���� ����Ѵ�.
		
		��° �ٿ��� ������ ����Ѵ�.
	 */
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int X = Integer.parseInt(reader.readLine());
			int[] arr= new int[X];
			for(int i = 0; i < X; i++){
				arr[i] = Integer.parseInt(reader.readLine());
			}
			// ��հ�
			System.out.println(avg(arr));
			// �߾� ��
			System.out.println(centerVal(arr));
			// �ֺ� ��
			System.out.println(mode(arr));
			// ����
			System.out.println(range(arr));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static int avg(int[] arr) {
		float sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		float result = sum / arr.length;
		return Math.round(result);
	}
	
	private static int centerVal(int[] arr) {
		int[] val = arr;
		Arrays.sort(val);
		return val[arr.length/2];
	}
	
	private static int mode(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		if(arr.length == 1) {
			return arr[0];
		}else {
			for (int i = 0; i < arr.length; i++) {
				map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			}
			Integer max = Collections.max(map.values());
			Map<Integer, Integer> tmpMap = new HashMap<>();
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				Integer value = entry.getValue();
				if(null != value && max == value) {
		            tmpMap.put(entry.getKey(), entry.getValue());
		        }
			}
			Set<Integer> set = tmpMap.keySet();
			List<Integer> result = new ArrayList(set);
			Collections.sort(result);
			if(result.size()>1) {
				return result.get(1);
			}else {
				return result.get(0);
			}
		}
	}
	
	private static int range(int[] arr) {
		int[] val = arr;
		Arrays.sort(val);
		if(val.length==1) {
			return 0;
		}else {
			return val[arr.length-1] - val[0];
		}
	}

}
