package Pages;

import TestBase.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;

import java.util.List;
public class MainPage extends BaseClass {

    public MainPage(){
    PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//img[@class='icon__img']")
    WebElement clickCancel;

    @FindBy(id ="vehicleBrand")
    WebElement vehicleBrand;

    @FindBy(id="vehicleId")
    WebElement vehicleModel;

    @FindBy (id="optOut")
    WebElement optOutbutton;
    //test

    @FindBy(xpath = "//h4[text()='Universal Socket']")
    WebElement connectionType;

    @FindBy(xpath = "//h4[text()='7kW']")
    WebElement powerRating;

    @FindBy(xpath = "//span[text()='£879.00']")
    WebElement fullPrice;

    @FindBy(xpath = "//p[@class='text-success p-b-md']//span[contains(text(),'£529.00')]")
    WebElement olevGrantPrice;

    @FindBy(xpath = "//div[@class='grid__col grid__col-md-4 grid__col-lg-4']")
    WebElement compatibleExtra;

    @FindBy(xpath = "//h4[text()='Holster']")
    WebElement holster;

    @FindBy(xpath = "//h3[text()='£908.00']")
    WebElement totalUniversal7kwPrice;

    @FindBy(xpath = "//span[text()='£558.00']")
    WebElement totalCompatibleExtra;

    @FindBy(xpath="//button[@class='cookie__btn']")
    WebElement cookieButton;
    
    @FindBy(tagName = "strong")
    WebElement text;

    @FindBy (tagName = "img")
    WebElement covid19msg ;

    @FindBy(xpath = "//h4[text()='Key lock']")
    WebElement compitableExtra1;

    @FindBy(xpath = "//h4[text()='5m Portable cable']")
    WebElement compitableExtra2;

    @FindBy(xpath = "//h4[text()='Extended warranty']")
    WebElement compitableExtra3;

    @FindBy(xpath = "//h4[text()='Cable Bag']")
    WebElement compitableExtra4;

    @FindBy(xpath = "//h4[text()='10m Portable cable']")
    WebElement compitableExtra5;

    @FindBy(xpath = "//h4[text()='Holster']")
    WebElement compitableExtra6;

    public void clickToCancelmsg(){
        covid19msg.click();
    }
    public void selectCarFields(){
        Select selectbrand = new Select(vehicleBrand);
        selectbrand.selectByVisibleText(properties.getProperty("vehiclebrand"));
        Select selectmodel = new Select(vehicleModel);
        selectmodel.selectByVisibleText(properties.getProperty("vehiclemodel"));
    }
    public void clickOnNotEligibleToClaimDealershipDiscountButton(){
        try
        {
   	    optOutbutton.click();
   	    } catch (Exception e)
        {
   	    JavascriptExecutor executor = (JavascriptExecutor) driver;
   	    executor.executeScript("arguments[0].click();", optOutbutton);
   	    }
    }
    public void selectConnectionTypeAsUniversalSocket(){
    	try
        {
    	connectionType.click();
    	} catch (Exception e)
        {
    	JavascriptExecutor executor = (JavascriptExecutor) driver;
    	executor.executeScript("arguments[0].click();", connectionType);
    	}
    }
    public boolean selectPowerRatingAs7Kw(){
    	try
        {
   	    powerRating.click();
   	    } catch (Exception e) {
   	     JavascriptExecutor executor = (JavascriptExecutor) driver;
   	     executor.executeScript("arguments[0].click();", powerRating);
   	    }
        fullPrice.isDisplayed();
        olevGrantPrice.isDisplayed();
        return text.isDisplayed();
    }
    public boolean checkCompatibleExtrasAreShown(){
        compitableExtra1.isDisplayed();
        compitableExtra2.isDisplayed();
        compitableExtra3.isDisplayed();
        compitableExtra4.isDisplayed();
        compitableExtra5.isDisplayed();
        compitableExtra6.isDisplayed();
        return  compatibleExtra.isDisplayed();
    }
    public void selectHolsterAsCompatibleExtra(){
    	try {
   	     holster.click();
   	  } catch (Exception e) {
   	     JavascriptExecutor executor = (JavascriptExecutor) driver;
   	     executor.executeScript("arguments[0].scrollIntoView(true);", holster);
   	     executor.executeScript("arguments[0].click();", holster);
   	  }
    }
    public boolean verifyTotalPriceAtTheBottomRightOfTheScreen(){
        clickToCancelmsg();
    	cookieButton.click();
    	totalUniversal7kwPrice.isDisplayed();
        return totalCompatibleExtra.isDisplayed();
    }
}
