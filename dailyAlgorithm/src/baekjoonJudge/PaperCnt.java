package baekjoonJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class PaperCnt {

	/*
	 ����
		N��Nũ���� ��ķ� ǥ���Ǵ� ���̰� �ִ�. ������ �� ĭ���� -1, 0, 1�� �� �� �� �ϳ��� ����Ǿ� �ִ�. �츮�� �� ����� ������ ũ��� �ڸ����� �ϴµ�, �̶� ������ ��Ģ�� ���� �ڸ����� �Ѵ�.
		
		���� ���̰� ��� ���� ���� �Ǿ� �ִٸ� �� ���̸� �״�� ����Ѵ�.
		(1)�� �ƴ� ��쿡�� ���̸� ���� ũ���� 9���� ���̷� �ڸ���, ������ �߸� ���̿� ���ؼ� (1)�� ������ �ݺ��Ѵ�.
		�̿� ���� ���̸� �߶��� ��, -1�θ� ä���� ������ ����, 0���θ� ä���� ������ ����, 1�θ� ä���� ������ ������ ���س��� ���α׷��� �ۼ��Ͻÿ�.
		
	�Է�
		ù° �ٿ� N(1��N��3^7, N�� 3^k ��)�� �־�����. ���� N���� �ٿ��� N���� ������ ����� �־�����.
		
	���
		ù° �ٿ� -1�θ� ä���� ������ ������, ��° �ٿ� 0���θ� ä���� ������ ������, ��° �ٿ� 1�θ� ä���� ������ ������ ����Ѵ�.
	 */
	
	static int[] value = {-1, 0, 1};
	private static int[] count = new int[3];
	
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			//��� ��
			int n = intToString(reader.readLine());
			
			//���̸� �ڸ��� ����
			int cut = 9;
			
			//�迭 ����
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++) {
				String str = reader.readLine();
				String[] tmp = str.split(" ");
				for (int j = 0; j < tmp.length; j++) {
					arr[i][j] = intToString(tmp[j]);
				}
			}
			
			divide(0, 0, n, arr);
			
			System.out.println(count[0]);
	        System.out.println(count[1]);
	        System.out.println(count[2]);
						
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static boolean check(int row, int col, int n, int[][] map) {
        int std = map[row][col];
        System.out.println("std : " +std);
        for (int i = row; i < row + n; i++) {
            for (int j = col; j < col + n; j++) {
                if (std != map[i][j])
                    return false;
            }
        }
        return true;
    }
 
    private static void divide(int row, int col, int n, int[][] map) {
    	System.out.println("check : "+check(row, col, n, map));
        if (check(row, col, n, map)) {
            count[map[row][col]+1]++;
        } else {
            int s = n / 3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    divide(row + s * i, col + s * j, s, map);
                }
            }
        }
    }
	
	static int intToString(String v) {
		return Integer.parseInt(v);
	}
}
