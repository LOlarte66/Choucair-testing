package com.choucair.certification.demoserenity.tasks;

import com.choucair.certification.demoserenity.userInterfaces.ProductComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SearchProduct implements Task {

    public String nameP;

    public SearchProduct(String nameP) {
        this.nameP = nameP;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(nameP).into(ProductComponent.SEARCH_PRODUCT_TXT),
                WaitUntil.the(ProductComponent.SEARCHED_PRODUCT_NAME_LABEL, WebElementStateMatchers.isPresent()));
    }

    public static SearchProduct of(String nameP) {
        return Tasks.instrumented(SearchProduct.class, nameP);
    }
}
