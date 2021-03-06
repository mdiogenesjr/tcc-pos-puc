package br.com.sigo.controller;

import br.com.sigo.config.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ConsultoriasController {

    @Autowired
    private TokenService tokenService;

    @GetMapping(value = "/consultorias")
    public ResponseEntity<String> obter(@RequestHeader("Authorization") String token) throws IOException {
        if(!tokenService.isTokenValido(token)){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\n" +
                    "   \"status\":\"Token inválido\"\n" +
                    "}");
        }
        return ResponseEntity.status(HttpStatus.OK).body("[" +
                "{" +
                "\"id\": 1," +
                "\"nome\":\"Tecnos TI ME\"," +
                "\"cnpj\":\"24.161.626/0001-48\"," +
                "\"setor\":\"TI\"," +
                "\"status\":\"ativa\"" +
                "}," +
                "{" +
                "\"id\": 2," +
                "\"nome\":\"Texturas SA\"," +
                "\"cnpj\":\"42.621.133/0001-25\"," +
                "\"setor\":\"Têxtil\"," +
                "\"status\":\"inativa\"" +
                "}," +
                "{" +
                "\"id\": 3," +
                "\"nome\":\"Texti LTDA\"," +
                "\"cnpj\":\"52.114.835/0001-76\"," +
                "\"setor\":\"Têxtil\"," +
                "\"status\":\"ativa\"" +
                "}" +
                "]");
    }
}
