package br.com.sigo.routes;


import br.com.sigo.springsoap.gen.AgendarProcessoRequest;
import br.com.sigo.springsoap.gen.AgendarProcessoResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.MessageContentsList;
import org.springframework.stereotype.Component;

@Component
public class AgendarProcessoRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:agendar-processos")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        AgendarProcessoRequest request = new AgendarProcessoRequest();
                        request.setIdProcesso(exchange.getIn().getHeader("idProcesso").toString());
                        request.setIdEtapa(exchange.getIn().getHeader("idEtapa").toString());
                        exchange.getIn().setBody(request);
                    }
                })
                .setHeader(CxfConstants.OPERATION_NAMESPACE, constant("http://www.sigo.com.br/springsoap/gen"))
                .setHeader(CxfConstants.OPERATION_NAME, constant("agendarProcesso"))
                .to("cxf:bean:cxfProcesso")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        MessageContentsList response = (MessageContentsList) exchange.getIn().getBody();
                        AgendarProcessoResponse r = (AgendarProcessoResponse) response.get(0);
                        exchange.getIn().setBody("{" +
                                "\"idStatus\": "+r.getIdStatus()+"," +
                                "\"status\":\" "+r.getStatus()+" \"" +
                                "}" );
                    }
                })
                .to("mock:output");

    }


}
