import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(features = ".",dryRun = false)
@CucumberOptions(plugin = {"html:output"},
        features="src/test/Resources",
        tags={"@priya"})

public class RunTest {
}
