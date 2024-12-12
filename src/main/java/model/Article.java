/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

public class Article {
    private int numArt;
    private String libelle;

    // Constructeur
    public Article(int numArt, String libelle) {
        this.numArt = numArt;
        this.libelle = libelle;
    }

    // Getters et setters
    public int getNumArt() {
        return this.numArt;
    }

    public void setNumArt(int numArt) {
        this.numArt = numArt;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    // Méthode pour saisir un article avec gestion d'exception et réutilisation du scanner
    public String SaisirArticle(Scanner scanner) {
        System.out.println("----- Saisie d'un Article -----");
        
        // Saisie sécurisée du numéro de l'article
        while (true) {
            try {
                System.out.print("Entrez le numéro de l'article : ");
                this.numArt = scanner.nextInt();
                scanner.nextLine(); // Consommer la ligne restante après nextInt()
                break; // Sortir de la boucle si la saisie est valide
            } catch (Exception e) {
                System.out.println("Erreur : Entrez un numéro valide.");
                scanner.nextLine(); // Consommer l'entrée invalide
            }
        }

        // Saisie du libellé de l'article
        System.out.print("Entrez le libellé de l'article : ");
        this.libelle = scanner.nextLine();

        // Retourner une description formatée de l'article
        return "Article saisi : Numéro = " + this.numArt + ", Libellé = " + this.libelle;
    }

    // Méthode pour afficher les détails de l'article
    public String AfficherArticle() {
        return "Article : Numéro = " + this.numArt + ", Libellé = " + this.libelle;
    }
}

