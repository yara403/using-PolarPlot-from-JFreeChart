package com.yarasa.math;

public abstract class PolarEquation {
    protected Equation type;
    protected String description;

    protected PolarEquation(Equation type, String description){
        this.type = type;
        this.description = description;
    }

    public abstract double calculate(double theta);

    public Equation getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

}
