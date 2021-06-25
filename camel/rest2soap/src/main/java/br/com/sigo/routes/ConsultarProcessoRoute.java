package br.com.sigo.routes;


import br.com.sigo.springsoap.gen.ConsultarProcessoRequest;
import br.com.sigo.springsoap.gen.ConsultarProcessoResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.MessageContentsList;
import org.springframework.stereotype.Component;

@Component
public class ConsultarProcessoRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:consultar-processos")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        ConsultarProcessoRequest request = new ConsultarProcessoRequest();
                        request.setIdProcesso(exchange.getIn().getHeader("idProcesso").toString());
                        exchange.getIn().setBody(request);
                    }
                })
                .setHeader(CxfConstants.OPERATION_NAMESPACE, constant("http://www.sigo.com.br/springsoap/gen"))
                .setHeader(CxfConstants.OPERATION_NAME, constant("consultarProcesso"))
                .to("cxf:bean:cxfProcesso")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        MessageContentsList response = (MessageContentsList) exchange.getIn().getBody();
                        ConsultarProcessoResponse r = (ConsultarProcessoResponse) response.get(0);
                        exchange.getIn().setBody("{" +
                                "\"idStatus\": "+r.getIdStatus()+"," +
                                "\"status\":\" "+r.getStatus()+" \"" +
                                "}" );
                    }
                })
                .to("mock:output");

    }


}
