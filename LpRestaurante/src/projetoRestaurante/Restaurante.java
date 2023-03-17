package projetoRestaurante;

import javax.swing.*;

public class Restaurante {
    public static void main(String[] args) {
        Pizza p1 = new Pizza();
        Hamburguer h1 = new Hamburguer();

        String opcao = JOptionPane.showInputDialog("Informe o pedido:" + "\n1.Pizza" +
                "\n2.Hamburguer" + "\n3.Sair");
        int op = Integer.parseInt(opcao);
        if(op == 1){
            String nome = JOptionPane.showInputDialog("Informe o nome da pizza desejada:");
            p1.setNome(nome);

            String valor = JOptionPane.showInputDialog("Informe o valor da pizza:");
            double valorP = Double.parseDouble(valor);
            p1.setValor(valorP);

            String possuiBorda = JOptionPane.showInputDialog("A pizza possui borda?"+"\n1.Sim"+"\n2.Nao");
            boolean yes;

            int borda = Integer.parseInt(possuiBorda);
            if(borda == 1)
                yes = true;
            else
                yes = false;

            JOptionPane.showMessageDialog(null, "O valor do pedido vai ser de: \n"
                                           + p1.getNome() +" "+ p1.CalculaValor(yes));
        } else if (op == 2) {
            String nome = JOptionPane.showInputDialog("Informe o nome do hamburguer desejado:");
            h1.setNome(nome);

            h1.setValor(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da hamburguer:")));

            boolean yes;

            int borda = Integer.parseInt(JOptionPane.showInputDialog("O hamburguer é atesanal?"+"\n1.Sim"+"\n2.Nao"));
            if(borda == 1)
                yes = true;
            else
                yes = false;

            JOptionPane.showMessageDialog(null, "O valor do pedido vai ser de: \n"
                    + h1.getNome() +" "+ h1.CalculaValor(yes));
        }
    }
}
