package com.choucair.certification.demoserenity.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {

    public static final Target USERNAME_TXT = Target.the("field to type the username")
            .located(By.id("LoginPanel0_Username"));

    public static final Target PASSWORD_TXT = Target.the("field to type the password")
            .located(By.id("LoginPanel0_Password"));

    public static final Target SIGN_IN_BTN=Target.the("button to send the account information")
            .located(By.id("LoginPanel0_LoginButton"));


}
