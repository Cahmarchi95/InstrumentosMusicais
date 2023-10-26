package br.com.ibm.instrumentos;

public class Bateria extends InstrumentoMusical{

    public Bateria(String tipo, double preco) {
        super(tipo, preco);
    }

    @Override
    public String tocar() {
        return "x--o---x--o";
    }
}
