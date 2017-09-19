package step_definitions;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.search.FlagTerm;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class stepdefinitions {

    private RemoteWebDriver driver;

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    Timestamp now = new Timestamp(System.currentTimeMillis());
    String str = df.format(now);



    @Given("^I am on myTW login page$")
    public void goTomyTW() throws MalformedURLException {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL("http://0.0.0.0:4444/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://thoughtworks-preview.jiveon.com");
    }

    @When("^I login myTW$")
    public void I_enter_Username_as_and_Password_as() {
        String username = System.getenv("USER3_USERNAME");
        String password = System.getenv("USER3_PASSWORD");
        driver.findElement(By.id("okta-signin-username")).sendKeys(username);
        driver.findElement(By.id("okta-signin-password")).sendKeys(password);
        driver.findElement(By.id("okta-signin-submit")).click();
    }
    @When("^I send a email to group$")
    public void I_send_a_email_to_group() {

        String to = "test-automation@dev.thoughtworks.com";

        String from = "cnctester3@dev.thoughtworks.com";
        final String username = System.getenv("USER3_USERNAME");
        final String password = System.getenv("USER_GOOGLE_PASSWORD");

        String host = "smtp.gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");


        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("Testing Email to Jive" + str);
            message.setText("This is to testing Email to Jive" + str);
            Transport.send(message);
            System.out.println("Sent message succesfully.....");

        } catch (MessagingException e) {
            throw new RuntimeException(e);

        }
    }


    @And("^I enter Security answer")

    public void I_enter_Security_answer_as() {

        String security_answer = System.getenv("SECURITY_ANSWER");
        driver.findElement(By.id("input67")).sendKeys(security_answer);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='form60']/div[2]/input")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @And("^I wait for a while$")
    public void I_wait_for_a_while() throws InterruptedException {
        Thread.sleep(40000);
    }

    @And("^I open a new tab and go to testing group$")
    public void I_open_a_new_tab_and_go_to_testing_group() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://thoughtworks-preview.jiveon.com/groups/test-automation");
    }


    @And("^I post a new discussion in Jive$")
    public void I_post_a_new_discussion_in_Jive() {
        driver.findElement(By.xpath("//*[@id=\"j-as-create-menu-items\"]/a[2]")).click();
        driver.findElement(By.id("subject")).sendKeys("test" + str);
        driver.switchTo().frame(driver.findElement(By.id("wysiwygtext_ifr")));
        driver.findElement(By.id("tinymce")).sendKeys("test" + str);
        driver.switchTo().defaultContent();
        WebElement elementToClick = driver.findElement(By.id("submitButton"));
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + elementToClick.getLocation().y + ")");
        elementToClick.click();
    }

    @And("^I post a new question in Jive$")
    public void I_post_a_new_quesion_in_Jive() {
        driver.findElement(By.xpath("//*[@id=\"j-as-create-menu-items\"]/a[1]")).click();
        driver.findElement(By.id("subject")).sendKeys("test" + str);
        driver.switchTo().frame(driver.findElement(By.id("wysiwygtext_ifr")));
        driver.findElement(By.id("tinymce")).sendKeys("test" + str);
        driver.switchTo().defaultContent();
        WebElement elementToClick = driver.findElement(By.id("submitButton"));
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + elementToClick.getLocation().y + ")");
        elementToClick.click();
    }

    @And("^I open a new tab and login Gmail$")
    public void I_open_a_new_tab_and_login_Gmail_with() {

        String google_user = System.getenv("USER3_USERNAME");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.open()");
        ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(2));
        driver.get("https://mail.google.com/mail/u/0/#inbox");
        driver.findElement(By.id("identifierId")).sendKeys(google_user);
        driver.findElement(By.id("identifierNext")).click();
    }

    @Then("^I should see a discussion with the same title as the email$")
    public void I_see_a_discussion_in_jive() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://thoughtworks-preview.jiveon.com/groups/test-automation/content");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String title = driver.findElement(By.xpath("//*[@id=\"j-browse-item-grid\"]/ul/li[1]/div/div[1]/header/h4/a/span[2]")).getText();
        String str1 = "Testing Email to Jive" + str;
        assertEquals(str1, title);
        System.out.println("This is the title: " + title);
    }

    @And("^I open the discussion to check the content and sender$")
    public void I_check_the_content_and_sender() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", driver.findElement(By.xpath(".//*[@id='j-browse-item-grid']/ul/li[1]/div/div[1]/header/h4/a/span[2]")));

       /* /WebElement elementToClick = driver.findElement(By.xpath(".//*[@id='j-browse-item-grid']/ul/li[1]/div/div[1]/header/h4/a/span[2]"));
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + elementToClick.getLocation().y + ")");
        elementToClick.click();*/

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String ActualBody = driver.findElement(By.cssSelector(".soemailbody")).getText();
        String ActualSender = driver.findElement(By.xpath(".//*[@id='jive-body-main']/div[2]/section/div[1]/div[2]/table/tbody/tr[1]/td[2]/a")).getText();
        String ExpectedBody = "This is to testing Email to Jive" + str;
        String ExpectedSend = "cnctester3@dev.thoughtworks.com";
        assertEquals(ExpectedBody, ActualBody);
        assertEquals(ExpectedSend, ActualSender);

        System.out.println("This is the body:" + ActualBody);
        System.out.println("This is the sender:" + ActualSender);
    }

    @Then("^I get the email in Gmail$")
    public void I_get_the_email_in_Gmail() throws Exception {
        Session session = Session.getDefaultInstance(new Properties());
        Store store = session.getStore("imaps");
        String username = System.getenv("USER3_USERNAME");
        String password = System.getenv("USER_GOOGLE_PASSWORD");
        store.connect("imap.googlemail.com", 993, username, password);
        Folder inbox = store.getFolder("INBOX");
        inbox.open(Folder.READ_WRITE);

        // Fetch unseen messages from inbox folder
        Message[] messages = inbox.search(
                new FlagTerm(new Flags(Flags.Flag.SEEN), false));

        // Sort messages from recent to oldest
        Arrays.sort(messages, (Message m1, Message m2) -> {
            try {
                return m2.getSentDate().compareTo(m1.getSentDate());
            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
        });

        for (Message message : messages) {
            System.out.println(
                    "sendDate: " + message.getSentDate()
                            + " subject:" + message.getSubject() + "From:" + Arrays.toString(message.getFrom()));


            String str1 = "test" + str;
            String str2 = message.getSubject();
            String str3 = Arrays.toString(message.getFrom());
            assertEquals(str1, str2);
            assertEquals("[CNC3 Tester3 <streamonce@dev.thoughtworks.com>]", str3);
            System.out.println(str2);

        }

    }
}