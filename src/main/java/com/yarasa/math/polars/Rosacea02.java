package com.yarasa.math.polars;

import com.yarasa.math.Equation;
import com.yarasa.math.PolarEquation;

public class Rosacea02 extends PolarEquation{
    public Rosacea02(){
        super(Equation.ROSACEA, "r = 3 x Math.sin(5 x θ)");
    }

    @Override
    public double calculate(double theta) {
        return (3 * Math.cos(5*theta));
    }
}
