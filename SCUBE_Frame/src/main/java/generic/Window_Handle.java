package generic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Window_Handle {
	WebDriver driver;
	public Window_Handle (WebDriver driver) 
    {
		this.driver=driver;
	}
	
	
	
	public void switchToASpecificTitledWindow(String title)
	{
		String parent=driver.getWindowHandle();
		Set<String> a=driver.getWindowHandles();
		a.remove(parent);
		for(String sessionID:a)
		{
			driver.switchTo().window(sessionID);
			if(driver.getTitle().equals(title))
			{
				break;
			}
		}
	}
	
	
	
	
	
	public void switchToASpecificWindow(WebElement element) {
		String parent=driver.getWindowHandle();
		Set<String> a=driver.getWindowHandles();
		a.remove(parent);
		for(String sessionID:a)
		{
			driver.switchTo().window(sessionID);
			if(element.isDisplayed())
			{
				break;
			}
		}
	}

}
