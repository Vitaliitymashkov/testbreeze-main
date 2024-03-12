/*
 * Copyright of the Symphony Solutions B.V.
 *
 * Licensed under the TestBreeze Test Automation Framework License Agreement (the "License");
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package skeleton_tests.stepsDef;

import com.codeborne.selenide.Condition;
import com.symphonysolutions.common.services.ui.pages.GoogleStartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchStepsDef extends AbstractStepsDef {

	@Given("^I open Google Page$")
	public void openHomePage() {
		googleStartPage = open(baseUrl, GoogleStartPage.class);
		if (googleStartPage.acceptAll().isDisplayed()) {
			googleStartPage.acceptAll().click();
		}
	}

	@When("^Enter search query into text input$")
	public void performSearch() {
		googleResultsPage = googleResultsPage.search("selenide");
	}

	@Then("^Search results returned$")

	public void assertResults() {
		googleResultsPage.results().get(0).shouldHave(text("Selenide:"));
	}

	@Then("^Verify search results returned selenide website as first link:$")
	public void verifyThatFooterContainsElements(List<String> footerElementsNames) {
		googleResultsPage.navigationLabels().shouldHave(texts(footerElementsNames));
	}

	@When("^User clicks logo$")
	public void clickLogo() {
		googleResultsPage = googleResultsPage.clickLogo();
	}

	@Then("^Verify that user is on Google Start page$")
	public void verifyThatUserIsOnGoogleStartPage() {
		googleStartPage.getSearchField().shouldHave(Condition.appear);
	}

}
