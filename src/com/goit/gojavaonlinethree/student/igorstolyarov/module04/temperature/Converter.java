package com.goit.gojavaonlinethree.student.igorstolyarov.module04.temperature;

public class Converter {

    static double intof = Runner.celToFar;
    static double tempsConvert;

    static double convertorC() {
        return (Runner.celToFar-32)/1.8;
        }
    double convertorF (double intoC) {
        return intoC*9.0/5.0+32;
        }
    }
