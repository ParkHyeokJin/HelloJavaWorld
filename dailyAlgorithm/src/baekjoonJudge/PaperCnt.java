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
	 문제
		N×N크기의 행렬로 표현되는 종이가 있다. 종이의 각 칸에는 -1, 0, 1의 세 값 중 하나가 저장되어 있다. 우리는 이 행렬을 적절한 크기로 자르려고 하는데, 이때 다음의 규칙에 따라 자르려고 한다.
		
		만약 종이가 모두 같은 수로 되어 있다면 이 종이를 그대로 사용한다.
		(1)이 아닌 경우에는 종이를 같은 크기의 9개의 종이로 자르고, 각각의 잘린 종이에 대해서 (1)의 과정을 반복한다.
		이와 같이 종이를 잘랐을 때, -1로만 채워진 종이의 개수, 0으로만 채워진 종이의 개수, 1로만 채워진 종이의 개수를 구해내는 프로그램을 작성하시오.
		
	입력
		첫째 줄에 N(1≤N≤3^7, N은 3^k 꼴)이 주어진다. 다음 N개의 줄에는 N개의 정수로 행렬이 주어진다.
		
	출력
		첫째 줄에 -1로만 채워진 종이의 개수를, 둘째 줄에 0으로만 채워진 종이의 개수를, 셋째 줄에 1로만 채워진 종이의 개수를 출력한다.
	 */
	
	static int[] value = {-1, 0, 1};
	private static int[] count = new int[3];
	
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			//행렬 수
			int n = intToString(reader.readLine());
			
			//종이를 자르는 기준
			int cut = 9;
			
			//배열 생성
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
