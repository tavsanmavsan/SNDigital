package StepDefinitions;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {


    WebDriver driver = null;

    @Given("the user is on login page")
    public void the_user_is_on_login_page() {

        System.setProperty("webdriver.chrome.driver","/Users/x/Documents/SNDigitalProject/src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("https://link.springer.com/signup-login?previousUrl=https%3A%2F%2Flink.springer.com%2F");


        System.out.println("The user is on the login page");
    }

    @When("the user enters (.*) and (.*)$")
    public void the_user_email_and_password(String email, String password) {

        driver.findElement(By.id("login-box-email")).sendKeys(email);
        driver.findElement(By.id("login-box-pw")).sendKeys(password);
        System.out.println("Entered valid email and password");
    }

    @And("hits Log in")
    public void hits_log_in() {

        driver.findElement(By.xpath(("//button[normalize-space()=\"Log in\"]"))).click();

        System.out.println("Hits on Log in");

    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {

        driver.findElement(By.id("user")).isDisplayed();
        System.out.println("The user is logged in");
        driver.close();
        driver.quit();
    }




    }




