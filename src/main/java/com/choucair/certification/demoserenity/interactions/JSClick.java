package com.choucair.certification.demoserenity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;

public class JSClick implements Interaction {
  private Target target;

  public JSClick(Target target) {
    this.target = target;
  }

  @Override
  @Step("{0} clicks on #target")
  public <T extends Actor> void performAs(T actor) {
    as(actor).executeScript("arguments[0].click();", target.resolveFor(actor));
  }

  private JavascriptExecutor as(Actor actor) {
    return (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
  }

  public static JSClick on(Target target) {
    return Tasks.instrumented(JSClick.class, target);
  }
}
