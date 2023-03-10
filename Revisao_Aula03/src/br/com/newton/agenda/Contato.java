package br.com.newton.agenda;

public class Contato {
    private String nome;
    private String numero;

    //criar um metodo Excluir que nao tem retorno e que receba
    // como parâmetro a ser excluido

    public void Excluir(Contato contato){
        System.out.println("Excluindo contato" + contato.nome);
    }

    public void Incluir(Contato contato){
        System.out.println("Incluir contato " + contato.nome + contato.getNumero());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
