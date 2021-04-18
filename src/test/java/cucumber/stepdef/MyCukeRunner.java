package cucumber.stepdef;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/cucumber-report.html","pretty"},features ="src/test/java/features",snippets = SnippetType.CAMELCASE)



public class MyCukeRunner
{

}
