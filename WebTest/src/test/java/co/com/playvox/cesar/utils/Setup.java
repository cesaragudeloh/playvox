package co.com.playvox.cesar.utils;

import co.com.playvox.cesar.models.LoginModel;
import co.com.playvox.cesar.models.ReservationModel;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class Setup {

    @Managed(driver = "chrome")
    private WebDriver driver;
    public static final Actor USER = Actor.named("Cliente");

    @Before
    public void setUp(){
        USER.can(BrowseTheWeb.with(driver));
    }


    @DataTableType
    public LoginModel loginEntry(Map<String, String> entry) {
        return new LoginModel(
                entry.get("username"),
                entry.get("password")
        );
    }


    @DataTableType
    public ReservationModel ReservationEntry(Map<String, String> entry) {
        return new ReservationModel(
                entry.get("name"),
                entry.get("emailAddress"),
                entry.get("socialSecurityNumber"),
                entry.get("phoneNumber")
        );
    }

}
