package baekjoonJudge.simulation;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/*
 * 문제
	수빈이는 TV를 보고 있다. 수빈이는 채널을 돌리려고 했지만, 버튼을 너무 세게 누르는 바람에, 일부 숫자 버튼이 고장났다.
	
	리모컨에는 버튼이 0부터 9까지 숫자, +와 -가 있다. +를 누르면 현재 보고있는 채널에서 +1된 채널로 이동하고, -를 누르면 -1된 채널로 이동한다. 
	채널 0에서 -를 누른 경우에는 채널이 변하지 않고, 채널은 무한대 만큼 있다.
	
	수빈이가 지금 이동하려고 하는 채널은 N이다. 어떤 버튼이 고장났는지 주어졌을 때, 채널 N으로 이동하기 위해서 버튼을 최소 몇 번 눌러야하는지 구하는 프로그램을 작성하시오. 
	
	수빈이가 지금 보고 있는 채널은 100번이다.
	
	입력
	첫째 줄에 수빈이가 이동하려고 하는 채널 N (0 ≤ N ≤ 500,000)이 주어진다.  
	둘째 줄에는 고장난 버튼의 개수 M (0 ≤ M ≤ 10)이 주어진다. 
	고장난 버튼이 있는 경우에는 셋째 줄에는 고장난 버튼이 주어지며, 같은 버튼이 여러번 주어지는 경우는 없다.
	
	출력
	첫째 줄에 채널 N으로 이동하기 위해 버튼을 최소 몇 번 눌러야 하는지를 출력한다.
 */
public class Qst5{
	static List<Integer> brokenButtons = new ArrayList<>();
	
	@Test
	public void brokenRemoteControl() {
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(256, Arrays.asList(2,4,5), 100) , 47);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(5457, Arrays.asList(6,7,8), 100) , 6);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(100, Arrays.asList(0,1,2,3,4), 100) , 0);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(500000, Arrays.asList(0,2,3,4,6,7,8,9), 100) , 11117);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(0, Arrays.asList(0,2,3,4,6,7,8,9), 100) , 2);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(5959, Arrays.asList(1,2,3,4), 100) , 4);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(56666, Arrays.asList(), 100) , 5);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(9999, Arrays.asList(0,1,2,3,4,5,6,7), 100) , 4);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(368453, Arrays.asList(0,5,4,6,9,8,3,7), 100) , 146237);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(431392, Arrays.asList(0,1,2,4,5,9,7,6,8), 100) , 98065);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(101, Arrays.asList(), 100) , 1);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(1, Arrays.asList(1,2,3,4,5,6,7,8,9), 100) , 2);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(99999, Arrays.asList(9), 100) , 7);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(10, Arrays.asList(1,2,3,4,5,6,7,8,9), 100) , 11);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(123, Arrays.asList(1,2,5), 100) , 23);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(60000, Arrays.asList(0,1,2,3,4,5,6,7,8,9), 100) , 59900);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(190000, Arrays.asList(1,2,9), 100) , 101117);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(0, Arrays.asList(0,1,2,3,4,5,6,7,8,9), 100) , 100);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(1020, Arrays.asList(), 100) , 4);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(999, Arrays.asList(9), 100) , 5);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(9990, Arrays.asList(1,2,3,4,5,6,7,8), 100) , 4);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(123, Arrays.asList(2,3), 100) , 7);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(199, Arrays.asList(9), 100) , 4);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(9, Arrays.asList(9,8,7,6,5), 100) , 3);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(19, Arrays.asList(1), 100) , 3);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(5959, Arrays.asList(1,2,3,4), 100) , 4);
		assertEquals(getMoveChannelPushButtonCntWithoutBrokenBtn(56666, Arrays.asList(), 100) , 5);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> brokenButtons = new ArrayList<>();
		int moveChannel = Integer.parseInt(reader.readLine());
		int brokenButtonCnt = Integer.parseInt(reader.readLine());
		if(brokenButtonCnt > 0) {
		String[] brokenButtonArr = reader.readLine().split(" ");
			for (String brokenButton : brokenButtonArr) {
				brokenButtons.add(Integer.parseInt(brokenButton));
			}
		}		
		System.out.println(getMoveChannelPushButtonCntWithoutBrokenBtn(moveChannel, brokenButtons, 100));
	}

	private static int getMoveChannelPushButtonCntWithoutBrokenBtn(int moveChannel, List<Integer> asList, int defaultChannel) {
		brokenButtons = asList;
		
		// 1. 버튼으로 이동해야 하는 횟수
		int btnMovePushCnt = Math.abs(moveChannel - defaultChannel);
		// 2. 이동하고자 하는 채널이 동일한 경우는 이동할 필요 없음.
		if(btnMovePushCnt == 0) {
			return 0;
		}
		// 3. 이동하고자 하는 버튼보다 작은 숫자를 찾아서 이동 해야 하는경우(0이하로는 갈 수 없음)
		// * 작은 숫자를 찾아서 0 까지 못찾은 경우에는 아래버튼으로 이동 할 수 없음.
		boolean downBtnMoveFlag = false;
		int downBtnNum = 0;
		for(int i = moveChannel; i >= 0; i--) {
			if(!findBrokenButton(i)) {
				downBtnNum = i;
				downBtnMoveFlag = true;
				break;
			}
		}
		
		// 4. 이동하고자 하는 버튼보다 큰 숫자를 찾아서 이동 해야 하는경우(무한대)
		int upChannel = moveChannel;
		while(true) {
			++upChannel;
			if(!findBrokenButton(upChannel)) {
				break;
			}
			if(downBtnMoveFlag) {
				if((upChannel - moveChannel) > Math.abs(downBtnNum - moveChannel)) {
					break;
				}
			}
			if((upChannel - moveChannel) > btnMovePushCnt) {
				break;
			}
		}
		
		int moveUpCnt = String.valueOf(upChannel).length() + (upChannel - moveChannel);
		int moveDwnCnt = String.valueOf(downBtnNum).length() + Math.abs(downBtnNum - moveChannel);
		
		System.out.println("버튼만으로 이동하는 경우 : "+btnMovePushCnt);
		System.out.println("넘버버튼 + 이동버튼(up) : "+ moveUpCnt);
		System.out.println("넘버버튼 + 이동버튼(down) : "+ moveDwnCnt);
		
		int btnAddNum = downBtnMoveFlag == true ? Math.min(moveUpCnt, moveDwnCnt) : moveUpCnt;
		
		if(btnMovePushCnt < btnAddNum) {
			return btnMovePushCnt;
		}else {
			return btnAddNum;
		}
	}
	
	/*
	 * @return true(부서진버튼이 있는경우), false(부서진 버튼이 없는경우)
	 */
	private static boolean findBrokenButton(int inputNumber) {
		boolean result = false;
		int num = 0;
		int channel = inputNumber;
		while(true) {
			num = channel % 10;
			channel = channel / 10;
			if(brokenButtons.contains(num)) {
				result = true;
				break;
			}
			if(channel == 0) {
				break;
			}
		}
		return result;
	}
}
