package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src//test//resource//Feature"},
glue= {"stepdef"},
plugin = {"pretty","html:target/htmlreports/report.html"},
tags="@f6"
)


public class RunnerTest extends AbstractTestNGCucumberTests{

}


