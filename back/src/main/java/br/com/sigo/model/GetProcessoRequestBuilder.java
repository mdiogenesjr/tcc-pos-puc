package br.com.sigo.model;

import br.com.sigo.springsoap.gen.GetProcessoRequest;

public class GetProcessoRequestBuilder {

    public GetProcessoRequest getProcessoRequest(){
        GetProcessoRequest request = new GetProcessoRequest();
        request.setIdProcesso("1");
        request.setIdEtapa("2");

        return request;
    }
}
