package co.com.playvox.cesar.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/api_test.feature",
        glue = "co.com.playvox.cesar.stepdefinitions",
        snippets =CAMELCASE
)
public class APITest {
}
