package Runner;
import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;	

@RunWith(Cucumber.class)				
@CucumberOptions(features="src/test/resources/Features/Login.Feature",glue="StepDefinition",

plugin = {
		"pretty",
        "junit:target/JunitR/report.xml",}
        //"json:target/JSONreports/report.json",}
       // "html:target/HTML RP"}

)
public class  Run {

}
 