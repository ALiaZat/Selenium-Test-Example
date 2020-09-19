import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
    WebDriver browser;
    @BeforeEach
    public void setup(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Downloads\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://forms.office.com/Pages/ResponsePage.aspx?id=DQSIkWdsW0yxEjajBLZtrQAAAAAAAAAAAAN__tQlYTdURExDM0ZZQVBZQzIyRjQzMjNMTFk3RTYzMy4u");
    }

    @Test
    public void testCheckBox() {
        WebElement checkBox1 = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div/label/span/span/span"));
        checkBox1.click();
        WebElement checkBox2 = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[3]/div/label/span/span/span"));
        checkBox2.click();
    }
    @Test
    public void testRadioButton(){
        WebElement radioButton = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[6]/div/div[2]/div/div[2]/div/label/span/span/span"));
        radioButton.click();
    }
    @Test
    public void testDateField(){
        WebElement dateField = browser.findElement(By.xpath("//*[@id=\"P1287692460_table\"]/tbody/tr[3]/td[7]/div"));
        dateField.click();
    }
    @AfterEach
    public void finish(){
        browser.close();
    }
}
