package com.company.factories;

import com.company.mynumber.MyNumber;
import com.company.mynumber.RealMyNumber;

public class MathExprWithRealNumbers extends MathematicalExpression{

    @Override
    public MyNumber createNumber() {
        return new RealMyNumber();
    }
}
