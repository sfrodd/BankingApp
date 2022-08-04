package com.example.demo;

public class SBAccount {
    private String actType;
    private float balance;

    public SBAccount(String actType, float bal) {
        this.actType = actType;
        balance=bal;
    }

    public float getBalance() {
        return balance;
    }
}
