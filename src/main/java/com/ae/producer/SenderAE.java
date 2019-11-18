package com.ae.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class SenderAE {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(SenderAE.class);

  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;

  public void send(String payload) {
    LOGGER.info("sending payload='{}'", payload);
    kafkaTemplate.send("helloworld.t", payload);
  }
}
