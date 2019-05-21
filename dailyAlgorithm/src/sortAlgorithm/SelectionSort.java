package sortAlgorithm;

public class SelectionSort {
	/*
	 * 선택 정렬 알고리즘
	 *  - 선택 정렬 알고리즘은 첫번째 자료를 두번째 자료부터 마지막 자료 까지 비교하여 가장 작은 값을 찾아 첫번째 자리에 입력 하면서 정렬 하는 방식
	 *  - 시간 복잡도 : 0(n^2)
	 */
	public static void main(String[] args) {
		int[] value = {3,1,2,4,10,6,7,8,5,9};
		int k, tmp, min, index=0;
		//value 자료를 탐색한다
		for (int i=0; i<value.length; i++) {
			min = 999;
			//검색 시작 자리에서 부터 마지막 까지 탐색 하면서 제일 작은 min 값을 찾는다.
			for(k=i; k<value.length; k++) {
				if(min > value[k]) {
					min = value[k];
					index = k;
				}
			}
			//자리 교체
			tmp = value[i];
			value[i] = value[index];
			value[index] = tmp;
		}
		//출력
		for (int j=0; j<value.length;j++) {
			System.out.print(value[j]);
		}
	}
}
