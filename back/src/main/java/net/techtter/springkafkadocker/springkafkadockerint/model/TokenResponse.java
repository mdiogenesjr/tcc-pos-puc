package net.techtter.springkafkadocker.springkafkadockerint.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TokenResponse {

    private Integer id;
    private String name;
    private String email;
}
