package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SearchSteps {
//defining webdriver
WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {

        //downloading and defining chrome web browser drivers
        System.setProperty("webdriver.chrome.driver","/Users/x/Documents/SNDigitalProject/src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        //added waiting time for slower internet connections
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    }
    @And("user is on the search page")
    public void user_is_on_the_search_page() {
        //below line will open the web page
        driver.navigate().to("https://link.springer.com/");

    }

    @When("user enters a (.*)$")
    public void userEntersATextInSearchBox(String text) {
//below line will find the search box and sends the keywords in Examples list
        driver.findElement(By.id("query")).sendKeys(text);

    }

    @And("hits search button")
    public void hits_search_button() {
        //below line will click on the search button
        driver.findElement(By.id("search")).click();

    }
    @Then("user is navigated to the search results page")
    public void user_is_navigated_to_the_search_results_page() {
        //below line will check the search results containing "Result(s)" keyword
        driver.getPageSource().contains("Result(s)");
       //below line will close the current Chrome page
        driver.close();
        //below line will close all the open Chrome pages
        driver.quit();

    }


}
