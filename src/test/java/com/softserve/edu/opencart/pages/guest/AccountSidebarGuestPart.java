package com.softserve.edu.opencart.pages.guest;

import org.openqa.selenium.WebElement;

import com.softserve.edu.opencart.pages.AccountSidebarPart;
import com.softserve.edu.opencart.tools.search.Search;
import com.softserve.edu.opencart.tools.search.SearchStrategy;

public abstract class AccountSidebarGuestPart extends AccountSidebarPart {

	protected Search search;
	
    private WebElement loginRight;
    private WebElement registerRight;
    private WebElement forgottenPasswordRight;

    // public AccountSidebarGuestPart(WebDriver driver) {
    public AccountSidebarGuestPart() {
        //super(driver);
    	search = SearchStrategy.getSearch();
        initElements();
    }

    private void initElements() {
        // init elements
//        loginRight = driver.findElement(By.xpath("//div[@class='list-group']/a[contains(@href, 'account/login')]"));
//        registerRight = driver.findElement(By.xpath("//div[@class='list-group']/a[contains(@href, 'account/register')]"));
//        forgottenPasswordRight = driver.findElement(By.xpath("//div[@class='list-group']/a[contains(@href, 'account/forgotten')]"));
    	loginRight = search.xpath("//div[@class='list-group']/a[contains(@href, 'account/login')]");
    	registerRight = search.xpath("//div[@class='list-group']/a[contains(@href, 'account/register')]");
    	forgottenPasswordRight = search.xpath("//div[@class='list-group']/a[contains(@href, 'account/forgotten')]");
    }

    // Page Object

    // loginRight
    public WebElement getLoginRight() {
        return loginRight;
    }

    public String getLoginRightText() {
        return getLoginRight().getText();
    }

    public void clickLoginRight() {
        getLoginRight().click();
    }

    // registerRight
    public WebElement getRegisterRight() {
        return registerRight;
    }

    public String getRegisterRightText() {
        return getRegisterRight().getText();
    }

    public void clickRegisterRight() {
        getRegisterRight().click();
    }

    // forgottenPasswordRight
    public WebElement getForgottenPasswordRight() {
        return forgottenPasswordRight;
    }

    public String getForgottenPasswordRightText() {
        return getForgottenPasswordRight().getText();
    }

    public void clickForgottenPasswordRight() {
        getForgottenPasswordRight().click();
    }

    // Functional

    // Business Logic

    public LoginPage gotoLoginRight() {
        clickLoginRight();
        // return new LoginPage(driver);
        return new LoginPage();
    }

}