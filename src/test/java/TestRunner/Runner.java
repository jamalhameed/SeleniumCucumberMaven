package TestRunner;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.*;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features", glue= {"StepDefinition"})

public class Runner {

}
