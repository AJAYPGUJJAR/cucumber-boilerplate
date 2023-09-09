package com.apsg.steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefs {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = new ChromeDriver();
    }

    @Given("I open url {string}")
    public void openWebsite(String url) {
        driver.navigate().to(url);
    }

    @And("I pause for {int}ms")
    public void iPauseForMs(int pauseTime) {
        try {
            Thread.sleep(pauseTime);
        }catch (Exception e) {
            System.out.println("iPauseForMs function failed");
        }
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

}
