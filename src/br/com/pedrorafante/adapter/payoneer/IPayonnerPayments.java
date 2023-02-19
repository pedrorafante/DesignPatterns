package br.com.pedrorafante.adapter.payoneer;

import br.com.pedrorafante.adapter.utils.Token;

public interface IPayonnerPayments {

    Token authToken();
    void sendPayment();
    void receivePayment();

}
