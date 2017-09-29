import com.idexx.modules.ThisIsTheApp;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class MyStepdefs {
    private ThisIsTheApp app;
    private String theString;

    @Given("^I have The App$")
    public void iHaveTheApp() throws Throwable {
        app = new ThisIsTheApp();
    }

    @When("^I ask about the frequency$")
    public void iAskAboutTheFrequency() throws Throwable {
        theString = app.whatsTheFrequencyKenneth();
    }

    @Then("^Dan give me an answer$")
    public void danGiveMeAnAnswer() throws Throwable {
        assertTrue(theString.length() > 0);
    }
}
