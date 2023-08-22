package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/", 
glue= {"steps"},
plugin = {"json:target/cucumber.json"})

public class CucumberRunner {

}
