package br.com.sigo.model;

import br.com.sigo.springsoap.gen.GetProcessoRequest;

public class GetProcessoRequestBuilder {

    public GetProcessoRequest getProcessoRequest(String idProcesso, String idEtapa){
        GetProcessoRequest request = new GetProcessoRequest();
        request.setIdProcesso(idProcesso);
        request.setIdEtapa(idEtapa);

        return request;
    }
}
