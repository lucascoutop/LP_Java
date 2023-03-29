package br.com.newton.aluguel;

import java.awt.Container;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.text.MaskFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AluguelVeiculo {

	private static final long SerialVersionUID = 1L;
	public static void main(String[]args) {
		PainelAluguelVeiculos field = new PainelAluguelVeiculos();
				
		field.tarefaPainelAluguelVeiculos();
		
	}
	
	private void tarefaPainelAluguelVeiculos() {
		
		JPanel painel = new JPanel();
		JButton botao = new JButton("SALVAR");
		Container janela = getContentPane();
		setLayout(null);
		
		JLabel labelTitulo = new JLabel("ALUGUEL DE VEICULOS");
		labelTitulo.setBounds(100,20,150,10);
		JLabel labelDadosCliente = new JLabel("Dados do cliente:");
		labelDadosCliente.setBounds(50,40,100,20);
		JLabel labelNome = new JLabel("Nome: ");
		labelNome.setBounds(50,60,100,20);
		JLabel labelCPF = new JLabel("CPF: ");
		labelCPF.setBounds(50,80,100,20);
		JLabel labelTel = new JLabel("Tel: ");
		labelTel.setBounds(50,100,100,20);
		
		JLabel labelDadosVeiculo = new JLabel("Dados do veiculo:");
		labelDadosVeiculo.setBounds(50,140,120,20);
		JLabel labelNomeVeiculo = new JLabel("Nome do Carro:");
		labelNomeVeiculo.setBounds(50,160,100,20);
		JLabel labelPlaca = new JLabel("Placa:");
		labelPlaca.setBounds(50,180,100,20);
		JLabel labelAno = new JLabel("Ano de Fabricação:");
		labelAno.setBounds(50,200,120,20);
		
		JLabel labelLocacao = new JLabel("LOCAÇÃO");
		labelLocacao.setBounds(50,240,100,20);
		JLabel labelDtaLocacao = new JLabel("Data de Locação:");
		labelDtaLocacao.setBounds(50,260,100,20);
		JLabel labelDtaEntrega = new JLabel("Data de Entrega:");
		labelDtaEntrega.setBounds(50,280,100,20);
		
		
		
		//Definindo as mascaras 
		MaskFormatter mascaraNome = null;
		MaskFormatter mascaraCPF = null;
		MaskFormatter mascaraTel = null;
		MaskFormatter mascaraNomeVeiculo = null;
		MaskFormatter mascaraPlaca = null;
		MaskFormatter mascaraAno = null;
		MaskFormatter mascaraDtaLocacao = null;
		MaskFormatter mascaraDtaEntrega = null;
		
		//Formatando os campos com Mascaras
		try {
			mascaraCPF = new MaskFormatter("###.###.###-##");
			mascaraTel = new MaskFormatter("(##)#####-####");
			mascaraNomeVeiculo = new MaskFormatter("?????????????????????");
			mascaraPlaca = new MaskFormatter("UUU-####");
			mascaraAno = new MaskFormatter("####/####");
			mascaraDtaLocacao = new MaskFormatter("##/##/####");
			mascaraDtaEntrega = new MaskFormatter("##/##/####");
		}catch(ParseException excp) {
			System.err.println("Erro na formatação: "+ excp.getMessage());
			System.exit(-1);
		}
		
		//Setando as mascaras nos objetos JFormattedTextField
		JTextField nome = new JTextField();
		nome.setBounds(90,60,100,20);
		JFormattedTextField jFormattedTextCPF = new JFormattedTextField(mascaraCPF);
		jFormattedTextCPF.setBounds(90,80,100,20);
		JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraTel);
		jFormattedTextTel.setBounds(90,100,100,20);
		JTextField nomeVeiculo = new JTextField();
		nomeVeiculo.setBounds(150,160,100,20);
		JFormattedTextField jFormattedTextPlaca = new JFormattedTextField(mascaraPlaca);
		jFormattedTextPlaca.setBounds(90,180,100,20);
		JFormattedTextField jFormattedTextAno = new JFormattedTextField(mascaraAno);
		jFormattedTextAno.setBounds(165,200,140,20);
		JFormattedTextField jFormattedTextDtaLocacao = new JFormattedTextField(mascaraDtaLocacao);
		jFormattedTextDtaLocacao.setBounds(150,260,100,20);
		JFormattedTextField jFormattedTextDtaEntrega = new JFormattedTextField(mascaraDtaEntrega);
		jFormattedTextDtaEntrega.setBounds(150,280,100,20);		
		
		
		
		//Adicionando os labels dos dados do cliente
		janela.add(labelTitulo);
		janela.add(labelDadosCliente);
		janela.add(labelNome);
		janela.add(labelCPF);
		janela.add(labelTel);
		//Adicionando os labels dos dados do veiculo
		janela.add(labelDadosVeiculo);
		janela.add(labelNomeVeiculo);
		janela.add(labelPlaca);
		janela.add(labelAno);
		//Adicionando os labels das datas de Entrega e Locação
		janela.add(labelLocacao);
		janela.add(labelDtaLocacao);
		janela.add(labelDtaEntrega);
		//Adicionando as mascaras na janela
		janela.add(nome);
		janela.add(jFormattedTextCPF);
		janela.add(jFormattedTextTel);
		janela.add(nomeVeiculo);
		janela.add(jFormattedTextPlaca);
		janela.add(jFormattedTextAno);
		janela.add(jFormattedTextDtaLocacao);
		janela.add(jFormattedTextDtaEntrega);

		botao.setBounds(140,320,100,20);
		
		janela.add(botao);
		
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
}
