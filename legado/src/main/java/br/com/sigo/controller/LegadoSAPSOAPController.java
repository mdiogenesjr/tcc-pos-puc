package br.com.sigo.controller;

import br.com.sigo.springsoap.gen.GetProcessoRequest;
import br.com.sigo.springsoap.gen.GetProcessoResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class LegadoSAPSOAPController {

    private static final String NAMESPACE_URI = "http://www.sigo.com.br/springsoap/gen";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getProcessoRequest")
    @ResponsePayload
    public GetProcessoResponse getProcesso(@RequestPayload GetProcessoRequest request) {
        GetProcessoResponse response = new GetProcessoResponse();
        response.setStatus("Processo "+request.getIdProcesso()+" agendado");
        return response;
    }
}
