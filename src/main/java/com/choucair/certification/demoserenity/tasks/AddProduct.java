package com.choucair.certification.demoserenity.tasks;

import com.choucair.certification.demoserenity.interactions.JSClick;
import com.choucair.certification.demoserenity.models.ProductData;
import com.choucair.certification.demoserenity.userInterfaces.HomePage;
import com.choucair.certification.demoserenity.userInterfaces.ProductComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class AddProduct implements Task {

    private List<ProductData> productDataList;

    public AddProduct(List<ProductData> productDataList) {
        this.productDataList = productDataList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.NORTHWIND_BTN), Click.on(HomePage.PRODUCTS_BTN), Click.on(ProductComponent.ADD_PRODUCT_BTN),
                Enter.theValue(productDataList.get(0).getNameProduct()).into(ProductComponent.PRODUCT_NAME_TXT),
                Enter.theValue(productDataList.get(0).getNumStock()).into(ProductComponent.UNITS_IN_STOCK_TXT),
                JSClick.on(ProductComponent.SAVE_BTN));
    }

    public static AddProduct withCarac(List<ProductData> productDataList) {
        return Tasks.instrumented(AddProduct.class, productDataList);
    }
}
