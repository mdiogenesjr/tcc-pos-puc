package net.techtter.springkafkadocker.springkafkadockerint.model;


import java.io.Serializable;

public class Processo implements Serializable {

    private int idProcesso;
    private int idEtapa;

    public int getIdProcesso() {
        return idProcesso;
    }

    public void setIdProcesso(int idProcesso) {
        this.idProcesso = idProcesso;
    }
}
