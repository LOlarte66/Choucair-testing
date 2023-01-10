package com.choucair.certification.demoserenity.questions;

import com.choucair.certification.demoserenity.userInterfaces.OpenOrdersComponent;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class OrdersNumber implements Question {

    public int number;

    @Override
    public Object answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        number = driver.findElements(By.xpath(OpenOrdersComponent.ORDERS_NUMBER)).size();
        System.out.println(number);
        return String.valueOf(number);
    }

    public static OrdersNumber is() {
        return new OrdersNumber();
    }
}
