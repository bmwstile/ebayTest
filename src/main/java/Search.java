import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class Search {
    private WebDriver driver;
    public Search(WebDriver driver) { this.driver = driver; }

    @Step("Поиск \"{0}\"")
    void search(String search) {
        WebElement inputSearch = driver.findElement(By.xpath(".//input[@id='gh-ac']"));
        inputSearch.sendKeys(search);
        inputSearch.sendKeys(Keys.ENTER);
    }

    @Step("Поиск \"{0}\"")
    void search2(String search) {
        WebElement inputSearch = driver.findElement(By.xpath(".//input[@id='gh-ac']"));
        inputSearch.sendKeys(search);
        inputSearch.sendKeys(Keys.ENTER);


    }
}
