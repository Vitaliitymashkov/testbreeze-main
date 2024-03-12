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

import com.symphonysolutions.common.services.api.RestClient;
import com.symphonysolutions.common.services.ui.pages.GoogleResultsPage;
import com.symphonysolutions.common.services.ui.pages.GoogleStartPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;

@SuppressWarnings({"ALL", "SpellCheckingInspection"})
public class AbstractStepsDef {

	@Autowired
	@Lazy
	public RestClient restService;

	@Value("${ui.baseUrl}")
	String baseUrl;

	@SuppressWarnings("SpellCheckingInspection")
	@Value("${reqres.path.baseUrl}")
	String BaseEndpoint;

	@Value("${bot.path.baseUrl}")
	String symphonyBotBaseEndpoint;

	@Autowired
	@Lazy
	public GoogleStartPage googleStartPage;

	@Autowired
	@Lazy
	public GoogleResultsPage googleResultsPage;
}
