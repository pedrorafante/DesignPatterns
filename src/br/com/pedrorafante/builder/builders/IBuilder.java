package br.com.pedrorafante.builder.builders;

import br.com.pedrorafante.builder.components.CarType;
import br.com.pedrorafante.builder.components.Engine;
import br.com.pedrorafante.builder.components.Transmission;

public interface IBuilder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
    void setColor(String color);
}
