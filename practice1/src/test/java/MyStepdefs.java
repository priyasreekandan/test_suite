import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    public static WebDriver driver;

    @Before
    public void openbrowser() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demos1.softaculous.com/AbanteCart/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @After
    public void closebrowser() {
        driver.quit();
    }


    @Given("^user is on the HomePage$")
    public void user_Is_On_The_Homepage() {
        driver.get("http://demos1.softaculous.com/AbanteCart/");

    }

    @When("^user click mainmenu option$")
    public void userClickMainmenuOption() throws Throwable {
        driver.findElement(By.xpath("//*[@id='topnav']/select")).click();

    }

    @And("^user select special option from the mainmenu$")
    public void userSelectSpecialOptionFromTheMainmenu() throws Throwable {
        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='topnav']/select")));
        dropdown.selectByIndex(1);

    }


    @Then("^user can see the special offers page$")
    public void userCanSeeTheSpecialOffersPage() throws Throwable {
        Assert.assertEquals("Special Offers" ,"Special Offers");
    }

    @When("^user clicks on Apparell and Accessories$")
    public void userClicksOnApparellAndAccessories() throws Throwable {
        driver.findElement(By.xpath("//*[@id='categorymenu']/nav/ul/li[2]/a")).click();
    }

    @And("^user clicks on Shoes$")
    public void userClicksOnShoes() throws Throwable {
        driver.findElement(By.linkText("Shoes")).click();
    }

    @Then("^user can navigate to the details of the product$")
    public void userCanNavigateToTheDetailsOfTheProduct() throws Throwable {
        driver.findElement(By.xpath("//*[@id='maincontainer']/div/div/div/div/div[2]/div[2]/div[2]/a/img")).click();
    }

    @When("^user clicks on the Books on the product category page$")
    public void userClicksOnTheBooksOnTheProductCategoryPage() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='categorymenu']/nav/ul/li[8]/a"));

    }

    @And("^user clicks on paperback$")
    public void userClicksOnPaperback() throws Throwable {
        WebElement element=driver.findElement(By.xpath("//*[@id='categorymenu']/nav/ul/li[8]/a"));
        Actions actions=new Actions(driver);
        actions.moveToElement(element).moveToElement(driver.findElement(By.xpath("//*[@id='categorymenu']/nav/ul/li[8]/div/ul[1]/li[2]/a"))).click().build().perform();
        driver.findElement(By.xpath("//*[@id='categorymenu']/nav/ul/li[8]/div/ul[1]/li[1]/a"));
    }

    @Then("^user can see the related products$")
    public void userCanSeeTheRelatedProducts() throws Throwable {
        Assert.assertEquals("Paperback","Paperback");

    }

    @When("^user Type MEN on the search textbox$")
    public void userTypeMENOnTheSearchTextbox() throws Throwable {
        driver.findElement(By.id("filter_keyword")).click();
        driver.findElement(By.id("filter_keyword")).sendKeys("Men");
    }

    @And("^user clicks on search icon$")
    public void userClicksOnSearchIcon() throws Throwable {
        driver.findElement(By.xpath("//*[@id='search_form']/div/div/i")).click();

    }

    @Then("^user can navigate on product details page$")
    public void userCanNavigateOnProductDetailsPage() throws Throwable {
        Assert.assertEquals("Products meeting the search criteria","Products meeting the search criteria");
    }

    @When("^user clicks on facebook icon on the homepage$")
    public void userClicksOnFacebookIconOnTheHomepage() throws Throwable {
        driver.findElement(By.linkText("Facebook")).click();
    }

    @Then("^user can see the facebook home page$")
    public void userCanSeeTheFacebookHomePage() throws Throwable {
        Assert.assertEquals("See more of AbanteCart on Facebook","See more of AbanteCart on Facebook");
    }


}
