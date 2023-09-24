package com.yarasa.math.polars;

import com.yarasa.math.Equation;
import com.yarasa.math.PolarEquation;

public class Cardiod03 extends PolarEquation{

    public Cardiod03() {
        super(Equation.CARDIOID, "r = 2 - sin(θ)");
    }

    @Override
    public double calculate(double theta) {
        return (2 - Math.sin(theta));
    }
    
}
