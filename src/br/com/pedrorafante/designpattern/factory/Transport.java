package br.com.pedrorafante.designpattern.factory;

import br.com.pedrorafante.designpattern.factory.vehicles.IVehicle;

public abstract class Transport {

    void startTransport() {
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
