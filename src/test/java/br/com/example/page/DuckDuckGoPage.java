package br.com.example.page;

import br.com.example.config.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by rondymesquita on 26/09/15.
 */
public class DuckDuckGoPage extends BasePage{

    private static final String URL = "https://duckduckgo.com";
    public final By searchFieldSelectorBy = By.id("search_form_input_homepage");
    public final By searchButtonSelectorBy = By.id("search_button_homepage");

    public DuckDuckGoPage(WebDriver driver) {
        super(driver, URL);
    }

    public void setSearchField(String search){
        Logger.logInfo(searchFieldSelectorBy.toString());
        WebElement searchField = driver.findElement(searchFieldSelectorBy);
        searchField.sendKeys(search);
    }

    public void clickOnSearchButton(){
        driver.findElement(searchButtonSelectorBy).click();
    }

    public void doSearch(String search){
        setSearchField(search);
        clickOnSearchButton();
    }









}
