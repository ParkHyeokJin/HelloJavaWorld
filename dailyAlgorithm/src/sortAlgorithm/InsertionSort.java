package sortAlgorithm;

import org.junit.Test;

/**
 * 삽입정렬 : 삽입 정렬은 현재 위치에서 그 이하의 배열들을 비교하여 자신이 들어갈 위치를 찾아, 그 위치에 삽입하는 배열 알고리즘이다.
 * @author User
 *
 */
public class InsertionSort {
	public int[] sort(int[] arr) {
		int[] sortResult = new int[arr.length];
		
		
		return sortResult;
	}
	
	@Test
	public void InsertionSortTest() {
		InsertionSort sort = new InsertionSort();
		sort.sort(new int[]{4,3,2,1,5,6,7,8,9,0});
	}
}