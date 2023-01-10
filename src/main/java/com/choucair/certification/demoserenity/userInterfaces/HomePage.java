package com.choucair.certification.demoserenity.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target PERSON_BTN = Target.the("button to view the account information")
            .locatedBy("//*[@class='s-sidebar-band-link s-user-profile-link']");

    public static final Target PERSON_LBL = Target.the("label to view the username")
            .locatedBy("(//*[@class='s-user-info fs-6 mb-1'])[1]");

    public static final Target OPEN_ORDERS_BTN = Target.the("btn to see the open orders")
            .locatedBy("(//*[@class='card-footer'])[1]");

    public static final Target NORTHWIND_BTN = Target.the("btn to see Northwind menu")
            .locatedBy("    (//*[contains(text(),'Northwind')])[2]");

    public static final Target PRODUCTS_BTN = Target.the("the button to see the products")
            .locatedBy("(//*[contains(text(),'Products')])[1]");

}
