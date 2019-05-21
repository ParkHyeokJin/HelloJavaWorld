package baekjoonJudge;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Tree_chap1 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("a");
		treeSet.add("b");
		treeSet.add("c"); 
		treeSet.add("d");
		treeSet.add("e");
		
		NavigableSet<String> decendingSet = treeSet.descendingSet();
		for (String string : decendingSet) {
			System.out.print(string+" ");
		}
		System.out.println();
		//오름차순 정렬
        NavigableSet<String> ascendingSet = decendingSet.descendingSet();
        for(String string : ascendingSet){
            System.out.print(string+" ");
        }
	}
}
