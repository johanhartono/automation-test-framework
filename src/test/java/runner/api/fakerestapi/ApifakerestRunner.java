package runner.api.fakerestapi;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"stepDef"},
        features = {"src/test/java/features"},
        tags = "@apifakerest",
        monochrome = true

)
public class ApifakerestRunner {
}
