package stepdefs;

import java.io.IOException;

import io.cucumber.java.en.And;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import ApplicationPages.Homepage;
import WebConnector.webconnector;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps extends webconnector {
    private Homepage homePage;
	private String scenDesc;

    public HomePageSteps() {
        this.homePage = new Homepage();
    }
    
    @Before
	public void before(Scenario scenario) {
		this.scenDesc = scenario.getName();
		setUpDriver();
	}
    
    @After
    public void after(Scenario scenario){
    	closeDriver(scenario);
    }
	
	@BeforeStep
	public void beforeStep() throws InterruptedException {
		Thread.sleep(2000);
	}

    @Given("^User navigates to QATechTesting HomePage$")
    public void aUserNavigatesToHomePage() throws InvalidFormatException, IOException, InterruptedException {
        this.homePage.goToHomePage();
    }

    @Then("^User verify that Blog Link is displayed$")
    public void googleLogoIsDisplayed() throws Exception {
        this.homePage.checkBlogLinkDisplay();
    }

    @Given("I open the page with the url {string}")
    public void openURL(String arg0) throws InterruptedException {
        this.homePage.openURL(arg0);
    }

    @And("I enter {string} in search box")
    public void iEnterInSearchBox(String arg0) throws Exception {
        this.homePage.enterValueInEditBox(arg0);
    }

    @And("I click on Google Search")
    public void iClickOnGoogleSearch() throws Exception {
        this.PerformActionOnElement("googleSearchButton","Click","");
    }
}
