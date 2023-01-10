package com.choucair.certification.demoserenity.stepsDefinition;

import com.choucair.certification.demoserenity.models.ProductData;
import com.choucair.certification.demoserenity.questions.DetailsProduct;
import com.choucair.certification.demoserenity.tasks.AddProduct;
import com.choucair.certification.demoserenity.tasks.SearchProduct;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.ArrayList;
import java.util.List;

public class AddProductsStep {

    @When("^Carolina try to add one product$")
    public void carolinaTryToAddOneProduct(List<ProductData>productDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProduct.withCarac(productDataList));

    }

    @When("^Carolina search the (.*) in the inventory$")
    public void carolinaSearchTheAddedProductInTheInventory(String nameP) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchProduct.of(nameP));
    }

    @Then("^Carolina is going to see product$")
    public void carolinaIsGoingToSeeProduct(List<ProductData>list) {
        List<String> listDetails = new ArrayList<String>();
        listDetails.add(list.get(0).getNameProduct());
        listDetails.add(list.get(0).getNumStock());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.
                seeThat(DetailsProduct.searched(), Matchers.is(Matchers.equalTo(listDetails))));

    }

}
