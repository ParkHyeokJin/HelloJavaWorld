package FactoryMethodPattern;

import FactoryMethodPattern.fw.Creator;
import FactoryMethodPattern.fw.Item;

public class DefaultItemCreator extends Creator {

	@Override
	protected String end(String itemName) {
		System.out.println(itemName + "생성완료.");
		return itemName;
	}

	@Override
	protected String init(String itemName) {
		System.out.println(itemName + "생성중.");
		return itemName;
	}

	@Override
	protected Item createItem(String itemName) {
		return new DefaultItem(itemName);
	}

}
