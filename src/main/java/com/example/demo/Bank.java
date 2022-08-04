package com.example.demo;

public class Bank implements IBank{

    public float computeInterest(IBank ib){

        return 0.1f;
    }
    public float computeInterest(RDAccount rd){

        return 1.5f+200.00f;
    }

}
