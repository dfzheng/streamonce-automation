package step_definitions;
import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@Cucumber.Options(
format={"pretty", "html:target/cucumber"},
features = {"features/QuestionJive2Email.feature", "features/Email2Jive.feature"})
public class runTest {
}