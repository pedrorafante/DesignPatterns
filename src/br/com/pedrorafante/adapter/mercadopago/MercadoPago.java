package br.com.pedrorafante.adapter.mercadopago;

import br.com.pedrorafante.adapter.utils.Token;

public class MercadoPago implements IMercadoPagoPayments {
    @Override
    public Token authToken() {
        return  new Token();
    }

    @Override
    public void enviandoPagamentoMP() {
        System.out.println("Enviando pagamentos via Mercado Pago.");
    }

    @Override
    public void recebendoPagamentoMP() {
        System.out.println("Recebendo pagamentos via Mercado Pago.");
    }
}
