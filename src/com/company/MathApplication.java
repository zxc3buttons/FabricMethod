package com.company;

import com.company.factories.MathExprWithComplexNumbers;
import com.company.factories.MathExprWithRealNumbers;
import com.company.factories.MathematicalExpression;

import java.util.Scanner;

public class MathApplication {

    private MathematicalExpression mathematicalExpression;

    public void initialize() throws Exception {

        Scanner scanner = new Scanner(System.in);
        String config = scanner.nextLine();

        if(config.equals("Real"))
            mathematicalExpression = new MathExprWithRealNumbers();
        else if(config.equals("Complex")) {
            mathematicalExpression = new MathExprWithComplexNumbers();
        }
        else {
            throw new Exception("Unknowing number class");
        }
    }

    public void run() {
        mathematicalExpression.makeInputAndOutputRealPart();
    }
}
