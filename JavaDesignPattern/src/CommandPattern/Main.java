package CommandPattern;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Command pattern Test");
		List<Command> list = new LinkedList<Command>();
		
		list.add(new Command() {
			@Override
			public void execute() {
				// TODO Auto-generated method stub
				System.out.println("작업1");
			}
		});
		
		list.add(new Command() {
			@Override
			public void execute() {
				// TODO Auto-generated method stub
				System.out.println("작업2");
			}
		});
		
		list.add(new Command() {
			@Override
			public void execute() {
				// TODO Auto-generated method stub
				System.out.println("작업3");
			}
		});
		
		for (Command command : list) {
			command.execute();
		}
	}
}
