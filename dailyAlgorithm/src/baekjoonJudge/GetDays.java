package baekjoonJudge;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * ���� : ������ 2007�� 1�� 1�� �������̴�. �׷��ٸ� 2007�� x�� y���� ���� �����ϱ�? �̸� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
 * �Է� : ù° �ٿ� �� ĭ�� ���̿� �ΰ� x(1��x��12)�� y(1��y��31)�� �־�����. ����� 2007�⿡�� 1, 3, 5, 7, 8, 10, 
 * 		12���� 31�ϱ���, 4, 6, 9, 11���� 30�ϱ���, 2���� 28�ϱ��� �ִ�.
 * ��� : ù° �ٿ� x�� y���� ���� ���������� ���� SUN, MON, TUE, WED, THU, FRI, SAT�� �ϳ��� ����Ѵ�.
 */
public class GetDays {
	static List<Integer> maxDays = Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
	static List<String> days = Arrays.asList("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT");
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputValue = sc.nextLine();
		StringTokenizer a = new StringTokenizer(inputValue, " ");
		
		int month = Integer.parseInt(a.nextElement().toString());
		int day = Integer.parseInt(a.nextElement().toString());
		int sumDay = getDays(month, day);
		
		System.out.println(days.get((sumDay%7)));
	}
	
	private static int getDays(int month, int day) {
		int sumDay = 0;
		if(month == 1) {
			return day;
		}else {
			for (int i = 0; i < month-1; i++) {
				sumDay += maxDays.get(i);
			}
			return sumDay  + day;
		}
	}
}
