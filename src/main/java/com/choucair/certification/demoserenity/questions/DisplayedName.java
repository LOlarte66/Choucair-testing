package com.choucair.certification.demoserenity.questions;

import com.choucair.certification.demoserenity.userInterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class DisplayedName implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(HomePage.PERSON_LBL).viewedBy(actor).asString();
    }

    public static DisplayedName ofUser() {
        return new DisplayedName();
    }
}
