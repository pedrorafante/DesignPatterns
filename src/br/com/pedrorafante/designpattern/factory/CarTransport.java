package br.com.pedrorafante.designpattern.factory;

import br.com.pedrorafante.designpattern.factory.vehicles.Car;
import br.com.pedrorafante.designpattern.factory.vehicles.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
