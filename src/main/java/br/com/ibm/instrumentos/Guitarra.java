package br.com.ibm.instrumentos;

public class Guitarra extends InstrumentoMusical{
    private String modelo;

    public Guitarra(String tipo, double preco,String modelo) {
        super(tipo, preco);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String tocar() {
        return "Dó, Ré, Mi, Fá, Sol, Lá, Si";
    }
}


