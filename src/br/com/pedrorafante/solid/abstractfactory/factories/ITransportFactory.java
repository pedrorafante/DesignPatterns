package br.com.pedrorafante.solid.abstractfactory.factories;

import br.com.pedrorafante.solid.abstractfactory.aircrafts.IAircraft;
import br.com.pedrorafante.solid.abstractfactory.boats.IBoat;
import br.com.pedrorafante.solid.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();

    IBoat createTransportBoat();
}
