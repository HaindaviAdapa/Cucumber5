package StepDefinitions1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
	
	@Given("I want to write a step with preconditiondsfs")
	public void i_want_to_write_a_step_with_preconditiondsfs() {
			
		System.out.println("Hello1");
	}
	
	
	@Given("some other preconditionsdfsd")
	public void some_other_preconditionsdfsd() {
		
		System.out.println("Hello2");

	}
	
	
	@When("I complete actionsdfsd")
	public void i_complete_actionsdfsd() {
		
		System.out.println("Hello3");

	}
	
	
	@When("some other actionsdf")
	public void some_other_actionsdf() {
			
		System.out.println("Hello4");
	}
	
	
	@When("yet another actionsdfs")
	public void yet_another_actionsdfs() {
		
		System.out.println("Hello5");
	  
	}
	
	
	@Then("I validate the outcomessdf")
	public void i_validate_the_outcomessdf() {
		
		System.out.println("Hello6");
	
	}
	
	
	@Then("check more outcomessdf")
	public void check_more_outcomessdf() {
	
		System.out.println("Hello7");
	}
	
	
	
	

}
