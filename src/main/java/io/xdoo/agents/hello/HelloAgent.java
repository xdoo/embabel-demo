package io.xdoo.agents.hello;

import com.embabel.agent.api.annotation.AchievesGoal;
import com.embabel.agent.api.annotation.Action;
import com.embabel.agent.api.annotation.Agent;
import com.embabel.agent.api.common.OperationContext;
import com.embabel.agent.prompt.persona.Persona;
import com.embabel.common.ai.model.LlmOptions;
import io.xdoo.agents.hello.model.Greeting;
import io.xdoo.agents.hello.model.Person;

abstract class Personas {
  static final Persona GREETER = new Persona(
    "Greeting Agent",
    "Friendly Greeter for customers",
    "Warm and cheerful",
    "Provide personalized greetings"
  );
}

@Agent(description = "A simple agent that generates a greeting")
public class HelloAgent {

  @AchievesGoal(description = "The person has been greeted personally")
  @Action(description = "Creates a short greeting based on the person's data")
  Greeting hello(Person person, OperationContext context) {
    return context.ai()
      .withLlm(LlmOptions.withModel("smollm2:360m").withTemperature(.0))
      .withPromptContributor(Personas.GREETER)
      .createObject(String.format("Greet the user by first name in his or her preferred language. " +
        "" +
        "#first name" +
        "%s" +
        "#language" +
        "%s", person.firstName(), person.language()).trim(), Greeting.class);
  }
}
