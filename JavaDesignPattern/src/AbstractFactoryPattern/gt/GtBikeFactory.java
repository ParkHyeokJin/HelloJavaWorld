package AbstractFactoryPattern.gt;

import AbstractFactoryPattern.abst.BikeFactory;
import AbstractFactoryPattern.abst.Body;
import AbstractFactoryPattern.abst.Wheel;

public class GtBikeFactory implements BikeFactory{

	@Override
	public Body createBody() {
		return new GtBody();
	}

	@Override
	public Wheel creatWheel() {
		return new GtWheel();
	}

}
