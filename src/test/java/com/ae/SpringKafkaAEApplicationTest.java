package com.ae;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import com.ae.consumer.ReceiverAE;
import com.ae.producer.SenderAE;

@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext
@EmbeddedKafka(partitions = 1,
    topics = {SpringKafkaAEApplicationTest.American_Eagle})
public class SpringKafkaAEApplicationTest {

  static final String American_Eagle = "American_Eagle.t";

  @Autowired
  private ReceiverAE receiver;

  @Autowired
  private SenderAE sender;
  
  @Test
  public void testReceive() throws Exception {
	  
    sender.send("Hello Spring Kafka American_Eagle.");

    receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
    assertThat(receiver.getLatch().getCount()).isEqualTo(0);
  }
}
