package com.choucair.certification.demoserenity.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OpenOrdersComponent {
    public static final Target CUSTOMER_LST=Target.the("list to select the customer")
            .locatedBy("//*[@id='s2id_Serenity_Demo_Northwind_OrderGrid0_QuickFilter_CustomerID']");

    public static final Target CUSTOMER_LST2=Target.the("list to select the customer")
            .located(By.id("s2id_autogen1_search"));

    public static final String ORDERS_NUMBER="//*[@class='slick-cell l0 r0 align-right']";

}
