package br.com.sigo.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaCamelRoute {

	@Bean(name = "KafkaRouteProducer")
	public RouteBuilder kafkaRouteProducer() {
		return new KafkaRouteProducer(
				"kafka:agendar-etapa-processo?brokers=localhost:9092&groupId=my_group_id&autoOffsetReset=earliest&consumersCount=1");
	}


	@Bean(name = "KafkaRouteConsumer")
	public RouteBuilder kafkaRouteConsumer() {
		return new RouteBuilder() {
			public void configure() {
				from("kafka:agendar-etapa-processo?brokers=localhost:9092&groupId=my_group_id&autoOffsetReset=earliest&consumersCount=1")
				.to("direct:processos")
						.log("${body}");
			}
		};
	}
}