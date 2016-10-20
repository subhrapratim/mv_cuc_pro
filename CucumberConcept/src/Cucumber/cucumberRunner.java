package Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format={"preety","json:target/"},features={"src/Cucumber/"})
//@CucumberOptions(format={"preety","html:target/html/"},features={"src/Cucumber/"})
public class cucumberRunner {

	

}
