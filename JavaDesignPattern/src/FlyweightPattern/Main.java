package FlyweightPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyweghtFactory factory = new FlyweghtFactory();
		
		Flyweight flyweight = factory.getFlyweight("A");
		
		System.out.println(flyweight);
		
		flyweight = factory.getFlyweight("A");
		
		System.out.println(flyweight);
		
		flyweight = factory.getFlyweight("B");
		
		System.out.println(flyweight);
		
		flyweight = factory.getFlyweight("B");
		
		System.out.println(flyweight);
	}
	

}
