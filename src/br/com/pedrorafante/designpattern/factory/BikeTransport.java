package br.com.pedrorafante.designpattern.factory;

import br.com.pedrorafante.designpattern.factory.vehicles.Bike;
import br.com.pedrorafante.designpattern.factory.vehicles.IVehicle;

public class BikeTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
