package marathon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 ���� ����
	������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.
	�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, 
	�������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 
 ���ѻ���
	- ������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
	- completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
	- �������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
	- ������ �߿��� ���������� ���� �� �ֽ��ϴ�.
 */
class Solution {
	public static void main(String[] args) {
		String[] participant1 = new String[]{"leo", "kiki", "eden"};
		String[] completion1 = new String[]{"kiki", "eden"};
		
		Solution so = new Solution();
		System.out.println(so.solution(participant1, completion1));
		
		String[] participant2 = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion2 = new String[]{"josipa", "filipa", "marina", "nikola"};
		so = new Solution();
		System.out.println(so.solution(participant2, completion2));
		
		String[] participant3 = new String[]{"mislav", "stanko", "mislav", "ana"};
		String[] completion3 = new String[]{"stanko", "ana", "mislav"};
		so = new Solution();
		System.out.println(so.solution2(participant3, completion3));
	}
	
    public String solution(String[] participant, String[] completion) {
       String answer = "";
       HashMap<String, Integer> hm = new HashMap<String, Integer>();
       
       for (String part : participant) {
    	   hm.put(part, hm.getOrDefault(part, 0)+1);
       }
       
       for (String comp : completion) {
    	   hm.put(comp, hm.getOrDefault(comp, 0)-1);
       }
       
       for (String key : hm.keySet()) {
    	   if(hm.get(key) !=0) {
    		   answer = key;
    	   }
       }
       return answer;
    }
    
    public String solution2(String[] participant, String[] completion) {
    	Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for ( i=0; i<completion.length; i++){

            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }
}
