package poc.cucumber.poccucumber;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PocCucumberStepDefinitions {

	InventoryChecker checker;
	boolean check;

	@Given("^I have a stock inventory$")
	public void  i_have_stock_inventory()
	{   
	    checker = new InventoryChecker();
	}
	
	@When("I place (-?\\d+) sell order")
	public void place_stock_sell_order(int stock)
	{
		
		check = checker.checkStock(stock);
		
	}
	
	@Then("I will get the (\\w+)")
	public void i_will_get_the_success(String result)
	{
		System.out.println("Reaching Here as well --------------------------->"+result);
		String status="failure";
		if(check)
		{
			status = "success";
		}
		else
		{
			status = "fail";
		}
		
		String success = "success";
		
		assertThat(result).isEqualTo(status);
		System.out.println("Reaching there as well --------------------------->");
	}
	
}
