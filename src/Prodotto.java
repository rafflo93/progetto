public class Prodotto {
    private String tipo;
    private double prezzo;

    public Prodotto(String tipo, double prezzo) {
        this.tipo = tipo;
        this.prezzo = prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getTipo() {
        return tipo;
    }
}
