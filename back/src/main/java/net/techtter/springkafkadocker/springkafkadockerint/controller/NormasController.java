package net.techtter.springkafkadocker.springkafkadockerint.controller;

import net.techtter.springkafkadocker.springkafkadockerint.config.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class NormasController {

    @Autowired
    private TokenService tokenService;

    @GetMapping(value = "/normas")
    public ResponseEntity<String> obter(@RequestHeader("Authorization") String token) throws IOException {
        if(!tokenService.isTokenValido(token)){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\n" +
                    "   \"status\":\"Token inválido\"\n" +
                    "}");
        }
        return ResponseEntity.status(HttpStatus.OK).body("[" +
                "{" +
                "\"id\": \"1\"," +
                "\"nome\":\"ISO9001\"," +
                "\"dtInicio\":\"01/09/99\"," +
                "\"descricao\":\"Certificados de conformidade de Sistemas de Gestão da Qualidade, para empresas industriais e prestadoras de serviços. A certificação ISO 9001 constitui-se em fator decisivo para o sucesso de qualquer organização, dentro de um mercado competitivo.\"," +
                "\"area\":\"Qualidade\"" +
                "}," +
                "{" +
                "\"id\": 2," +
                "\"nome\":\"A2s\"," +
                "\"dtInicio\":\"01/09/99\"," +
                "\"descricao\":\"O selo A2S -Ambiente Seguro e Saudável – é uma certificação para ambientes que prezam por boas práticas, envolvendo desde o processo de gestão da limpeza e condições sanitárias, até a adequação das condições de trabalho, políticas internas, treinamentos e adequação de estrutura para a garantia de um ambiente seguro e saudável.\"," +
                "\"area\":\"Saúde\"" +
                "}," +
                "{" +
                "\"id\": 3," +
                "\"nome\":\"ISO 18001\"," +
                "\"dtInicio\":\"01/09/99\"," +
                "\"descricao\":\"Esta certificação atesta que a empresa possui um Sistema de Gestão de Saúde e Segurança Ocupacional. A avaliação da OHSAS 18001 é respaldada pelo Selo da Fundação Vanzolini.\"," +
                "\"area\":\"Saúde\"" +
                "}" +
                "]");
    }
}
