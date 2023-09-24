package com.yarasa.math.polars;

import com.yarasa.math.Equation;
import com.yarasa.math.PolarEquation;

public class ParabolicSpiral02 extends PolarEquation {

    public ParabolicSpiral02(){
        super(Equation.PARABOLIC_SPIRAL, "r = 3 x Math.sqrt(θ)");
    }

    @Override
    public double calculate(double theta) {
        return (3 * Math.sqrt(theta));
    }
    
}
