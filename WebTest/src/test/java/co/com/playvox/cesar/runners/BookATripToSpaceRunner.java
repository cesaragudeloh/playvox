package co.com.playvox.cesar.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/book_a_trip_to_space.feature",
        glue = {"co.com.playvox.cesar.stepdefinitions","co.com.playvox.cesar.utils"},
        snippets =CAMELCASE
)

public class BookATripToSpaceRunner {
}
