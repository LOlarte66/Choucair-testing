package com.choucair.certification.demoserenity.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductComponent {

    public static final Target ADD_PRODUCT_BTN = Target.the("button to add one product")
            .locatedBy("//*[@class='fa fa-plus-circle text-green']");

    public static final Target PRODUCT_NAME_TXT = Target.the("the field to type the product name")
            .locatedBy("(//*[@name='ProductName'])[1]");

    public static final Target UNITS_IN_STOCK_TXT = Target.the("the field to type the units in stock")
            .locatedBy("(//*[@name='UnitsInStock'])[1]");

    public static final Target SAVE_BTN = Target.the("the button to save the product")
            .locatedBy("(//*[contains(text(),'Guardar')])[1]");

    public static final Target SEARCH_PRODUCT_TXT = Target.the("the button to searche the product")
            .locatedBy("//*[@title='introduzca el texto a buscar ...']");

    public static final Target SEARCHED_PRODUCT_NAME_LABEL = Target.the("the label of the searched product")
            .locatedBy("(//*[@data-item-type='Demo.Northwind.Product'])[2]");

    public static final Target SEARCHED_PRODUCT_UNIT_STOCK_LABEL = Target.the("the label of the unit in stock of the searched product")
            .locatedBy("(//*[@data-field='UnitsInStock'])[1]");

}
