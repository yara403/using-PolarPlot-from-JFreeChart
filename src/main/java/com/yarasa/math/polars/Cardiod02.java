package com.yarasa.math.polars;

import com.yarasa.math.Equation;
import com.yarasa.math.PolarEquation;

public class Cardiod02 extends PolarEquation{

    public Cardiod02() {
        super(Equation.CARDIOID, "r = 2 + 4 x cos(θ)");
    }

    @Override
    public double calculate(double theta) {
        return (2 + 4*Math.cos(theta));
    }
    
}
