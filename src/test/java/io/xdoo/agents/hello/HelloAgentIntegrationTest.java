package io.xdoo.agents.hello;

import com.embabel.agent.api.common.OperationContext;
import io.xdoo.agents.hello.model.Greeting;
import io.xdoo.agents.hello.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest()
public class HelloAgentIntegrationTest {

  @Autowired
  HelloAgent helloAgent;
  @Autowired
  OperationContext context;

  @Test
  public void shouldGenerateGreeting() {
    Person person = new Person("Claus", "Straube", "German");
    Greeting greeting = helloAgent.hello(person, context);
    assertThat(greeting).isNotNull();
    assertThat(greeting.greeting()).contains("Claus").containsIgnoringCase("hallo");
  }

}
