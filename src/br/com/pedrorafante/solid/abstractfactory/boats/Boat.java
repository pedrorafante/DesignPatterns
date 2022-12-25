package br.com.pedrorafante.solid.abstractfactory.boats;

public class Boat implements IBoat{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a viagem com os containers");
    }

    @Override
    public void getCargo() {
        System.out.println("Iniciando rota pelo mar vermelho");
    }
}
