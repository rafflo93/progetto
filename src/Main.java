public class Main {
    public static void main(String[] args) {

        Caffe caffe = new Caffe("caffe", 0.5f);
        Cappuccino cappuccino = new Cappuccino("cappuccino", 1.0f);
        DistributoreDiBevande distributoreDiBevande = new DistributoreDiBevande(10);

        for (int i = 0; i <= 5; i++) {
            distributoreDiBevande.caricaProdotto(caffe);
        }

        for (int i = 0; i < 5; i++) {
            distributoreDiBevande.caricaProdotto(cappuccino);
        }
        distributoreDiBevande.inserisciImporto(0.4f);
        distributoreDiBevande.scegliProdotto("caffe");
        distributoreDiBevande.inserisciImporto(0.4f);
        distributoreDiBevande.scegliProdotto("caffe");
        distributoreDiBevande.inserisciImporto(1.0f);
        distributoreDiBevande.scegliProdotto("cappuccino");
        System.out.println();
        distributoreDiBevande.stampaProdottiRestanti();
        distributoreDiBevande.caricaProdotto(cappuccino);
        distributoreDiBevande.stampaProdottiRestanti();
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.stampaProdottiRestanti();
        distributoreDiBevande.caricaProdotto(cappuccino);
        System.out.println();
       distributoreDiBevande.getResto();












       /* Caffe caffe = new Caffe("caffe", 0.5);
        Cappuccino cappuccino = new Cappuccino("cappuccino", 1);
        DistributoreDiBevande distributoreDiBevande = new DistributoreDiBevande(10);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(cappuccino);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(cappuccino);
        distributoreDiBevande.caricaProdotto(caffe);
        System.out.println(distributoreDiBevande.saldoAttuale() == 0);
        System.out.println(distributoreDiBevande.getResto() == 0);
        distributoreDiBevande.inserisciImporto(0.4f);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") == null);
        distributoreDiBevande.inserisciImporto(0.2f);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") != null);
        System.out.println(distributoreDiBevande.getResto()-0.10 < 1E-6);
        System.out.println(distributoreDiBevande.saldoAttuale() == 0);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") == null);
        distributoreDiBevande.inserisciImporto(2.0f);
        System.out.println(distributoreDiBevande.saldoAttuale());
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") != null);
        System.out.println(distributoreDiBevande.saldoAttuale());
        System.out.println(distributoreDiBevande.scegliProdotto("cappuccino") != null);
        System.out.println(distributoreDiBevande.saldoAttuale());
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") != null);
        System.out.println(distributoreDiBevande.saldoAttuale());
        System.out.println(distributoreDiBevande.saldoAttuale() == 0);
        System.out.println(distributoreDiBevande.getResto()-0.10 < 1E-6);*/
    }
}
