package GestioneInventario.inventario;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Prodotto> inventario;

    public Inventario() { // Costruttore dell'inventario
        this.inventario = new ArrayList<Prodotto>();
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        this.inventario.add(prodotto);
    }

    public void rimuoviProdotto(Prodotto prodotto) {
        this.inventario.remove(prodotto);
    }

    public void guardaInventario() {
        int z = 1;
        for (Prodotto p: this.inventario){
            System.out.println(z+")\n\t Nome oggetto: " + p.Nome + "\n\t Prezzo: " + p.Prezzo + "\n\t Quantità: " + p.Quantità + "\n\t Usura: " + p.Usura + "\n");
            z++;
        }
    }

    public void guardaProdotto(String nome_prodotto){
        for (Prodotto p : this.inventario){
            if (nome_prodotto.equals(p.Nome)){
                System.out.println("\n\t Nome oggetto: " + p.Nome + "\n\t Prezzo: " + p.Prezzo + "\n\t Quantità: " + p.Quantità + "\n\t Usura: " + p.Usura + "\n");
            }
        }
    }
}
