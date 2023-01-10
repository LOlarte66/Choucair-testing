package com.choucair.certification.demoserenity.stepsDefinition;

import com.choucair.certification.demoserenity.questions.OrdersNumber;
import com.choucair.certification.demoserenity.tasks.SearchOpenOrders;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class OpenOrdersStep {

    @When("^Carolina checks the number of orders for the (.*)$")
    public void carolinaChecksTheNumberOfOrdersForTheCustomer(String customer) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchOpenOrders.forCustomer(customer));
    }

    @Then("^Carolina will see the correct number of orders (.*)$")
    public void carolinaWillSeeTheCorrectNumberOfOrders(String orders) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(OrdersNumber.is(),
                Matchers.is(Matchers.equalTo(orders))));
    }

}
