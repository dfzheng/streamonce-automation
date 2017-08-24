package step_definitions;
import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@Cucumber.Options(
format={"pretty", "html:target/cucumber"},
features = "features/DiscussionJive2Email.feature")
public class runTest {
}