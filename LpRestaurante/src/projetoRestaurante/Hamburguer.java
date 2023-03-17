package projetoRestaurante;

public class Hamburguer {
    public String nome;
    public double valor;
    public boolean artesanal;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isArtesanal() {
        return artesanal;
    }

    public void setArtesanal(boolean artesanal) {
        this.artesanal = artesanal;
    }

    public double CalculaValor(Boolean artesanal){
        if(artesanal)
            return this.valor + 8.00;

        return valor;
    }

    public String getNome(){
        return nome;
    }
}
