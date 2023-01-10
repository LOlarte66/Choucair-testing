package com.choucair.certification.demoserenity.tasks;

import com.choucair.certification.demoserenity.models.LoginData;
import com.choucair.certification.demoserenity.userInterfaces.HomePage;
import com.choucair.certification.demoserenity.userInterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Login implements Task {

    private List<LoginData> loginDataList;

    public Login(List<LoginData> loginDataList) {
        this.loginDataList = loginDataList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(loginDataList.get(0).getUsername()).into(MainPage.USERNAME_TXT),
                Enter.theValue(loginDataList.get(0).getPassword()).into(MainPage.PASSWORD_TXT),
                Click.on(MainPage.SIGN_IN_BTN), Click.on(HomePage.PERSON_BTN));
    }

    public static Login withCredentials(List<LoginData> loginDataList) {
        return Tasks.instrumented(Login.class, loginDataList);
    }


}
