package br.com.pedrorafante.adapter.adapters;

import br.com.pedrorafante.adapter.mercadopago.MercadoPago;
import br.com.pedrorafante.adapter.paypal.IPayPalPayments;
import br.com.pedrorafante.adapter.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {

    private Token token;
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago){
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando o MercadoPago utilizando os métodos padrões do PayPal!");
    }
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        mercadoPago.enviandoPagamentoMP();
    }

    @Override
    public void paypalReceive() {
        mercadoPago.recebendoPagamentoMP();
    }
}
