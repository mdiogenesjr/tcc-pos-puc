package br.com.sigo.model;

import java.io.Serializable;

public class Record implements Serializable {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
