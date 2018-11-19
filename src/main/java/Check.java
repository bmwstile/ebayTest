import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.List;

public class Check {
    private WebDriver driver;
    public Check(WebDriver driver) { this.driver = driver; }

    @Step("Проверка")
    void check() throws InterruptedException {

        if(driver.findElements(By.xpath(".//ul[@id='ListViewInner']/li"))==null){
            System.out.println("111111111111111111");
            List<WebElement> li = driver.findElements(By.xpath(".//ul[@class='srp-results srp-list clearfix']/li"));
            Thread.sleep(2000);
            System.out.println("List size is: " + li.size());
            String count = driver.findElement(By.xpath(".//a[@class='btn btn-s small btn-ter dropdown-toggle']")).getText();
            System.out.println("count: " + count);
            int awe = Integer.parseInt(count);
            Assert.assertTrue(li.size() == awe);
            List<WebElement> a = driver.findElements(By.xpath(".//a[@class = 'vip']"));
            System.out.println("List size a is: " + a.size());
            for (WebElement element: a) {
                //Assert.assertTrue(element.getText().contains("Samsung") && element.getText().contains("SAMSUNG"));
                System.out.println(element.getText().contains("Samsung"));
            }
        }
        else {
            System.out.println("2222222222222222");
            List<WebElement> li = driver.findElements(By.xpath(".//ul[@id='ListViewInner']/li"));
            Thread.sleep(2000);
            System.out.println("List size is: " + li.size());
            String count = driver.findElement(By.xpath(".//a[@class='btn btn-s small btn-ter dropdown-toggle']")).getText();
            System.out.println("count: " + count);
            int awe = Integer.parseInt(count);
            Assert.assertTrue(li.size() == awe);
            List<WebElement> a = driver.findElements(By.xpath(".//a[@class = 'vip']"));
            System.out.println("List size a is: " + a.size());
            for (WebElement element: a) {
               // Assert.assertTrue(element.getText().contains("Samsung") && element.getText().contains("SAMSUNG"));
                System.out.println(element.getText().contains("Samsung"));
            }
        }


    }

    @Step("Проверка что мы действительно вышли")
    void logout() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath(".//span[contains(text(), 'Выход успешно выполнен. До скорой встречи.')]")).isDisplayed());
    }

}
