package com.example.securityservice.domain;

public class Security {
    private String ticker;
    private String sedol;
    private String name;

    public Security(String ticker, String sedol, String name) {
        this.ticker = ticker;
        this.sedol = sedol;
        this.name = name;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getSedol() {
        return sedol;
    }

    public void setSedol(String sedol) {
        this.sedol = sedol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
