package net.techtter.springkafkadocker.springkafkadockerint.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class Processo implements Serializable {

    private int idProcesso;
    private int idEtapa;

}
