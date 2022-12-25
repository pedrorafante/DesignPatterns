package br.com.pedrorafante.solid.abstractfactory.factories;

import br.com.pedrorafante.solid.abstractfactory.aircrafts.Airplane;
import br.com.pedrorafante.solid.abstractfactory.aircrafts.IAircraft;
import br.com.pedrorafante.solid.abstractfactory.boats.Boat;
import br.com.pedrorafante.solid.abstractfactory.boats.IBoat;
import br.com.pedrorafante.solid.abstractfactory.landvehicles.Car;
import br.com.pedrorafante.solid.abstractfactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
