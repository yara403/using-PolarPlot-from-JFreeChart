package com.yarasa.math.polars;

import com.yarasa.math.Equation;
import com.yarasa.math.PolarEquation;

public class Rosacea03 extends PolarEquation {

    public Rosacea03() {
        super(Equation.ROSACEA , "r = - 1 x Math.cos(8 x θ)");
    }

    @Override
    public double calculate(double theta) {
        return (-1 * Math.cos(8*theta));
    }
    
}
