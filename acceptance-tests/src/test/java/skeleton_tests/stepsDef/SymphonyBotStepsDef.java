package skeleton_tests.stepsDef;

import com.symphonysolutions.common.services.api.bot.models.MessageDto;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;


public class SymphonyBotStepsDef extends AbstractStepsDef {


  @When("User sends POST request to ask a question {string}")
  public void userSendsPostRequestToAskAQuestion(String message) {
    var body = MessageDto.builder()
        .message(message)
        .build();
    restService.sendPostRequest(symphonyBotBaseEndpoint + "items/", body);
  }

  @When("Response message contains {string}")
  public void responseMessageContains(String message) {
    var messageDto = restService.getResponse().get().as(MessageDto.class);
    Assertions.assertThat(messageDto.getMessage()).contains(message);
  }

}
