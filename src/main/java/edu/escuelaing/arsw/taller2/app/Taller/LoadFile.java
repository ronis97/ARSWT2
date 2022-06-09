package edu.escuelaing.arsw.taller2.app.Taller;

import java.util.LinkedList;

public class LoadFile {
    public static void main(String[] args){
        LinkedList<Double> datos = new LinkedList<Double>();
        datos.add(160.0);
        datos.add(591.0);
        datos.add(114.0);
        datos.add(229.0);
        datos.add(230.0);
        datos.add(270.0);
        datos.add(128.0);
        datos.add(1657.0);
        datos.add(624.0);
        datos.add(1503.0);
        System.out.println(GeneralMethods.getMeanOfData(datos));
        System.out.println(GeneralMethods.getStandardDeviation(datos));
    }
}
