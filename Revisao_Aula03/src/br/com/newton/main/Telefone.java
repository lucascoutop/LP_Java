package br.com.newton.main;

import java.util.Scanner;
import javax.swing.JOptionPane;

import br.com.newton.agenda.Contato;

public class Telefone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Contato contato = new Contato();

        String nome;
        String numero;

        nome = JOptionPane.showInputDialog("Digite o seu nome:");
        contato.setNome(nome);

        numero = JOptionPane.showInputDialog("Informe o seu telefone:");
        contato.setNumero(numero);

        contato.Excluir(contato);
        contato.Incluir(contato);

        if(contato.getNumero().length() != 9)
            JOptionPane.showMessageDialog(null, "Numero invalido");
        else
            JOptionPane.showMessageDialog(null, "Numero cadastrado com sucesso!");



        sc.close();
    }
}