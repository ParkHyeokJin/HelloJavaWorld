package baekjoonJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intelligenttrain {

	/*
	 - ���� 
		 �ֱٿ� ���ߵ� ������ ������ 1����(��߿�)���� 4����(������)���� 4���� �������� �ִ� �뼱���� ����ǰ� �ִ�. 
		 �� �������� Ÿ�ų� ������ ��� ���� �ڵ����� �ν��� �� �ִ� ��ġ�� �ִ�. �� ��ġ�� �̿��Ͽ� ��߿����� ���������� ���� ���� ���� �ȿ� ����� ���� ���� ���� ��� ���� ����Ϸ��� �Ѵ�. 
		 ��, �� ������ �̿��ϴ� ������� ���� �ǽ��� ��ö�Ͽ�, ������ ������ Ż ��, ���� ����� ��� ���� �Ŀ� ������ ź�ٰ� �����Ѵ�.
	 
	 	���� : �� ������ ���� ������ �����ϸ鼭 ����ȴٰ� �����Ѵ�.
	 
		 ������ �� ��ȣ ������� �����Ѵ�.
		 ��߿����� ���� ��� ���� ���������� ź ��� ���� 0�̴�.
	 	 �� ������ ���� ������ �ִ� ������� �� ���� ����� ������ ���� ����.
	 	 ������ ������ �ִ� 10,000���̰�, ������ �ʰ��Ͽ� Ÿ�� ���� ����.
	 	 
	 	 4���� ���� ���� �������� ���� ��� ���� ź ��� ���� �־����� ��, ������ ����� ���� ���� ���� ��� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 	 
 	 - �Է�
		�� ������ ���� ��� ���� ź ��� ���� ��ĭ�� ���̿� �ΰ� ù° �ٺ��� ��° �ٱ��� �� ������� �� �ٿ� �ϳ��� �־�����.
		
	 - ���
	 	ù ° �ٿ� �ִ� ��� ���� ����Ѵ�.
	 */
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			int station_Cnt = 4;
			int onPerson = 0;
			int maxPerson = 0;
			for (int i = 0; i < station_Cnt; i++) {
				String[] value = reader.readLine().split(" ");
				int drop = Integer.parseInt(value[0]);
				int on = Integer.parseInt(value[1]);
				if(drop > 0) {
					onPerson -= drop;
				}
				if(on > 0) {
					onPerson += on;
				}
				if(onPerson > maxPerson) {
					maxPerson = onPerson;
				}
			}
			System.out.println(maxPerson);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
