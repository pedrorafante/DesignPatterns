package br.com.pedrorafante.adapter.adapters;

import br.com.pedrorafante.adapter.payoneer.Payonner;
import br.com.pedrorafante.adapter.paypal.IPayPalPayments;
import br.com.pedrorafante.adapter.utils.Token;

public class PayonnerAdapter implements IPayPalPayments {

    private Token token;
    private Payonner payonner;

    public PayonnerAdapter(Payonner payonner){
        this.payonner = payonner;
        System.out.println("Adaptando o Payoneer utilizando os métodos padrões do PayPal!");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payonner.sendPayment();

    }

    @Override
    public void paypalReceive() {
        this.payonner.receivePayment();
    }
}
