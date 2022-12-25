package br.com.pedrorafante.solid.abstractfactory.aircrafts;

public class Airplane implements IAircraft {
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros abordo, voo autorizado");

    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25Km, ventos OK");

    }
}
