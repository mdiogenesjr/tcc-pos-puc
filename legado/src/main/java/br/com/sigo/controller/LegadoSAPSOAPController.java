package br.com.sigo.controller;


import br.com.sigo.springsoap.gen.AgendarProcessoRequest;
import br.com.sigo.springsoap.gen.AgendarProcessoResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class LegadoSAPSOAPController {

    private static final String NAMESPACE_URI = "http://www.sigo.com.br/springsoap/gen";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "agendarProcessoRequest")
    @ResponsePayload
    public AgendarProcessoResponse agendarProcesso(@RequestPayload AgendarProcessoRequest request) {
        AgendarProcessoResponse response = new AgendarProcessoResponse();
        response.setStatus("Processo " + request.getIdProcesso() + " agendado");
        return response;
    }
}