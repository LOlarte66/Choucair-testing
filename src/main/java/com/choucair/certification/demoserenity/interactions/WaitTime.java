package com.choucair.certification.demoserenity.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitTime implements Interaction {

    private int miliseconds;

    public WaitTime(int miliseconds) {
        this.miliseconds = miliseconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            new InternalSystemClock().pauseFor(miliseconds);
    }

public static WaitTime during(int miliseconds){
    return Tasks.instrumented(WaitTime.class,miliseconds);
    }
}
