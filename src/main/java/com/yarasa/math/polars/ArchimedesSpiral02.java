package com.yarasa.math.polars;

import com.yarasa.math.Equation;
import com.yarasa.math.PolarEquation;

public class ArchimedesSpiral02 extends PolarEquation {

    public ArchimedesSpiral02() {
        super(Equation.ARCHIMEDES_SPIRAL , "r = - θ");
    }

    @Override
    public double calculate(double theta) {
        return (-1 * theta);
    }
    
}

