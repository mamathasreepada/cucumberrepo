package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\pavan\\eclipse-workspace\\DemoQACucumber\\src\\main\\java\\Features\\Login.feature"
		,glue={"steps"},
		monochrome= true
		//,tags = "@Smoke"
		)
public class runner {

}
