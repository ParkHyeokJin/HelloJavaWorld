package Memento;

import java.lang.Thread.State;
import java.util.Stack;
import java.util.StringTokenizer;

import Memento.abc.Memento;
import Memento.abc.Originator;

public class Application {

	public static void main(String[] args) {
		
		Stack<Memento> mementos = new Stack<>();
		
		Originator originator = new Originator();
		
		originator.setState("state 1");
		mementos.push(originator.createMemento());
//		Memento memento = new Memento();//X
//		memento.getState();//X
		originator.setState("state 2");
		mementos.push(originator.createMemento());
		originator.setState("state 3");
		mementos.push(originator.createMemento());
		originator.setState("state Final");
		mementos.push(originator.createMemento());
		
		originator.restoreMement(mementos.pop());
		System.out.println(originator.getState());//state Final
		originator.restoreMement(mementos.pop());
		System.out.println(originator.getState());//state 3
		originator.restoreMement(mementos.pop());
		System.out.println(originator.getState());//state 2
		originator.restoreMement(mementos.pop());
		System.out.println(originator.getState());//state 1
	
		
	}
}
