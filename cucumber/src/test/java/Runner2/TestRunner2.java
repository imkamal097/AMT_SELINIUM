package Runner2;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src//test//resource//Feature2"},
glue= {"stepdef2"},
plugin = {"pretty","html:target/htmlreports/report.html"}
//tags="@set21"
)


public class TestRunner2 extends AbstractTestNGCucumberTests{

}