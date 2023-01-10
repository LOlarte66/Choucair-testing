package com.choucair.certification.demoserenity.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/AddProducts.feature",
        glue = "com.choucair.certification.demoserenity.stepsDefinition",
        snippets = SnippetType.CAMELCASE, dryRun = false)

public class AddProductsRunner {
}
