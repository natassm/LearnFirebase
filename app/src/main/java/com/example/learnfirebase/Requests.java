package com.example.learnfirebase;

public class Requests {

    public String name;
    public String deskripsi;
    public String key;

    public Requests() {
    }

    public Requests(String name, String deskripsi) {
        this.name = name;
        this.deskripsi = deskripsi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "" + name + "\n" + "" + deskripsi + "\n";
    }
}
