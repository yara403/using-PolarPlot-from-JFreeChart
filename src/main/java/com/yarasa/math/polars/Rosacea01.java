package com.yarasa.math.polars;

import com.yarasa.math.Equation;
import com.yarasa.math.PolarEquation;

public class Rosacea01 extends PolarEquation{
    public Rosacea01(){
        super(Equation.ROSACEA, "r = 2 x Math.cos(6 x θ)");
    }

    @Override
    public double calculate(double theta) {
        return (2 * Math.cos(6*theta));
    }
}
