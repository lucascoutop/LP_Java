package br.com.newton.TarefaComplementar;
import javax.swing.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        List<Conta> listaContas = lerArquivoContas();
        Banco banco = criarBanco();
        banco.adicionarListaContas(listaContas);
        double saldoTotal = banco.calcularSaldoTotal();
        salvarSaldoGeral(banco.getNome(), saldoTotal);
    }

    private static List<Conta> lerArquivoContas() {
        List<Conta> listaContas = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("contas.txt"));
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] dadosConta = linha.split(",");
                String agencia = dadosConta[0];
                String numero = dadosConta[1];
                double saldo = Double.parseDouble(dadosConta[2]);

                Conta conta = new Conta(agencia, numero, saldo);
                listaContas.add(conta);
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaContas;
    }

    private static Banco criarBanco() {
        String nomeBanco = JOptionPane.showInputDialog("Digite o nome do banco:");
        return new Banco(nomeBanco);
    }

    private static void salvarSaldoGeral(String nomeBanco, double saldoTotal) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("saldo_geral.txt"));
            pw.println("Banco " + nomeBanco + " possui o saldo geral de contas de: " + saldoTotal);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
