package AbstractFactoryPattern;

import AbstractFactoryPattern.Sam.SamFactory;
import AbstractFactoryPattern.abst.BikeFactory;
import AbstractFactoryPattern.abst.Body;
import AbstractFactoryPattern.abst.Wheel;
import AbstractFactoryPattern.gt.GtBikeFactory;

public class Main {

	public static void main(String[] args) {
		
		BikeFactory factory = new GtBikeFactory();
		
		Body body = factory.createBody();
		Wheel wheel = factory.creatWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
		
		factory = new SamFactory();
		
		body = factory.createBody();
		wheel = factory.creatWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
	}
}
