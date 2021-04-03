package br.com.sigo.config;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
public class CamelRouteConfig extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        restConfiguration()
                .component("servlet")

                //Enable swagger endpoint.
                .apiContextPath("/swagger")
                .apiContextRouteId("swagger")

                //Swagger properties
                .contextPath("/processos/api")
                .apiProperty("spring.version", "1.0")
                .apiProperty("host", "")
                .apiProperty("port", "8080")
                .apiProperty("schemes", "");

        rest("/processos")
                .get("/agendar-etapa-processo/processo/{idProcesso}/etapa/{idEtapa}")
                .consumes("text/plain").produces("text/plain")
                .description("Método para agendar a etapa de um determinado processo")
                .param().name("idProcesso").type(RestParamType.path).description("Id do Processo").dataType("int").endParam()
                .param().name("idEtapa").type(RestParamType.path).description("Id da Etapa").dataType("int").endParam()
                .to("direct:processos");
    }

    @Controller
    public class SwaggerConfig {
        @RequestMapping("/swagger-ui")
        public String redirectToUi() {
            return "redirect:/webjars/swagger-ui/index.html?url=/processos/api/swagger&validatorUrl=";
        }
    }
}