package com.goit.gojavaonlinethree.student.igorstolyarov.module04;

class Temperature {
    public static void main(String[] args) {
        // Celsius to Fahrenheit

        float celsius = 40f;

        System.out.println(celsius + " degrees Celsius = " + ((9.0 / 5.0) * celsius + 32) + " degrees Fahrenheit.");

        // Fahrenheit to Celsius + added variable

        double fahr = 86d;
        double cel = (5.0 / 9.0) * (fahr - 32);

        System.out.println(fahr + " degrees Fahrenheit = " + cel + " degrees Celsius.");
    }
}
