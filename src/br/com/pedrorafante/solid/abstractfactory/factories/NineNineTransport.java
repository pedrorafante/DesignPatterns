package br.com.pedrorafante.solid.abstractfactory.factories;

import br.com.pedrorafante.solid.abstractfactory.aircrafts.Helicopter;
import br.com.pedrorafante.solid.abstractfactory.aircrafts.IAircraft;
import br.com.pedrorafante.solid.abstractfactory.boats.Boat;
import br.com.pedrorafante.solid.abstractfactory.boats.IBoat;
import br.com.pedrorafante.solid.abstractfactory.landvehicles.ILandVehicle;
import br.com.pedrorafante.solid.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
