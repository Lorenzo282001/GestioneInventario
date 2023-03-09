package GestioneInventario.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import GestioneInventario.inventario.*;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        
        Inventario inventario = new Inventario();
        
        /* LOAD INITIAL PRODUCTS FROM AN EXTERNAL FILE */
        try{
            File file = new File("C:\\Users\\loren\\Desktop\\JAVA\\GestioneInventario\\risorse\\load_inventory.txt");
            
            Scanner search_scanner = new Scanner(file);

            while (search_scanner.hasNextLine()) {
                String line = search_scanner.nextLine();
                String[] data = line.split(",");
                String nome = data[0];
                int quantita = Integer.parseInt(data[1]);
                float prezzo = Float.parseFloat(data[2]);
                float usura = Float.parseFloat(data[3]);
            
                // Creare oggetto Prodotto e aggiungerlo all'inventario
                Prodotto prodotto = new Prodotto(nome, quantita, prezzo, usura);
                inventario.aggiungiProdotto(prodotto);
            }
            
            search_scanner.close();
        }catch (Exception e){
            System.out.println("Errore: " + e);
        }

        //inventario.guardaInventario();
        inventario.guardaProdotto("banana");

    }
}
