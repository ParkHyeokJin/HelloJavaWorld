package sortAlgorithm;

public class SelectionSort {
	/*
	 * ���� ���� �˰���
	 *  - ���� ���� �˰����� ù��° �ڷḦ �ι�° �ڷ���� ������ �ڷ� ���� ���Ͽ� ���� ���� ���� ã�� ù��° �ڸ��� �Է� �ϸ鼭 ���� �ϴ� ���
	 *  - �ð� ���⵵ : 0(n^2)
	 */
	public static void main(String[] args) {
		int[] value = {3,1,2,4,10,6,7,8,5,9};
		int k, tmp, min, index=0;
		//value �ڷḦ Ž���Ѵ�
		for (int i=0; i<value.length; i++) {
			min = 999;
			//�˻� ���� �ڸ����� ���� ������ ���� Ž�� �ϸ鼭 ���� ���� min ���� ã�´�.
			for(k=i; k<value.length; k++) {
				if(min > value[k]) {
					min = value[k];
					index = k;
				}
			}
			//�ڸ� ��ü
			tmp = value[i];
			value[i] = value[index];
			value[index] = tmp;
		}
		//���
		for (int j=0; j<value.length;j++) {
			System.out.print(value[j]);
		}
	}
}
