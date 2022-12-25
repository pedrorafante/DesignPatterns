package br.com.pedrorafante.designpattern.factory;

import br.com.pedrorafante.designpattern.factory.vehicles.IVehicle;
import br.com.pedrorafante.designpattern.factory.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
