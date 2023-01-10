package com.choucair.certification.demoserenity.stepsDefinition;

import com.choucair.certification.demoserenity.models.LoginData;
import com.choucair.certification.demoserenity.questions.DisplayedName;
import com.choucair.certification.demoserenity.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class LoginStep {

    @Managed
    private WebDriver myDriver;
    Actor Carolina;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        Carolina=OnStage.theActorCalled("Carolina");
        Carolina.can(BrowseTheWeb.with(myDriver));
    }

    @Given("^Carolina has accessed the main page$")
    public void carolinaHasAccessedTheMainPage() {
        Carolina.wasAbleTo(Open.url("https://serenity.is/demo/"));
    }

    @When("^Carolina tries to enter her account$")
    public void carolinaTriesToEnterHerAccount(List<LoginData>loginDataList) {
        Carolina.attemptsTo(Login.withCredentials(loginDataList));
    }

    @Then("^Carolina will see her name$")
    public void carolinaWillSeeHerName(List<LoginData>loginDataList) {
        Carolina.should(seeThat(DisplayedName.ofUser(),
                is(equalTo(loginDataList.get(0).getName()))));
    }




}
