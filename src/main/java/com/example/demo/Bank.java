package com.example.demo;

public class Bank implements IBank{

    public float computeInterest(){

        return 0.1f;
    }
    public void display(){
        System.out.println("I am here...");
    }
    public float computeInterest(RDAccount rd){

        return 1.5f+200.00f;
    }

}
