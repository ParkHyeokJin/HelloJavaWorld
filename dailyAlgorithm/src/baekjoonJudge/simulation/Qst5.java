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
 * ����
	�����̴� TV�� ���� �ִ�. �����̴� ä���� �������� ������, ��ư�� �ʹ� ���� ������ �ٶ���, �Ϻ� ���� ��ư�� ���峵��.
	
	���������� ��ư�� 0���� 9���� ����, +�� -�� �ִ�. +�� ������ ���� �����ִ� ä�ο��� +1�� ä�η� �̵��ϰ�, -�� ������ -1�� ä�η� �̵��Ѵ�. 
	ä�� 0���� -�� ���� ��쿡�� ä���� ������ �ʰ�, ä���� ���Ѵ� ��ŭ �ִ�.
	
	�����̰� ���� �̵��Ϸ��� �ϴ� ä���� N�̴�. � ��ư�� ���峵���� �־����� ��, ä�� N���� �̵��ϱ� ���ؼ� ��ư�� �ּ� �� �� �������ϴ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	
	�����̰� ���� ���� �ִ� ä���� 100���̴�.
	
	�Է�
	ù° �ٿ� �����̰� �̵��Ϸ��� �ϴ� ä�� N (0 �� N �� 500,000)�� �־�����.  
	��° �ٿ��� ���峭 ��ư�� ���� M (0 �� M �� 10)�� �־�����. 
	���峭 ��ư�� �ִ� ��쿡�� ��° �ٿ��� ���峭 ��ư�� �־�����, ���� ��ư�� ������ �־����� ���� ����.
	
	���
	ù° �ٿ� ä�� N���� �̵��ϱ� ���� ��ư�� �ּ� �� �� ������ �ϴ����� ����Ѵ�.
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
		
		// 1. ��ư���� �̵��ؾ� �ϴ� Ƚ��
		int btnMovePushCnt = Math.abs(moveChannel - defaultChannel);
		// 2. �̵��ϰ��� �ϴ� ä���� ������ ���� �̵��� �ʿ� ����.
		if(btnMovePushCnt == 0) {
			return 0;
		}
		// 3. �̵��ϰ��� �ϴ� ��ư���� ���� ���ڸ� ã�Ƽ� �̵� �ؾ� �ϴ°��(0���Ϸδ� �� �� ����)
		// * ���� ���ڸ� ã�Ƽ� 0 ���� ��ã�� ��쿡�� �Ʒ���ư���� �̵� �� �� ����.
		boolean downBtnMoveFlag = false;
		int downBtnNum = 0;
		for(int i = moveChannel; i >= 0; i--) {
			if(!findBrokenButton(i)) {
				downBtnNum = i;
				downBtnMoveFlag = true;
				break;
			}
		}
		
		// 4. �̵��ϰ��� �ϴ� ��ư���� ū ���ڸ� ã�Ƽ� �̵� �ؾ� �ϴ°��(���Ѵ�)
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
		
		System.out.println("��ư������ �̵��ϴ� ��� : "+btnMovePushCnt);
		System.out.println("�ѹ���ư + �̵���ư(up) : "+ moveUpCnt);
		System.out.println("�ѹ���ư + �̵���ư(down) : "+ moveDwnCnt);
		
		int btnAddNum = downBtnMoveFlag == true ? Math.min(moveUpCnt, moveDwnCnt) : moveUpCnt;
		
		if(btnMovePushCnt < btnAddNum) {
			return btnMovePushCnt;
		}else {
			return btnAddNum;
		}
	}
	
	/*
	 * @return true(�μ�����ư�� �ִ°��), false(�μ��� ��ư�� ���°��)
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
