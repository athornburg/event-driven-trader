package com.event.driven.account;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.kafka.dsl.Kafka;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import java.util.Map;

@Configuration
public class ApplicationConfiguration {


    private final KafkaProperties kafkaProperties;

    public ApplicationConfiguration(KafkaProperties kafkaProperties) {
        this.kafkaProperties = kafkaProperties;
    }

    @Bean
    public IntegrationFlow kafkaConsumer() {
        Map<String, Object> consumerProperties = kafkaProperties.buildConsumerProperties();
        consumerProperties.put(ConsumerConfig.GROUP_ID_CONFIG,
                consumerProperties.get(ConsumerConfig.GROUP_ID_CONFIG) + "x");

        return IntegrationFlows
                .from(Kafka.messageDrivenChannelAdapter(
                        new DefaultKafkaConsumerFactory<String, String>(consumerProperties), "account"))
                .channel("fromKafka")
                .<AcquireFundsEvent, Funds>transform(event -> new Account(event.getAccountId()).acquireFunds(event))
                .get();
    }
}
