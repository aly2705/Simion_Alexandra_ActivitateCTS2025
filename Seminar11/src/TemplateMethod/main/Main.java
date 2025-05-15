package TemplateMethod.main;

import TemplateMethod.classes.AMetrou;
import TemplateMethod.classes.Metrou;
import TemplateMethod.classes.MetrouSpecial;

public class Main {
    public static void main(String[] args) {
        AMetrou metrouNormal = new Metrou(1);
        AMetrou metrouSpecial = new MetrouSpecial(2);

        metrouNormal.circulaTur();
        System.out.println();
        metrouNormal.circulaRetur();
        System.out.println();

        metrouSpecial.circulaTur();
        System.out.println();
        metrouSpecial.circulaRetur();
    }
}