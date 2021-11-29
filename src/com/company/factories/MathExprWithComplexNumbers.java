package com.company.factories;

import com.company.mynumber.ComplexMyNumber;
import com.company.mynumber.MyNumber;

public class MathExprWithComplexNumbers extends MathematicalExpression {

    @Override
    public MyNumber createNumber() {
        return new ComplexMyNumber();
    }
}
