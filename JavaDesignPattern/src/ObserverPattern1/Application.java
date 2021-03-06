package ObserverPattern1;

import ObserverPattern1.Button.OnClickListener;

public class Application {

	public static void main(String[] args) {
		
		Button button = new Button();
		
		
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(Button button) {
				System.out.println(button+" is Clicked");
			}
		});
		
		button.onClick();
		
	}

}
