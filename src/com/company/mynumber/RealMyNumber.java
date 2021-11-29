package com.company.mynumber;

public class RealMyNumber implements MyNumber {

    private String value;

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void valueOnOx() {
        System.out.println("Real part of number: ");
        System.out.println(value);
    }
}
