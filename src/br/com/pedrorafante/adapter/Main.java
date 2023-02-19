package br.com.pedrorafante.adapter;

import br.com.pedrorafante.adapter.adapters.MercadoPagoAdapter;
import br.com.pedrorafante.adapter.adapters.PayonnerAdapter;
import br.com.pedrorafante.adapter.mercadopago.MercadoPago;
import br.com.pedrorafante.adapter.payoneer.Payonner;
import br.com.pedrorafante.adapter.paypal.IPayPalPayments;
import br.com.pedrorafante.adapter.paypal.PayPal;

public class Main {

    public static void main(String[] args) {
        IPayPalPayments payments = new PayonnerAdapter(new Payonner());

        payments.paypalPayment();
        payments.paypalReceive();


        payments = new MercadoPagoAdapter(new MercadoPago());

        payments.paypalPayment();
        payments.paypalReceive();
    }
}
