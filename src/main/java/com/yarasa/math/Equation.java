package com.yarasa.math;

public enum Equation {
        CARDIOID("Cardiod"),
        ROSACEA("Rosacea"),
        ARCHIMEDES_SPIRAL("Archimedes Spiral"),
        PARABOLIC_SPIRAL("Parabolic Spiral");

        private String name;

        Equation(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }
}