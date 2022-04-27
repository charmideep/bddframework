package setrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\javapra\\bddframework\\feature",
		glue= {"stepdefination"},
		monochrome=true,
		plugin= {"pretty",
				"html:target/test-output/reprt.html"}
		
		
		
		
		)

public class StepRunner {

}
