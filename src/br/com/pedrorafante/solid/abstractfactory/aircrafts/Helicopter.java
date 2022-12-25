package br.com.pedrorafante.solid.abstractfactory.aircrafts;

public class Helicopter implements IAircraft {
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros ok, Ligando helices");
    }

    @Override
    public void wind() {
        System.out.println("Vendos 25km, sudestes Ok!");
    }
}
