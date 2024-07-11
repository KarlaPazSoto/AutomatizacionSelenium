package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
    private WebDriver driver;

    // Locators
    private By searchBox = By.name("q");
    private By searchButton = By.name("btnK");

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String searchText) {
        driver.findElement(searchBox).sendKeys(searchText);
        driver.findElement(searchButton).click();
    }
}
