/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Scanner;


public class FactureAchat extends Facture {
    private final Fournisseur fournisseur;
    
    
    public FactureAchat(int numFact, DateF date, Fournisseur fournisseur, ArrayList<LigneFacture> ligneFacture) {
        super(numFact, date, ligneFacture); 
        this.fournisseur = fournisseur;
        
    }
    

    @Override
    public void SaisirFacture() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Saisir les détails du fournisseur:");
    fournisseur.SaisirDetailFour(scanner);
    
    System.out.print("Entrez le nombre de lignes de facture: ");
    int numLignes = scanner.nextInt();
    scanner.nextLine(); // Consume the remaining newline
    
    ArrayList<LigneFacture> lignesFacture = new ArrayList<>();
    
    for (int i = 0; i < numLignes; i++) {
        System.out.println("Saisir les détails pour la ligne " + (i + 1));
        
        System.out.print("Entrez le numéro de l'article: ");
        int numArticle = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        System.out.print("Entrez le libellé de l'article: ");
        String libelle = scanner.nextLine();
        
        System.out.print("Entrez le prix unitaire: ");
        double prix = scanner.nextDouble();
        
        System.out.print("Entrez la quantité: ");
        int quantite = scanner.nextInt();
        scanner.nextLine(); 

       
        LigneFacture ligne = new LigneFacture(new Article(numArticle, libelle), prix, quantite);
        lignesFacture.add(ligne);
    }
    
   
    this.setLigneFacture(lignesFacture);
}


   @Override
    public void AfficherFacture() {
    System.out.println("Facture n°: " + this.getNumFact());
    System.out.println("Date: " + this.getDate());
    System.out.println("Fournisseur: " + fournisseur.getNomFour());  
    
    // Display the details of each line in the invoice
    System.out.println("Lignes de la facture:");
    for (LigneFacture ligne : this.getLigneFacture()) {
        ligne.AfficherLigneFacture();  
    }
}


   @Override
public void TotalFacture() {
    double total = 0;
    
    for (LigneFacture ligne : this.getLigneFacture()) {
        total += ligne.getPrix() * ligne.getQte();
    }
    System.out.printf("Le total de la facture est : %.2f\n", total);
}

}
