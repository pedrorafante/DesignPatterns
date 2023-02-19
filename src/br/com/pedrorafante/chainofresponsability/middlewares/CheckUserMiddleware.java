package br.com.pedrorafante.chainofresponsability.middlewares;

import br.com.pedrorafante.chainofresponsability.server.Server;

public class CheckUserMiddleware extends Middleware {
    private Server server;

    public CheckUserMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("Email inválido");
            return false;
        }

        if (!server.isValidPassword(email, password)) {
            System.out.println("Email/senha inválidos");
            return false;
        }

        return checkNext(email, password);
    }
}
