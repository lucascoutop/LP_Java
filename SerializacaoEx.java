package br.com.newton.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SerializacaoEx {

    public static void main(String[] args) throws IOException {
        String nomesFilePath = "C:/Users/12115409/Documents/ArquivoNomes.txt";
        String sobrenomesFilePath = "C:/Users/12115409/Documents/SobreNomes.txt";

        // Realizar a leitura do primeiro arquivo e exibir no console
        BufferedReader nomesReader = new BufferedReader(new FileReader(nomesFilePath));
        String line;
        System.out.println("Nomes:");
        while ((line = nomesReader.readLine()) != null) {
            System.out.println(line);
        }
        nomesReader.close();

        // Realizar a leitura do segundo arquivo e exibir no console
        BufferedReader sobrenomesReader = new BufferedReader(new FileReader(sobrenomesFilePath));
        System.out.println("\nSobrenomes:");
        while ((line = sobrenomesReader.readLine()) != null) {
            System.out.println(line);
        }
        sobrenomesReader.close();

        // Concatenar a informação de leitura dos dois arquivos
        BufferedReader nomesFileReader = new BufferedReader(new FileReader(nomesFilePath));
        BufferedReader sobrenomesFileReader = new BufferedReader(new FileReader(sobrenomesFilePath));
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/12115409/Documents/NomeSobrenome.txt"));
        System.out.println("\nNomes e Sobrenomes concatenados:");
        while ((line = nomesFileReader.readLine()) != null) {
            String nome = line.trim();
            String sobrenome = sobrenomesFileReader.readLine().trim();
            String nomeSobrenome = nome + " " + sobrenome;
            writer.write(nomeSobrenome + "\n");
            System.out.println(nomeSobrenome);
        }
        nomesFileReader.close();
        sobrenomesFileReader.close();
        writer.close();

        System.out.println("\nResultado escrito no arquivo NomeSobrenome.txt.");
    }
}