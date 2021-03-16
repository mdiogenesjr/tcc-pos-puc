package br.com.sigo.controller;

import br.com.sigo.config.TokenService;
import br.com.sigo.model.Processo;
import br.com.sigo.model.Record;
import br.com.sigo.model.RequestRestProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class GestaoController {

    @Autowired
    private TokenService tokenService;

    @PostMapping(value = "processo/agendar-etapa-processo")
    public ResponseEntity<String> agendarEtapaProcesso(@RequestBody Processo processo,
                                                       @RequestHeader("Authorization") String token
                                                       ) throws IOException, URISyntaxException {
        if(!tokenService.isTokenValido(token)){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\n" +
                    "   \"status\":\"Token inválido\"\n" +
                    "}");
        }
        publicarNoTopico(processo);

        return ResponseEntity.status(HttpStatus.OK).body("{\n" +
                "   \"status\":\"processo agendado\"\n" +
                "}");
    }

    @GetMapping(value = "processo")
    public ResponseEntity<String> obterProcesso(
            @RequestHeader("Authorization") String token) throws IOException, URISyntaxException {

        if(!tokenService.isTokenValido(token)){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\n" +
                    "   \"status\":\"Token inválido\"\n" +
                    "}");
        }

        return ResponseEntity.status(HttpStatus.OK).body("[" +
                "{" +
                "\"nome\": \"Contratar Assessoria\"," +
                "\"descricao\":\"Contratar assessoria para auxílio no andamento do processo.\"," +
                "\"status\":\"Completo\"," +
                "\"agendar\":\"false\"" +
                "}," +
                "{" +
                "\"nome\": \"Levantar Material Necessário\"," +
                "\"descricao\":\"Levantar lista de materiais necessários para o conclusão do processo.\"," +
                "\"status\":\"Aguardando início\"," +
                "\"agendar\":\"true\"" +
                "}" +
                "]");
    }

    private void publicarNoTopico(Processo processo) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();

        String baseUrl = "http://localhost:8082/topics/agendar-etapa-processo";
        URI uri = new URI(baseUrl);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/vnd.kafka.json.v2+json");
        headers.set("Accept", "application/vnd.kafka.v2+json, application/vnd.kafka+json, application/json");

        RequestRestProxy restProxy = new RequestRestProxy();
        List<Record> records = new ArrayList<>();
        Record record = new Record();
        record.setValue("{\"Processo\" : "+processo.getIdProcesso()+",\"Etapa\" : "+processo.getIdEtapa()+"}");
        records.add(record);
        restProxy.setRecords(records);

        HttpEntity<RequestRestProxy> request = new HttpEntity<>(restProxy, headers);

        ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
    }
}
