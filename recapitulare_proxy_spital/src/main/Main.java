package main;

import clase.IModulInternare;
import clase.ModulInternare;
import clase.ProxyModulInternare;

public class Main {
    public static void main(String[] args) {
        IModulInternare modulInternare = new ModulInternare();
        IModulInternare proxyModulInternare = new ProxyModulInternare(modulInternare);

        proxyModulInternare.internarePacient("Ion", false);
        proxyModulInternare.internarePacient("Mara", true);
    }
}
