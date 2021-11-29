package com.company.factories;

import com.company.mynumber.MyNumber;

import java.util.Scanner;

public abstract class MathematicalExpression {

    //какие-то методы для математического выражения

    public abstract MyNumber createNumber();

    public void makeInputAndOutputRealPart() {
        MyNumber myNumber = createNumber();
        Scanner scanner = new Scanner(System.in);
        myNumber.setValue(scanner.nextLine());
        myNumber.valueOnOx();
    }

}
