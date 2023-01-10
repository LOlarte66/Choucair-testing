package com.choucair.certification.demoserenity.questions;

import com.choucair.certification.demoserenity.userInterfaces.ProductComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

public class DetailsProduct implements Question {

    List<String> listDetails = new ArrayList<String>();

    @Override
    public Object answeredBy(Actor actor) {
        listDetails.add(Text.of(ProductComponent.SEARCHED_PRODUCT_NAME_LABEL)
                .viewedBy(actor).asString());
        listDetails.add(ProductComponent.SEARCHED_PRODUCT_UNIT_STOCK_LABEL.resolveFor(actor).getAttribute("value"));
        return listDetails;
    }

    public static DetailsProduct searched() {
        return new DetailsProduct();
    }
}
