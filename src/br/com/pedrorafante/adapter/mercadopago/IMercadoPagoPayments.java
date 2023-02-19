package br.com.pedrorafante.adapter.mercadopago;

import br.com.pedrorafante.adapter.utils.Token;

public interface IMercadoPagoPayments {

    Token authToken();
    void enviandoPagamentoMP();
    void recebendoPagamentoMP();

}
