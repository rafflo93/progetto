import java.lang.reflect.Array;
import java.util.Arrays;

public class DistributoreDiBevande {
    private int grandezzaDistributore;
    private Prodotto[] prodottiCaricati;
    private float saldo;
    private int posizioneArray = 0;

    public DistributoreDiBevande(int grandezzaDistributore) {
        this.grandezzaDistributore = grandezzaDistributore;
        this.prodottiCaricati = new Prodotto[grandezzaDistributore];
    }

    public void caricaProdotto(Prodotto p) {
        boolean pieno = true;
        if (posizioneArray < grandezzaDistributore) {
            prodottiCaricati[posizioneArray] = p;
            posizioneArray++;
            pieno = false;
        } else {
            for (int i = 0; i < prodottiCaricati.length; i++) {
                if (prodottiCaricati[i] == null) {
                    prodottiCaricati[i] = p;
                    pieno = false;
                    break;
                }
            }
        }
        if (pieno) {
            System.out.println("Distributore pieno!!!");
        } else {
            System.out.println("Prodotto caricato correttamente!");
        }
    }

    public void inserisciImporto(float i) {
        saldo += i;
    }

    public String scegliProdotto(String p) {
        String x = null;
        for (int i = 0; i < prodottiCaricati.length; i++) {
            if (prodottiCaricati[i] != null) {
                if (prodottiCaricati[i].getTipo().equals(p)) {
                    if (saldo >= prodottiCaricati[i].getPrezzo()) {
                        x = prodottiCaricati[i].getTipo();
                        System.out.println("Prodotto acquistato correttamente!");
                        saldo -= prodottiCaricati[i].getPrezzo();
                        prodottiCaricati[i] = null;

                    } else {
                        System.out.println("Saldo non sufficente!");
                    }
                    break;
                }
            }

        }
        return x;
    }


    public float saldoAttuale() {
        return saldo;
    }

    public void getResto() {
        System.out.println(" Il tuo resto è di: " + saldo);

        saldo =0;
    }

    public void stampaProdottiRestanti() {
        System.out.println(Arrays.toString(prodottiCaricati));
    }
}
