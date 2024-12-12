/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Scanner;

public class FactureVente extends Facture {
    private final Client client;

    public FactureVente(int numFact, DateF date, Client client, ArrayList<LigneFacture> ligneFacture) {
        super(numFact, date, ligneFacture); 
        this.client = client;
    }

   @Override
    public void SaisirFacture() {
        Scanner scanner = new Scanner(System.in);
        
        // Saisir les détails du client
        System.out.println("Saisir les détails de la facture de vente :");
        client.SaisirDetailClient(scanner); 
        
        System.out.print("Entrez le nombre de lignes de facture: ");
        int numLignes = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Initialisation du tableau de lignes de facture
        ArrayList<LigneFacture> lignesFacture = new ArrayList<>();
        
        for (int i = 0; i < numLignes; i++) {
            System.out.println("Saisir les détails pour la ligne " + (i + 1));
            
            // Demander les informations pour chaque ligne de facture
            System.out.print("Entrez le numéro de l'article : ");
            int numArticle = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            System.out.print("Entrez le libellé de l'article : ");
            String libelle = scanner.nextLine();
            
            System.out.print("Entrez le prix unitaire: ");
            double prix = scanner.nextDouble();
        
            System.out.print("Entrez la quantité: ");
            int quantite = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            
            // Créer une ligne de facture et l'ajouter au tableau
            LigneFacture ligne = new LigneFacture(new Article(numArticle, libelle), prix, quantite);
            lignesFacture.add(ligne);
        }
        
        // Set the lines of the invoice in the Facture (superclass)
        this.setLigneFacture(lignesFacture);
    }


   @Override
    public void AfficherFacture() {
       System.out.println("Facture n°: " + this.getNumFact());
       System.out.println("Date: " + this.getDate());
       System.out.println("Client: " + client.getNomClient());  //
        
    // Display the details of each line in the invoice
    System.out.println("Lignes de la facture:");
    for (LigneFacture ligne : this.getLigneFacture()) {
        ligne.AfficherLigneFacture();  // Assuming 'AfficherLigFacture()' correctly displays each line's details
    }
    }

    @Override
    public void TotalFacture() {
        double total = 0;
        
        for (LigneFacture ligne : this.getLigneFacture()) {
            total += ligne.getPrix() * ligne.getQte(); 
        }
        
        System.out.printf("Total de la facture de vente: %.2f unités.\n", total);
    }
   
}

