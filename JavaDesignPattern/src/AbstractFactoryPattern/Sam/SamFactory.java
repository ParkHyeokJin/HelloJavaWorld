package AbstractFactoryPattern.Sam;

import AbstractFactoryPattern.abst.BikeFactory;
import AbstractFactoryPattern.abst.Body;
import AbstractFactoryPattern.abst.Wheel;

public class SamFactory implements BikeFactory {

	@Override
	public Body createBody() {
		return new SamBody();
	}

	@Override
	public Wheel creatWheel() {
		return new SamWheel();
	}

}
