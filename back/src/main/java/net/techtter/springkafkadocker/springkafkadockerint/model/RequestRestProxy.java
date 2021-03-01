package net.techtter.springkafkadocker.springkafkadockerint.model;

import java.io.Serializable;
import java.util.List;

public class RequestRestProxy implements Serializable {

    private List<Record> records;

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }
}
