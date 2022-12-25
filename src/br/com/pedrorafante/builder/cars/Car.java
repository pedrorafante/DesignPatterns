package br.com.pedrorafante.builder.cars;

import br.com.pedrorafante.builder.components.CarType;
import br.com.pedrorafante.builder.components.Engine;
import br.com.pedrorafante.builder.components.Transmission;

public class Car {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;

    public Car(CarType carType,
               int seats,
               Engine engine,
               Transmission transmission) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

}
