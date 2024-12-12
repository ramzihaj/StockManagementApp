/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

public class LigneFacture {
    private Article article;
    private double prix;
    private int qte;

    // Constructeur
    public LigneFacture(Article article, double prix, int qte) {
        this.article = article;
        this.prix = prix;
        this.qte = qte;
    }

    // Getters et Setters
    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    // Méthode pour saisir une ligne de facture
    public void SaisirLigneFacture() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le prix de l'article : ");
        this.prix = scanner.nextDouble();
        System.out.print("Entrez la quantité : ");
        this.qte = scanner.nextInt();
        // Vous pouvez ajouter ici une logique pour saisir l'article, en fonction de la classe Article
    }

    // Méthode pour afficher une ligne de facture
    public void AfficherLigneFacture() {
        System.out.println("Article: " + article.getNumArt() + "| Libelle: " + article.getLibelle() +  " | Prix: " + this.prix + " | Quantité: " + this.qte);
    }

   
    
}
