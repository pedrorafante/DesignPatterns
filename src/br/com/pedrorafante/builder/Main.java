package br.com.pedrorafante.builder;

import br.com.pedrorafante.builder.builders.CarBuilder;
import br.com.pedrorafante.builder.builders.SportCarBuilder;
import br.com.pedrorafante.builder.builders.TruckBuilder;
import br.com.pedrorafante.builder.cars.Car;
import br.com.pedrorafante.builder.cars.SportCar;
import br.com.pedrorafante.builder.cars.Truck;
import br.com.pedrorafante.builder.director.Director;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        //criando o carro
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getresult();
        System.out.println(car.getCarType() + " produzido com sucesso!");

        //criando o caminhão
        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getresult();
        System.out.println("Caminhão: " +truck.result());

        //criando o carro  sport
        SportCarBuilder sportCarBuilder = new SportCarBuilder();
        director.constructSportCar(sportCarBuilder);

        SportCar sportCar = sportCarBuilder.getresult();
        System.out.println("Carro Sport: \nPorche: " +sportCar.result());

    }
}
