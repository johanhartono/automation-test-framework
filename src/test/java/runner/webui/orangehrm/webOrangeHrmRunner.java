package runner.webui.orangehrm;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"stepDef"},
        features = {"src/test/java/features"},
        tags = "@weborangehrm",
        monochrome = true

)
public class webOrangeHrmRunner {
    
}
