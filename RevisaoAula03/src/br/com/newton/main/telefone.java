package br.com.newton.main;

import java.util.Scanner;

import br.com.newton.agenda.Contato;

public class telefone {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Contato novoContato = new Contato();
		
		String nome;
		String telefone;
		
		System.out.println("Informe o seu nome:");
		nome = sc.next();
		System.out.println("Informe o seu telefone:");
		telefone = sc.next();
		
		if(telefone.length()<9)
			System.out.println("Telefone invalido.");
		else 
			System.out.println("Telefone cadastrado");
		
		sc.close();
	} 
}
