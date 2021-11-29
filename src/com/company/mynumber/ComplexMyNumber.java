package com.company.mynumber;

public class ComplexMyNumber implements MyNumber {

    private String value;

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void valueOnOx() {
        System.out.println("Real part of number: ");
        for(int i = 0; i < value.length(); i++) {
            if(value.charAt(i) == ' ') break;
            System.out.print(value.charAt(i));
        }
    }
}
