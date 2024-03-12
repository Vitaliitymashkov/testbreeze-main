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
package com.symphonysolutions.common.services.ui.pages;

import com.codeborne.selenide.ElementsCollection;
import org.springframework.stereotype.Service;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

@Service
public class GoogleResultsPage{
	public ElementsCollection results() {
		return $$("#search  h3");
	}

	public GoogleResultsPage search(String query)
		{
		$(By.name("q")).setValue(query).pressEnter();
		return page(GoogleResultsPage.class);
	}

	public GoogleResultsPage clickLogo(){
		$(".logo").click();
		return this;
	}

	public ElementsCollection navigationLabels() {
		return $$(By.xpath("/descendant::h3[1]"));
	}
}

