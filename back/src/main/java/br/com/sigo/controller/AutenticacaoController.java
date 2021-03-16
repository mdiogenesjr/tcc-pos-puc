package br.com.sigo.controller;

import br.com.sigo.config.TokenService;
import br.com.sigo.model.LoginDto;
import br.com.sigo.model.TokenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutenticacaoController {
	
	@Autowired
	private TokenService tokenService;

	@PostMapping(value = "/user/login")
	public ResponseEntity<TokenResponse> autenticar(@RequestBody LoginDto login) {
		if("marcos".equals(login.getUserName()) && "123".equals(login.getPassword())){
			String token = //"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwibmFtZSI6ImZsYXZpbyIsImVtYWlsIjoiZmxhdmlvQGFsdXJhcGljLmNvbS5iciIsImlhdCI6MTYxMzk1OTEwMSwiZXhwIjoxNjE0MDQ1NTAxfQ.hg5DMXeBLntHkjsqcP1HifufCOunjYjPehnTVJtR-oA";
			tokenService.gerarToken();
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.set("x-access-token",
					token);
			responseHeaders.set("Access-Control-Expose-Headers","x-access-token");
			return ResponseEntity.ok()
					.headers(responseHeaders)
					.body(TokenResponse.builder()
							.id(1)
							.name("marcos")
							.email("marcos@puc.com.br")
							.build());
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(TokenResponse.builder().build());

	}
	
}
