package br.com.pedrorafante.solid.abstractfactory;

import br.com.pedrorafante.solid.abstractfactory.app.Application;
import br.com.pedrorafante.solid.abstractfactory.factories.BoatTransport;
import br.com.pedrorafante.solid.abstractfactory.factories.ITransportFactory;
import br.com.pedrorafante.solid.abstractfactory.factories.NineNineTransport;
import br.com.pedrorafante.solid.abstractfactory.factories.UberTransport;

public class Main {


    public static Application configureApplication() {
        Application app;
        ITransportFactory factory;

        String company = "99";

        if (company == "uber") {
            factory = new UberTransport();
        } else if (company == "99") {
            factory = new NineNineTransport();
        } else {
            factory = new BoatTransport();
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] arg) {
        Application app = configureApplication();
        app.startRoute();
    }
}
