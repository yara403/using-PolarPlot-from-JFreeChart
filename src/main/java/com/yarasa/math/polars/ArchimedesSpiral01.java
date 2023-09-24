package com.yarasa.math.polars;

import com.yarasa.math.Equation;
import com.yarasa.math.PolarEquation;

public class ArchimedesSpiral01 extends PolarEquation {

    public ArchimedesSpiral01() {
        super(Equation.ARCHIMEDES_SPIRAL , "r = 3 x θ");
    }

    @Override
    public double calculate(double theta) {
        return (3 * theta);
    }
    
}
