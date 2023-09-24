package com.yarasa.math.polars;

import com.yarasa.math.Equation;
import com.yarasa.math.PolarEquation;

public class Cardiod01 extends PolarEquation{

    public Cardiod01() {
        super(Equation.CARDIOID, "r = 1 - 3 x sin(θ)");
    }

    @Override
    public double calculate(double theta) {
        return (1 - 3*Math.sin(theta));
    }
    
}
