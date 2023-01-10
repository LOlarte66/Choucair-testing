package com.choucair.certification.demoserenity.tasks;

import com.choucair.certification.demoserenity.interactions.WaitTime;
import com.choucair.certification.demoserenity.userInterfaces.HomePage;
import com.choucair.certification.demoserenity.userInterfaces.OpenOrdersComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class SearchOpenOrders implements Task {

    String customer;

    public SearchOpenOrders(String customer) {
        this.customer = customer;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.OPEN_ORDERS_BTN),
                Click.on(OpenOrdersComponent.CUSTOMER_LST),
                Enter.theValue(customer).into(OpenOrdersComponent.CUSTOMER_LST2)
                        .thenHit(Keys.TAB), WaitTime.during(2000));
    }

    public static SearchOpenOrders forCustomer(String customer) {
        return Tasks.instrumented(SearchOpenOrders.class, customer);
    }
}
