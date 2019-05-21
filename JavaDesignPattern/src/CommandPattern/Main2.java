package CommandPattern;

import java.util.PriorityQueue;

public class Main2 {
	public static void main(String[] args) {
		PriorityQueue<Command> queue = new PriorityQueue<Command>();
		queue.add(new StringCommand("ABCD"));
		queue.add(new StringCommand("ABC"));
		queue.add(new StringCommand("AB"));
		queue.add(new StringCommand("A"));
		for (Command command : queue) {
			command.execute();
		}
	}

}

class StringCommand implements Command{
	private String string;
	public StringCommand(String string) {
		super();
		this.string = string;
	}
	@Override
	public void execute() {
		System.out.println(this.string);
	}
	@Override
	public int compareTo(Command o) {
		StringCommand other = (StringCommand)o;
		return this.string.length()- other.string.length();
	}
	
}
