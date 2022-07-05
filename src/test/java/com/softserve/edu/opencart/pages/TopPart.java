package com.softserve.edu.opencart.pages;

import com.softserve.edu.opencart.data.product.Currencies;
import com.softserve.edu.opencart.pages.footer.customerservice.ContactUsPage;
import com.softserve.edu.opencart.pages.footer.information.AboutUsPage;
import com.softserve.edu.opencart.pages.footer.information.DeliveryInformationPage;
import com.softserve.edu.opencart.pages.footer.information.PrivacyPolicyPage;
import com.softserve.edu.opencart.pages.footer.information.TermsConditionsPage;
import com.softserve.edu.opencart.pages.guest.AccountLogoutPage;
import com.softserve.edu.opencart.pages.guest.GuestDropdown;
import com.softserve.edu.opencart.pages.guest.LoginPage;
import com.softserve.edu.opencart.pages.guest.RegisterPage;
import com.softserve.edu.opencart.pages.logged.LoggedDropdown;
import com.softserve.edu.opencart.tools.browser.DriverWrapper;
import com.softserve.edu.opencart.tools.search.Search;
import com.softserve.edu.opencart.tools.search.SearchStrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class TopPart {
    protected final String OPTION_NULL_MESSAGE = "DropdownComponent is null";
    protected final String OPTION_NOT_FOUND_MESSAGE = "Option %s not found in %s";
    protected final String PAGE_DO_NOT_EXIST = "Page do not exist!!!";
    //
    protected final String TAG_ATTRIBUTE_VALUE = "value";
    protected final String TAG_ATTRIBUTE_SRC = "src";
    protected final String TAG_ATTRIBUTE_ALT = "alt";
    //
    protected final String LIST_CURRENCIES_CSSSELECTOR = "div.btn-group.open ul.dropdown-menu li";
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    // protected WebDriver driver;
    protected Search search;
    //
    private WebElement currency;
    private WebElement myAccount;
    private WebElement wishList;
    private WebElement shoppingCart;
    private WebElement logo;
    private WebElement searchTopField;
    private WebElement searchTopButton;
    private WebElement cartButton;
    private WebElement aboutUs;
    private WebElement deliveryInformation;
    private WebElement privacyPolicy;
    private WebElement termsConditions;
    private WebElement contactUs;
    private WebElement returns;
    private WebElement siteMap;
    private WebElement brands;
    private WebElement giftCertificates;
    private WebElement affiliates;
    private WebElement specials;
    private WebElement myAccountFooter;
    private WebElement orderHistory;
    private WebElement wishListFooter;
    private WebElement newsletterFooter;
    private WebElement poweredBy;

    // List<MenuComponent> menu;
    //
    private GuestDropdown dropdownGuest;
    private LoggedDropdown dropdownLogged;
    private CurrencyDropdown dropdownCurrency;
    private DropdownComponent dropdownComponent;

    // public TopPart(WebDriver driver) {
    public TopPart() {
        // this.driver = driver;
    	search = SearchStrategy.getSearch();
        initElements();
        //checkElements();
    }

    private void initElements() {
        // init elements
//        currency = driver.findElement(By.cssSelector(".btn.btn-link.dropdown-toggle"));
//        myAccount = driver.findElement(By.cssSelector(".list-inline > li > a.dropdown-toggle"));
//        wishList = driver.findElement(By.id("wishlist-total"));
//        shoppingCart = driver.findElement(By.cssSelector("a[title='Shopping Cart']"));
//        logo = driver.findElement(By.cssSelector("#logo a"));
//        searchTopField = driver.findElement(By.name("search"));
//        searchTopButton = driver.findElement(By.cssSelector("button.btn.btn-default"));
//        cartButton = driver.findElement(By.cssSelector("#cart > button"));
    	
    	currency = search.cssSelector(".btn.btn-link.dropdown-toggle");
        myAccount = search.cssSelector(".list-inline > li > a.dropdown-toggle");
        wishList = search.id("wishlist-total");
        shoppingCart = search.cssSelector("a[title='Shopping Cart']");
        logo = search.cssSelector("#logo a");
        searchTopField = search.name("search");
        searchTopButton = search.cssSelector("button.btn.btn-default");
        cartButton = search.cssSelector("#cart > button");
        aboutUs = search.xpath("//footer//a[contains(text(),'About Us')]");
        deliveryInformation = search.xpath("//footer//a[contains(text(),'Delivery Information')]");
        privacyPolicy = search.xpath("//footer//a[contains(text(),'Privacy Policy')]");
        termsConditions = search.xpath("//footer//a[contains(text(),'Terms & Conditions')]");
        contactUs = search.xpath("//footer//a[contains(text(),'Contact Us')]");
        returns = search.xpath("//footer//a[contains(text(),'Returns')]");
        siteMap = search.xpath("//footer//a[contains(text(),'Site Map')]");
        brands = search.xpath("//footer//a[contains(text(),'Brands')]");
        giftCertificates = search.xpath("//footer//a[contains(text(),'Gift Certificates')]");
        affiliates = search.xpath("//footer//a[contains(text(),'Affiliates')]");
        specials = search.xpath("//footer//a[contains(text(),'Specials')]");
        myAccountFooter = search.xpath("//footer//a[contains(text(),'My Account')]");
        orderHistory = search.xpath("//footer//a[contains(text(),'Order History')]");
        wishListFooter = search.xpath("//footer//a[contains(text(),'Wish List')]");
        newsletterFooter = search.xpath("//footer//a[contains(text(),'Newsletter')]");
        poweredBy = search.xpath("//footer//a[contains(text(),'OpenCart')]");
    }

    // Page Object

    // currency
    public WebElement getCurrency() {
        //return driver.findElement(By.cssSelector(".btn.btn-link.dropdown-toggle"));
        return currency;
    }

    public String getCurrencyText() {
        return getCurrency().getText();
    }

    public void clickCurrency() {
        getCurrency().click();
    }

    // myAccount
    public WebElement getMyAccount() {
        return myAccount;
    }

    public String getMyAccountText() {
        return getMyAccount().getText();
    }

    public void clickMyAccount() {
        getMyAccount().click();
    }

    // wishList
    public WebElement getWishList() {
        return wishList;
    }

    public String getWishListText() {
        return getWishList().getText();
    }

    public void clickWishList() {
        getWishList().click();
    }

    // shoppingCart
    public WebElement getShoppingCart() {
        return shoppingCart;
    }

    public String getShoppingCartText() {
        return getShoppingCart().getText();
    }

    public void clickShoppingCart() {
        getShoppingCart().click();
    }

    // logo
    public WebElement getLogo() {
        return logo;
    }

    public void clickLogo() {
        getLogo().click();
    }

    // searchTopField
    public WebElement getSearchTopField() {
        return searchTopField;
    }

    public String getSearchTopFieldText() {
        return getSearchTopField().getAttribute(TAG_ATTRIBUTE_VALUE);
    }

    public void clearSearchTopField() {
        getSearchTopField().clear();
    }

    public void clickSearchTopField() {
        getSearchTopField().click();
    }

    public void setSearchTopField(String text) {
        getSearchTopField().sendKeys(text);
    }

    // searchTopButton
    public WebElement getSearchTopButton() {
        return searchTopButton;
    }

    public void clickSearchTopButton() {
        getSearchTopButton().click();
    }

    // cartButton
    public WebElement getCartButton() {
        return cartButton;
    }

    public String getCartButtonText() {
        return getCartButton().getText();
    }

    public void clickCartButton() {
        getCartButton().click();
    }

    // dropdownComponent
    protected DropdownComponent getDropdownComponent() {
        //LeaveUtils.castExceptionByCondition(dropdownOptions == null, OPTION_NULL_MESSAGE);
        if (dropdownComponent == null) {
            // TODO Develop Custom Exception
            throw new RuntimeException(OPTION_NULL_MESSAGE);
        }
        return dropdownComponent;
    }

    private DropdownComponent createDropdownComponent(By searchLocator) {
        // dropdownComponent = new DropdownComponent(driver, searchLocator);
        dropdownComponent = new DropdownComponent(searchLocator);
        return getDropdownComponent();
    }

    private void clickDropdownComponentByPartialName(String optionName) {
        //LeaveUtils.castExceptionByCondition(!getDropdownOptions().isExistDropdownOptionByPartialName(optionName),
        //        String.format(OPTION_NOT_FOUND_MESSAGE, optionName, dropdownOptions.getListOptionsText().toString()));
        if (!getDropdownComponent().isExistDropdownOptionByPartialName(optionName)) {
            // TODO Develop Custom Exception
            throw new RuntimeException(String.format(OPTION_NOT_FOUND_MESSAGE, optionName,
                    getDropdownComponent().getListOptionsText().toString()));
        }
        getDropdownComponent().clickDropdownOptionByPartialName(optionName);
        dropdownComponent = null;
        //closeDropdownComponent();
    }

    protected void closeDropdownComponent() {
        clickSearchTopField();
        dropdownComponent = null;
    }

    // dropdownGuest
    protected GuestDropdown getDropdownGuest() {
        if (dropdownGuest == null) {
            // TODO Develop Custom Exception
            throw new RuntimeException(OPTION_NULL_MESSAGE);
        }
        return dropdownGuest;
    }

    private GuestDropdown createDropdownGuest() {
        // dropdownGuest = new GuestDropdown(driver);
    	dropdownGuest = new GuestDropdown();
        return getDropdownGuest();
    }

    private void clickDropdownGuestRegister() {
        getDropdownGuest().clickRegister();
        dropdownGuest = null;
    }

    private void clickDropdownGuestLogin() {
        getDropdownGuest().clickLogin();
        dropdownGuest = null;
    }

    protected void closeDropdownGuest() {
        clickSearchTopField();
        dropdownGuest = null;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////

    // dropdownCurrency
    protected CurrencyDropdown getDropdownCurrency(String currency) {
    	if(dropdownCurrency == null) {
    		throw new RuntimeException(OPTION_NULL_MESSAGE);
    	}
    	return dropdownCurrency;
    }

    private CurrencyDropdown createDropdownCurrency(String currency) {
    	// dropdownCurrency = new CurrencyDropdown(driver, currency);
    	dropdownCurrency = new CurrencyDropdown(currency);
    	return getDropdownCurrency(currency);
    }

    private void clickDropdownCurrencySelect(String currency) {
    	getDropdownCurrency(currency).clickSelectCurrency();
    	dropdownCurrency = null;
    }

    protected void closeDropdownCurrency() {
    	clickSearchTopField();
    	dropdownCurrency = null;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    // dropdownLogged
    protected LoggedDropdown getDropdownLogged() {
        if (dropdownLogged == null) {
            // TODO Develop Custom Exception
            throw new RuntimeException(OPTION_NULL_MESSAGE);
        }
        return dropdownLogged;
    }

    private LoggedDropdown createDropdownLogged() {
        // dropdownLogged = new LoggedDropdown(driver);
    	dropdownLogged = new LoggedDropdown();
        return getDropdownLogged();
    }

    protected void clickDropdownLoggedMyAccount() {
        getDropdownLogged().clickMyAccount();
        dropdownLogged = null;
    }

    protected void clickDropdownLoggedOrderHistory() {
        getDropdownLogged().clickOrderHistory();
        dropdownLogged = null;
    }

    protected void clickDropdownLoggedTransactions() {
        getDropdownLogged().clickTransactions();
        dropdownLogged = null;
    }

    protected void clickDropdownLoggedDownloads() {
        getDropdownLogged().clickDownloads();
        dropdownLogged = null;
    }

    private void clickDropdownLoggedLogout() {
        getDropdownLogged().clickLogout();
        dropdownLogged = null;
    }

    protected void closeDropdownLogged() {
        clickSearchTopField();
        dropdownLogged = null;
    }
    
    // aboutUs
    public WebElement getAboutUs() {
        return aboutUs;
    }

    public String getAboutUsText() {
        return getAboutUs().getText();
    }

    public void clickAboutUs() {
        getAboutUs().click();
    }
    
    public WebElement getDeliveryInformation() {
        return deliveryInformation;
    }

    public String getDeliveryInformationText() {
        return getDeliveryInformation().getText();
    }

    public void clickDeliveryInformation() {
        getDeliveryInformation().click();
    }
    
    public WebElement getPrivacyPolicy() {
        return privacyPolicy;
    }

    public String getPrivacyPolicyText() {
        return getPrivacyPolicy().getText();
    }

    public void clickPrivacyPolicy() {
    	getPrivacyPolicy().click();
    }
    
    public WebElement getTermsConditions() {
        return termsConditions;
    }

    public String getTermsConditionsText() {
        return getTermsConditions().getText();
    }

    public void clickTermsConditions() {
    	getTermsConditions().click();
    }
    
    public WebElement getContactUs() {
        return contactUs;
    }

    public String getContactUsText() {
        return getContactUs().getText();
    }

    public void clickContactUs() {
    	getContactUs().click();
    }
    
    public WebElement getReturns() {
        return returns;
    }

    public String getReturnsText() {
        return getReturns().getText();
    }

    public void clickReturns() {
    	getReturns().click();
    }
    
    public WebElement getSiteMap() {
        return siteMap;
    }

    public String getSiteMapText() {
        return getSiteMap().getText();
    }

    public void clickSiteMap() {
    	getSiteMap().click();
    }
    
    public WebElement getBrands() {
        return brands;
    }

    public String getBrandsText() {
        return getBrands().getText();
    }

    public void clickBrands() {
    	getBrands().click();
    }
    
    public WebElement getGiftCertificates() {
        return giftCertificates;
    }

    public String getGiftCertificatesText() {
        return getGiftCertificates().getText();
    }

    public void clickGiftCertificates() {
    	getGiftCertificates().click();
    }
    
    public WebElement getAffiliates() {
        return affiliates;
    }

    public String getAffiliatesText() {
        return getAffiliates().getText();
    }

    public void clickAffiliates() {
    	getAffiliates().click();
    }
    
    public WebElement getSpecials() {
        return specials;
    }

    public String getSpecialsText() {
        return getSpecials().getText();
    }

    public void clickSpecials() {
    	getSpecials().click();
    }
    
    public WebElement getMyAccountFooter() {
        return myAccountFooter;
    }

    public String getMyAccountFooterText() {
        return getMyAccountFooter().getText();
    }

    public void clickMyAccountFooter() {
    	getMyAccountFooter().click();
    }
    
    public WebElement getOrderHistory() {
        return orderHistory;
    }

    public String getOrderHistoryText() {
        return getOrderHistory().getText();
    }

    public void clickOrderHistory() {
    	getOrderHistory().click();
    }
    
    public WebElement getWishListFooter() {
        return wishListFooter;
    }

    public String getWishListFooterText() {
        return getWishListFooter().getText();
    }

    public void clickWishListFooter() {
    	getWishListFooter().click();
    }
    
    public WebElement getNewsletterFooter() {
        return newsletterFooter;
    }

    public String getNewsletterFooterText() {
        return getNewsletterFooter().getText();
    }

    public void clickNewsletterFooter() {
    	getNewsletterFooter().click();
    }
    
    public WebElement getPoweredBy() {
        return poweredBy;
    }

    public String getPoweredByText() {
        return getPoweredBy().getText();
    }

    public void clickPoweredBy() {
    	getPoweredBy().click();
    }

    // menu // TODO

    // Functional

    // currency
    private void openCurrencyDropdownComponent() {
        clickSearchTopField();
        //closeDropdownComponent();
        clickCurrency();
        createDropdownComponent(By.cssSelector(LIST_CURRENCIES_CSSSELECTOR));
    }

    //protected void clickCurrencyByPartialName(String currencyName) { // Code Smell
    protected void clickCurrencyByPartialName(Currencies optionName) {
        openCurrencyDropdownComponent();
        //clickDropdownComponentByPartialName(currencyName);
        clickDropdownComponentByPartialName(optionName.toString());
    }

    // myAccount
    protected void openMyAccountDropdown() {
        clickSearchTopField();
        clickMyAccount();
    }

    // searchTopField
    protected void fillSearchTopField(String searchText) {
        clickSearchTopField();
        clearSearchTopField();
        setSearchTopField(searchText);
    }

    protected void scrollToElement(WebElement webElement) {
        //        Actions action = new Actions(driver);
        //        action.moveToElement(webElement).perform();
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webElement);
    	((JavascriptExecutor) DriverWrapper.getDriver()).executeScript("arguments[0].scrollIntoView(true);", webElement);
    }

    // Business Logic

    public HomePage gotoHomePage() {
        clickLogo();
        // return new HomePage(driver);
        return new HomePage();
    }

    // dropdownGuest
    public LoginPage gotoLoginPage() {
        openMyAccountDropdown();
        createDropdownGuest();
        clickDropdownGuestLogin();
        // return new LoginPage(driver);
        return new LoginPage();
    }

    public RegisterPage gotoRegisterPage() {
        openMyAccountDropdown();
        createDropdownGuest();
        clickDropdownGuestRegister();
        // return new RegisterPage(driver);
        return new RegisterPage();
    }

    public AccountLogoutPage logout() {
        openMyAccountDropdown();
        createDropdownLogged();
        clickDropdownLoggedLogout();
        // return new AccountLogoutPage(driver);
        return new AccountLogoutPage();
    }
    
    public HomePage selectCurrency(String currency) {
    	clickCurrency();
    	createDropdownCurrency(currency);
    	clickDropdownCurrencySelect(currency);
    	// return new HomePage(driver);
    	return new HomePage();
    }
    
    public AboutUsPage gotoAboutUsPage() {
    	clickAboutUs();
    	return new AboutUsPage();
    }
    
    public DeliveryInformationPage gotoDeliveryInformationPage() {
    	clickDeliveryInformation();
    	return new DeliveryInformationPage();
    }
    
    public PrivacyPolicyPage gotoPrivacyPolicyPage() {
    	clickPrivacyPolicy();
    	return new PrivacyPolicyPage();
    }
    
    public TermsConditionsPage gotoTermsConditionsPage() {
    	clickTermsConditions();
    	return new TermsConditionsPage();
    }
    
    public ContactUsPage gotoContactUsPage() {
    	clickContactUs();
    	return new ContactUsPage();
    }

}