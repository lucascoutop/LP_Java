package br.com.newton.cantina;
import java.util.ArrayList;

public class Pedido {

	private Massa massa;
	private Cliente cliente;
	private ArrayList<Ingrediente> ingrediente;
	
	public Pedido(Massa massa, Cliente cliente, ArrayList<Ingrediente> ingredientes) {
        this.massa = massa;
        this.cliente = cliente;
        this.ingrediente = ingrediente;
    }
	
	public double calculaValor() {
		 double valorPedido = massa.getValor() + (ingrediente.size() * 2.0);
	     return valorPedido;
	}
	
	public String getDescricao() {
        String descricao = "Pedido feito para " + cliente.getNome() + "\n";
        descricao += massa.getTipo() + " com ";
        for (int i = 0; i < ingrediente.size(); i++) {
            descricao += ingrediente.get(i).getNome();
            if (i < ingrediente.size() - 1) {
                descricao += " e ";
            }
        }
        descricao += "\nValor: " + calculaValor();
        return descricao;
    }
}
