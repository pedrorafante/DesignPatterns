package br.com.pedrorafante.adapter.paypal;

import br.com.pedrorafante.adapter.utils.Token;

public interface IPayPalPayments {

    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
