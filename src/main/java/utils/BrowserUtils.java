package utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtils {

	static Actions actions;

	public static void wait(int timeout) {
		try {
			Thread.sleep(timeout * 1000);
		}
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	public static void scrollDownWithPageDown() {
		actions = new Actions(Driver.getDriver());
		actions.keyDown(Keys.PAGE_DOWN).release().build().perform();
		wait(2);// this is important
	}

	public static void scrollUpWithPageUp() {
		actions = new Actions(Driver.getDriver());
		actions.keyDown(Keys.PAGE_UP).release().build().perform();
		wait(2);
	}

}
