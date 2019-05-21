package baekjoonJudge.competition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Qst2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String inputStr[] = reader.readLine().split(" ");
		int money = Integer.parseInt(inputStr[0]);
		int bundleNum = Integer.parseInt(inputStr[1]);
		
		Qst2 qst2 = new Qst2();
		System.out.println(money + qst2.bundleCnt(money, bundleNum));
	}
	
	int cnt = 0;
	public int bundleCnt(int money, int bundleNum) {
		if(money < bundleNum) {
			return cnt;
		}
		cnt += money / bundleNum;
		return bundleCnt(Math.abs(money / bundleNum), bundleNum);
	}
}