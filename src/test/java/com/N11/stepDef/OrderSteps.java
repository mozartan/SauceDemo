package com.N11.stepDef;


import com.N11.pages.OrderPage;
import com.N11.utilities.ConfigurationReader;
import com.N11.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


public class OrderSteps {


    OrderPage orderPage = new OrderPage();
    @Given("User should navigate to url")
    public void user_should_navigate_to_url() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @Then("User should assert that land on main page")
    public void user_should_assert_that_land_on_main_page() {
        Assert.assertEquals("https://www.n11.com/",Driver.get().getCurrentUrl());
    }

    @Given("User should click to {string}")
    public void user_should_click_to(String girisyap) throws InterruptedException {
      orderPage.girisYap.click();
      Thread.sleep(2000);

    }
    @Then("User should land login main page")
    public void user_should_land_login_main_page() throws InterruptedException {
        Assert.assertEquals("https://www.n11.com/giris-yap",Driver.get().getCurrentUrl());
        Thread.sleep(2000);
    }
    @When("User enters valid email and password")
    public void user_enters_valid_email_and_password() throws InterruptedException {
        orderPage.email.sendKeys(ConfigurationReader.get("email"));
        Thread.sleep(2000);
        orderPage.password.sendKeys(ConfigurationReader.get("password"));
        Thread.sleep(2000);
        orderPage.loginButton.click();
        Thread.sleep(2000);

    }
    @Then("User should assert that login is successful")
    public void user_should_assert_that_login_is_successful() throws InterruptedException {
        //Assert.assertEquals("https://www.n11.com/hesabim",Driver.get().getCurrentUrl());
        Assert.assertTrue(orderPage.hesabim.isDisplayed());
        Thread.sleep(2000);
    }

    @Given("User should click to search bar")
    public void user_should_click_to_search_bar() throws InterruptedException {
        orderPage.searchBar.click();
        Thread.sleep(2000);
    }
    @When("User should write {string} to the search bar")
    public void user_should_write_to_the_search_bar(String iphone) throws InterruptedException {
           orderPage.searchBar.sendKeys(iphone);
           Thread.sleep(2000);

    }
    @Then("User should click search button")
    public void user_should_click_search_button() throws InterruptedException {
            orderPage.searchIcon.click();
            Thread.sleep(2000);

    }
    @Then("User should assert that search is successful")
    public void user_should_assert_that_search_is_successful() throws InterruptedException {
        Assert.assertTrue(orderPage.resultText.isDisplayed());
        Thread.sleep(2000);
    }


    @Given("User should click to {string} page")
    public void user_should_click_to_page(String page) throws InterruptedException {
        orderPage.pageSelect(page).click();
        Thread.sleep(2000);
    }
    @Then("User should assert that land on second page")
    public void user_should_assert_that_land_on_second_page() throws InterruptedException {
        Assert.assertEquals("2",orderPage.activePage.getText());
        Thread.sleep(2000);
    }

    @Given("User clicks on {string} product's favorite button")
    public void user_clicks_on_product_s_favorite_button(String fav) throws InterruptedException {
     orderPage.productFavorite(fav).click();
     Thread.sleep(2000);
    }
    @Then("User should see product added to favorite")
    public void user_should_see_product_added_to_favorite() {
        System.out.println("Favorilere Eklendi.");
    }

    @Given("User should hover over {string}")
    public void user_should_hover_over(String hesap) throws InterruptedException {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(orderPage.hesabımHover(hesap)).perform();
        Thread.sleep(1000);
    }

    @When("User clicks on {string}")
    public void user_clicks_on(String favorites) throws InterruptedException {
        orderPage.favoriListe(favorites).click();
        Thread.sleep(2000);
    }
    @Then("User should assert that land on favorite list")
    public void user_should_assert_that_land_on_favorite_list() throws InterruptedException {
        Assert.assertEquals("https://www.n11.com/hesabim/istek-listelerim",Driver.get().getCurrentUrl());
        Thread.sleep(2000);
    }
    @Then("User should see favorite products")
    public void user_should_see_favorite_products() throws InterruptedException {
        Assert.assertTrue(orderPage.favoriteIcon.isDisplayed());
        Thread.sleep(2000);
    }

    @Given("User should click {string} button")
    public void user_should_click_button(String string) throws InterruptedException {
        orderPage.favoriteIcon.click();
        Thread.sleep(2000);
    }
    @Then("User should see favorite products on favorite page")
    public void user_should_see_favorite_products_on_favorite_page() throws InterruptedException {
        Assert.assertEquals("https://www.n11.com/hesabim/favorilerim",Driver.get().getCurrentUrl());
        Thread.sleep(2000);
    }
    @When("User clicks on product remove button")
    public void user_clicks_on_product_remove_button() throws InterruptedException {
        orderPage.deleteFavorite.click();
        Thread.sleep(2000);
        orderPage.deleteConfirm.click();
        Thread.sleep(2000);
    }
    @Then("User should assert that product is removed from favorite list")
    public void user_should_assert_that_product_is_removed_from_favorite_list() throws InterruptedException {
       Assert.assertEquals("İzlediğiniz bir ürün bulunmamaktadır.",orderPage.emptyFavorite.getText());
       Thread.sleep(2000);
    }

    @When("User clicks on Çıkış Yap")
    public void user_clicks_on_Çıkış_Yap() throws InterruptedException {
      orderPage.logoutButton.click();
      Thread.sleep(2000);
    }
    @Then("User should assert that logout is successful")
    public void user_should_assert_that_logout_is_successful() throws InterruptedException {
        Assert.assertTrue(orderPage.loginButton.isDisplayed());
        System.out.println("Çıkış yapıldı.");
        Thread.sleep(2000);
    }
}
