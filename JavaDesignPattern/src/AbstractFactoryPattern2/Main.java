package AbstractFactoryPattern2;

import AbstractFactoryPattern2.abst.Button;
import AbstractFactoryPattern2.abst.GuiFac;
import AbstractFactoryPattern2.abst.TextArea;
import AbstractFactoryPattern2.concrete.FactoryInstance;

public class Main {

	public static void main(String[] args) {
		
		GuiFac fac = FactoryInstance.getGuiFac();
		
		Button button = fac.createButton();
		TextArea area = fac.createTextArea();
		
		button.click();
		System.out.println(area.getText());
		System.out.println(System.getProperty("os.name"));
	}
}
