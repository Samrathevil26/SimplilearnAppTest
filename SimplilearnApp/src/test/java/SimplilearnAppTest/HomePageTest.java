package SimplilearnAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void testHomePageTitle() {
        driver.get("https://www.simplilearn.com/");
        String expectedTitle = "Simplilearn: Learn Advanced Skills Online";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void testHomePageHeader() {
        driver.get("https://www.simplilearn.com/");
        WebElement header = driver.findElement(By.xpath("//h1[contains(text(),'SkillUp with Simplilearn')]"));
        Assert.assertTrue(header.isDisplayed());
    }
}