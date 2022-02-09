package tests.message;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class DeleteMessageSteps {

    private DeleteMessageModel model;

    @Given("^Start$")
    public void start() throws Throwable {
    	model = new DeleteMessageModel();
    }

    @When("^Enter username: \"([^\"]*)\"$")
    public void enterUsername(String username) {
        model.setUsername(username);
    }

    @When("^Enter password: \"([^\"]*)\"$")
    public void enterPassword(String password) {
        model.setPassword(password);
    }

    @When("^Enter topic name: \"([^\"]*)\"$")
    public void enterEopicName(String topicName) {
        model.setTopicName(topicName);
    }

    @When("^Enter message title: \"([^\"]*)\"$")
    public void enterMessageTitle(String messageTitle) {
        model.setAnnouncementTitle(messageTitle);
    }

    @When("^Click delete$")
    public void clickDelete() {
        model.clickDeleteButton();
    }

    @Then("^Display message: \"([^\"]*)\"$")
    public void displayMessage(String expectedMessage) {
        assertEquals(expectedMessage, model.getMessage());
    }
}
