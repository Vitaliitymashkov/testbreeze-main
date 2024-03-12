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

import io.cucumber.java.en.And;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonStepsDef extends AbstractStepsDef {
    @And("The status code is {int}")
    public void theStatusCodeIs(int statusCode) {
        assertThat(restService.getResponse().get().statusCode()).isEqualTo(statusCode);
    }
}
