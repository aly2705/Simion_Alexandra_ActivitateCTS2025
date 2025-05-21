package main;

import clase.Autobuz;
import clase.AutobuzProxy;
import clase.IAutobuz;

public class Main {
    public static void main(String[] args) {
        IAutobuz autobuz  = new Autobuz(20);

        IAutobuz proxyAutobuz = new AutobuzProxy(autobuz);
        proxyAutobuz.opresteInStatie("Stefan cel mare", 2);
        proxyAutobuz.opresteInStatie("Piata Victoriei", 0);
    }
}
