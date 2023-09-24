package com.yarasa.math.polars;

import com.yarasa.math.Equation;
import com.yarasa.math.PolarEquation;

public class ParabolicSpiral01 extends PolarEquation {

    public ParabolicSpiral01(){
        super(Equation.PARABOLIC_SPIRAL, "r = - 2 x Math.sqrt(θ)");
    }

    @Override
    public double calculate(double theta) {
        return (-2 * Math.sqrt(theta));
    }
    
}
