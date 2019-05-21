package baekjoonJudge.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

/*
 * ����
	�����̴� ���̰� 64cm�� ���븦 ������ �ִ�. �����, �״� ���̰� Xcm�� ���밡 ������ �;�����. �����̴� ���� ������ �ִ� ���븦 �� ���� ����� �ڸ�������, Ǯ�� �ٿ��� ���̰� Xcm�� ���븦 ������� �Ѵ�.
	
	���븦 �ڸ��� ���� ���� ����� �������� �ڸ��� ���̴�. �����̴� �Ʒ��� ���� ������ ���ļ� ���븦 �ڸ����� �Ѵ�.
	
	�����̰� ������ �ִ� ������ ���̸� ��� ���Ѵ�. ó������ 64cm ���� �ϳ��� ������ �ִ�. �̶�, ���� X���� ũ�ٸ�, �Ʒ��� ���� ������ �ݺ��Ѵ�.
	������ �ִ� ���� �� ���̰� ���� ª�� ���� �������� �ڸ���.
	����, ������ �ڸ� ������ ���� �� �ϳ��� ������ �����ִ� ������ ������ ���� X���� ũ�ų� ���ٸ�, ������ �ڸ� ������ ���� �� �ϳ��� ������.
	����, �����ִ� ��� ���븦 Ǯ�� �ٿ��� Xcm�� �����.
	X�� �־����� ��, ���� ������ ��ģ�ٸ�, �� ���� ���븦 Ǯ�� �ٿ��� Xcm�� ���� �� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	
	�Է�
	ù° �ٿ� X�� �־�����. X�� 64���� �۰ų� ���� �ڿ����̴�.
	
	���
	������ ������ ��ģ�ٸ�, �� ���� ���븦 Ǯ�� �ٿ��� Xcm�� ���� �� �ִ��� ����Ѵ�.
 */
public class Qst2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(reader.readLine());

		LinkedList<Integer> arr = new LinkedList<>();
		arr.add(64);
		
		while(true) {
			if(sumBar(arr) == X) {
				System.out.println(arr.size());
				break;
			}else {
				Collections.sort(arr);
				int a = arr.poll();
				int half = a / 2;
				arr.add(half);
				
				if(sumBar(arr) < X) {
					arr.add(half);
				}
			}
		}
	}
	
	private static int sumBar(LinkedList<Integer> arr) {
		int sumRslt = 0;
		for (Integer integer : arr) {
			sumRslt += integer;
		}
		return sumRslt;
	}
}
