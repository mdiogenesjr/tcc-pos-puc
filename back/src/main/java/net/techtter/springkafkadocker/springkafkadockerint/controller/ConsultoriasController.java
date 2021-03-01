package net.techtter.springkafkadocker.springkafkadockerint.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ConsultoriasController {

    @GetMapping(value = "/consultorias")
    public ResponseEntity<String> obter() throws IOException {
        return ResponseEntity.status(HttpStatus.OK).body("[" +
                "{" +
                "\"id\": 1," +
                "\"nome\":\"Tecnos TI ME\"," +
                "\"cnpj\":\"24.161.626/0001-48\"" +
                "}," +
                "{" +
                "\"id\": 1," +
                "\"nome\":\"Texturas SA\"," +
                "\"cnpj\":\"42.621.133/0001-25\"" +
                "}," +
                "{" +
                "\"id\": 1," +
                "\"nome\":\"Texti LTDA\"," +
                "\"cnpj\":\"52.114.835/0001-76\"" +
                "}" +
                "]");
    }
}
