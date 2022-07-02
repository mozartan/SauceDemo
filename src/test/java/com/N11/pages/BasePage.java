package com.N11.pages;


import com.N11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage (){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//a[contains(text(),'Giriş Yap')]")
    public WebElement girisYap;
    @FindBy(xpath = "//a[@class='active ']")
    public WebElement activePage;

    @FindBy(xpath = "//div[@class='pagination']/a[2]")
    public WebElement page2;

    @FindBy(xpath = "//div[@class='resultText ']")
    public WebElement resultText;

    @FindBy(xpath = "//span[@class='iconsSearch']")
    public WebElement searchIcon;

    @FindBy(xpath = "//input[@id='searchData']")
    public WebElement searchBar;

    @FindBy(xpath = "//div[@id='loginButton']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@title='Hesabım']")
    public WebElement hesabim;
    @FindBy(xpath = "//a[@title='Favorilerim / Listelerim']")
    public WebElement favoriliste;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;


}
