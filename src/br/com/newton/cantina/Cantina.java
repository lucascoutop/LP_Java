package br.com.newton.cantina;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Cantina {
	public static void main(String[] args) { 
		
		Cliente cliente = new Cliente(JOptionPane.showInputDialog("Informe o nome do cliente:"));
        Massa massa = new Massa(JOptionPane.showInputDialog("Informe o nome da massa:"), Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da massa:")));
        ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
        
        int opcao = 0;
        while (opcao != 5) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe os ingredientes escolhidos:\n1-Bacon\n2-Mussarela\n3-Tomate\n4-Queijo\n5-Sair"));
            switch (opcao) {
                case 1:
                    ingredientes.add(new Ingrediente("Bacon"));
                    break;
                case 2:
                    ingredientes.add(new Ingrediente("Mussarela"));
                    break;
                case 3:
                    ingredientes.add(new Ingrediente("Tomate"));
                    break;
                case 4:
                    ingredientes.add(new Ingrediente("Queijo"));
                    break;
                default:
                    break;
            }
        }
        Pedido pedido = new Pedido(massa, cliente, ingredientes);
        JOptionPane.showMessageDialog(null, pedido.getDescricao());
    }
	
}
