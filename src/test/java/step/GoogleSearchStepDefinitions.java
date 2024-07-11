package step;


import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class GoogleSearchStepDefinitions {
    private WebDriver driver;

    @Given("I am on the Google search page")
    public void i_am_on_the_google_search_page() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://www.google.com");
        System.out.println("ejecutado");
    }

    @When("I search for {string}")
    public void i_search_for(String searchText) {
        driver.findElement(By.name("q")).sendKeys("Loviu morcito" + Keys.ENTER);
    }

    @Then("I should see results related to {string}")
    public void i_should_see_results_related_to(String searchText) {
        // Implementar la verificación de los resultados
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}