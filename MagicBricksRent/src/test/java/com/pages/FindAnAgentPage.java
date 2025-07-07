package com.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FindAnAgentPage extends BasePage {

    public FindAnAgentPage(WebDriver driver) {
        super(driver);
    }

   // @FindBy(id = "rentheading")
    @FindBy(xpath="//*[@id=\"rentheading\"]")
    public WebElement rentTag;

   // @FindBy(xpath = "//a[text()='Find an Agent']")
   // @FindBy(xpath="//a[contains(text(),'Find an Agent')][1]")
   // @FindBy(xpath="//a[contains(text(),'Find an Agent')]")
    @FindBy(xpath="(//a[text()=\"Find an Agent\"])[1]")
    public WebElement findAgentLink;

    @FindBy(id = "cityList")
    public WebElement cityInput;

    @FindBy(id = "localityList")
    public WebElement localityInput;

//    @FindBy(xpath = "//button[contains(text(),'Search')]")
//    public WebElement searchButton;

    @FindBy(xpath = "(//div[@class='agent-listing']//a[contains(text(),'View Details')])[1]")
    public WebElement firstViewDetails;

    public void openFindAgent() {
        Actions actions = new Actions(driver);
        actions.moveToElement(rentTag).perform();
       // waitUntilWebElementIsVisible(findAgentLink);
        waitUntilElementIsClickable(findAgentLink);
        findAgentLink.click();
    }

    public void filterAgents(String city, String locality) {
        waitUntilWebElementIsVisible(cityInput);
        cityInput.clear();
        cityInput.sendKeys(city);

        waitUntilWebElementIsVisible(localityInput);
        localityInput.clear();
        localityInput.sendKeys(locality);

//        waitUntilElementIsClickable(searchButton);
//        searchButton.click();
    }

    public void clickFirstAgentDetails() {
        waitUntilWebElementIsVisible(firstViewDetails);
        firstViewDetails.click();
    }
}
