package br.com.sigo.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaCamelRoute {

	@Value("${env.host}")
	private String host;


	@Bean(name = "KafkaRouteConsumer")
	public RouteBuilder kafkaRouteConsumer() {
		return new RouteBuilder() {
			public void configure() {
				from("kafka:agendar-etapa-processo?brokers=localhost:9092")
				.to("direct:processos")
						.log("${body}");
			}
		};
	}
}