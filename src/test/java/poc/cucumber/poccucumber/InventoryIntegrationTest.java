package poc.cucumber.poccucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "C:\\Users\\AMEY\\Downloads\\poc-cucumber\\src\\test\\resources\\features" },
glue = { "poc.cucumber.poccucumber" }
)
public class InventoryIntegrationTest {

}
