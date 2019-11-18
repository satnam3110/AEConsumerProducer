# AEConsumerProducer
AE Consumer Producer Example

This is a sample spring kafka producer consumer example.
1. Download the mvn project and to test "mvn test" and it will display the follwing output.
SpringKafkaAEApplicationTest has embeded kafka broker. 

This is just an example how producer/consumer works within kafka broker.

14:00:30.054 [main] INFO  com.ae.SpringKafkaAEApplicationTest - Started SpringKafkaAEApplicationTest in 5.198 seconds (JVM running for 7.143)
14:00:30.393 [main] INFO  com.ae.producer.SenderAE - sending payload='Hello Spring Kafka American_Eagle.'
14:00:30.532 [org.springframework.kafka.KafkaListenerEndpointContainer#0-0-C-1] INFO  com.ae.consumer.ReceiverAE - received payload='Hello Spring Kafka American_Eagle.'


As you can see in the above output how sender class com.ae.producer.SenderAE sent payload 'Hello Spring Kafka American_Eagle.' is received by the consumer class com.ae.consumer.ReceiverAE using embeded kafka broker.
Let me know if need any further help.
