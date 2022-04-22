package generic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


/**
 * 
 * @author Vikranth
 *
 */
public class UtilityMethods {



	public WebDriver driver;	

	public void get_title() {
		String title= driver.getTitle();
		System.out.println(title);
	}

	public void get_url() {		
		String CurrentURL=driver.getCurrentUrl();
		System.out.println(CurrentURL);
	}

	public void clickElement(WebElement element_To_Click) {
		element_To_Click.click();
	}
	
	public void clearElement(WebElement element_To_Clear)
	{
		element_To_Clear.clear();	
	}
	
	public void submitElement(WebElement element_To_Submit)
	{
		element_To_Submit.submit();
	}
	

	public void enter_value(WebElement TextField,String value) 
	{		
		TextField.sendKeys(value);
	}
	
	public void get_Attributr(WebElement element_To_get_Attribute)
	{
		
		String get=element_To_get_Attribute.getAttribute("class");
		System.out.println(get);
		
	}
	
	public void get_Text(WebElement element_To_get_Text)
	{
		String get=element_To_get_Text.getText();
		System.out.println(get);
	}
	
	
	
	public void get_Cssvalue(WebElement element_To_get_Cssvalue)
	{
		String get=element_To_get_Cssvalue.getText();
		System.out.println(get);
		
	}
	
	public void is_Enable(WebElement Enable_Element)
	{
		boolean enable=Enable_Element.isEnabled();
		System.out.println(enable);
	}
	
	public void is_Displayed(WebElement Displayed_Element)
	{
		boolean displayed=Displayed_Element.isDisplayed();
		System.out.println(displayed);
	}
	
	public void selected(WebElement Selected_Element)
	{
		boolean Selected=Selected_Element.isDisplayed();
		System.out.println(Selected);
	}
	
	public void isMultiple(WebElement is_Mutable)
	{
		Select select= new Select(is_Mutable);
		boolean mute=select.isMultiple();
				System.out.println(mute);
		
	}
	
	public void SelectByvisible(WebElement SelectText,String a)
	{
		Select select= new Select(SelectText);
		select.selectByVisibleText(a);
	}
	
	public void Select_By_Index(WebElement SelectIndex ,int  a)
	
	{
		Select select= new Select(SelectIndex);
		select.selectByIndex(a);
		
	}
	
	
	
	
	
	
		
	
}