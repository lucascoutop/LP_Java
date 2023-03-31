package br.com.newton.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    public static void main(String[] args) {

        Cliente cl1 = new Cliente();
        cl1.nome = "Lucas";
        ContaCorrente c1 = new ContaCorrente();
        c1.deposita(100);
        c1.cliente = cl1;

        Cliente cl2 = new Cliente();
        cl2.nome = "Leopoldo";
        ContaCorrente c2 = new ContaCorrente();
        c2.deposita(200);
        c2.cliente = cl2;

        List contas = new ArrayList<>();

        contas.add(c1);
        contas.add(c2);

        for (int i = 0; i< contas.size(); i++){
            ContaCorrente cc = (ContaCorrente) contas.get(i);
            System.out.println("O valor da conta de " + cc.cliente.nome + "é: " + cc.saldo);
        }

    }
}
