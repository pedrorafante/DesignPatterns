package br.com.pedrorafante.chainofresponsability;

import br.com.pedrorafante.chainofresponsability.middlewares.CheckPermissionMiddleware;
import br.com.pedrorafante.chainofresponsability.middlewares.CheckUserMiddleware;
import br.com.pedrorafante.chainofresponsability.middlewares.Middleware;
import br.com.pedrorafante.chainofresponsability.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;
    public static void init(){
        server = new Server();
        server.registerUser("pedro.rafante@admin.com.br", "123456789");
        server.registerUser("usuario@admin.com.br", "123456789");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }
    public static void main(String[] args) throws IOException {
        init();

        boolean done;

        do{
            System.out.println("Digite o e-mail: ");
            String email = reader.readLine();
            System.out.println("Digite a sua senha: ");
            String senha = reader.readLine();
            done = server.logIn(email, senha);

        }while(!done);
    }
}
