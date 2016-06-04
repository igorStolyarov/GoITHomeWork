package com.goit.gojavaonlinethree.student.igorstolyarov.module04.temperature;

public class Runner {
    public static void main(String[] args) {

        ConvertCToF convertCToF = new ConvertCToF();

        double cToF = convertCToF.convertorF(55);
        System.out.println(cToF);

        double fToC = convertCToF.convertorC(239);
        System.out.println(fToC);
    }
}
