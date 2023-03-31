package br.com.newton.banco;

public class ContaCorrente {

    int saldo;

    Cliente cliente;

    public void deposita(int valorDeposito){
        this.saldo = this.saldo + valorDeposito;
    }

    public int getSaldo() {
        return saldo;
    }
}
