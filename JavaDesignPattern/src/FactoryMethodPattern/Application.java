package FactoryMethodPattern;

import FactoryMethodPattern.fw.Creator;
import FactoryMethodPattern.fw.Item;

public class Application {

	public static void main(String[] args) {
		
		Creator creator = new DefaultItemCreator();

		Item item1 = creator.create("나무칼");
		item1.use();
		Item item2 = creator.create("나무방패");
		item2.use();
		Item item3 = creator.create("나무갑주");
		item3.use();
	}

}
