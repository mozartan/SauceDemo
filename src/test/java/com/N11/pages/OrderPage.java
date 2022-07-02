package com.N11.pages;

import com.N11.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage {

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

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//div[2]/ul[@class='list-ul']/li[3]")
    public WebElement favoriteProduct;
    @FindBy(xpath = "//span[@class='icon-base heart-favorites-black']")
    public WebElement favoriteIcon;
    @FindBy(xpath = "//span[@class='deleteProFromFavorites']")
    public WebElement deleteFavorite;

    @FindBy(xpath = "//span[@class='btn btnBlack confirm']")
    public WebElement deleteConfirm;

    @FindBy(xpath = "//div[@class='emptyWatchList hiddentext']")
    public WebElement emptyFavorite;

    @FindBy(xpath = "//a[@class='logoutBtn']")
    public WebElement logoutButton;


    @FindBy(xpath = "//button[@class='dn-slide-accept-btn']")
    public WebElement acceptButton;

    @FindBy(xpath = "//div[@class='dn-slide-body']")
    public WebElement slideBody;
    public WebElement pageSelect(String pageNum) {
        String pageNumber = "//div[@class='pagination']/a[" + pageNum + "]";
        WebElement pageNumberSelected = Driver.get().findElement(By.xpath(pageNumber));

        return pageNumberSelected;
    }

    public WebElement productFavorite(String productFav) {
        String productFavory = "//ul[@class='list-ul']/li[" + productFav + "]//span[@title='Favorilere ekle']";
        WebElement productSelected = Driver.get().findElement(By.xpath(productFavory));

        return productSelected;
    }
    public WebElement hesabımHover(String hesap) {
        String hesabım1 = "//a[@title='" + hesap + "']";
        WebElement hesaphoverover = Driver.get().findElement(By.xpath(hesabım1));

        return hesaphoverover;
    }
    public WebElement favoriListe(String favori) {
        String favori1 = "//a[@title='" + favori + "']";
        WebElement favorilist = Driver.get().findElement(By.xpath(favori1));

        return favorilist;
    }
}