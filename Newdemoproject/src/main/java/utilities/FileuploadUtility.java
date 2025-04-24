package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileuploadUtility {
	
public void fileUploadUsingSendKeys(WebElement element, String path){
	element.sendKeys(path);
	}

public void fileUploadUsingRobotClass(WebElement element, String path) throws AWTException{
	/**
	String Selection ss=new String Selection(path);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	Robot robot=new Robot();
	robot.delay(2500);//delay to copy and paste 
	robot.keyPress(KeyEvent.VK_CONTROL);//VK-virtual key
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);	**/
	
	StringSelection select=new StringSelection(path);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select,null);
	Robot obj =new Robot(); 
	obj.delay(2500);//delay for some time
	obj.keyPress(KeyEvent.VK_CONTROL);//pressed keyboard control+
	obj.keyPress(KeyEvent.VK_V);//keyboard V-paste
	obj.keyRelease(KeyEvent.VK_CONTROL);//releasing the pressed keyboard keys for pasting
	obj.keyRelease(KeyEvent.VK_V);//releasing the pressed keyboard keys for pasting
	obj.keyPress(KeyEvent.VK_ENTER);//releasing the pressed keyboard keys for pasting
	obj.keyRelease(KeyEvent.VK_ENTER);//releasing the pressed keyboard keys for pasting
	
	
}

}