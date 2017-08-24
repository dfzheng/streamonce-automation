package step_definitions;

import com.google.api.services.admin.directory.Directory;
import cucumber.annotation.en.And;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import mail.Gsuite;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by dfzheng on 22/08/2017.
 */
public class AddonWebhook {

    WebDriver driver = null;

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    Timestamp now = new Timestamp(System.currentTimeMillis());
    String str = df.format(now);



    @When("^I click create group$")
    public void I_click_create_group() {

        driver.findElement(By.xpath(".//*[@id='create-list-2']/li[2]/a/span[2]")).click();
    }

    @And("^I enter group name and choose defaul group type as public$")
    public void I_enter_group_name() {
        driver.findElement(By.id("groupname")).sendKeys("test-automation");
        driver.findElement(By.id("description")).sendKeys("test automation description");

    }

    @And("^I click create group button$")
    public void I_click_create_group_button() {

        driver.findElement(By.id("submit-group")).click();
    }

    @Then("^The group will be created successfully and I will on the group page$")
    public void valid_group_information() {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://thoughtworks-preview.jiveon.com/groups/test-automation");

     /*   driver.findElement(By.id("jive-place-link-about")).click();
        String Email = driver.findElement(By.xpath(".//*[@id='js-modalized']/div/section/div[3]/p[1]")).getText();
        Assert.assertTrue(Email.contains("test-automation@dev.thoughtworks.com"));
     */
    }

    @And("^the creator's email and integrate user email will be in the group$")

    public void getDirectoryService() throws Exception {
        Directory directory = Gsuite.getDirectoryService("streamonce@dev.thoughtworks.com");
//        Directory.Groups groups = directory.groups();
//        directory.members().get("so-automation@dev.thoughtworks.com","");
        List<Map> members = (List<Map>) (directory.members().get("so-automation@dev.thoughtworks.com", "").execute().get("members"));
        boolean emailFound = false;
        for (Map<String, String> dataMap : members) {
            if (dataMap.get("email").equals("cnctester2@dev.thoughtworks.com")) {
                emailFound = true;
                break;
            }
        }
        assertThat(emailFound, is(true));
    }
}
