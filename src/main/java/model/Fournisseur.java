/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;


public class Fournisseur {
    private String nomFour;
    private String adresseFour;
    private String contactFour;

    // Constructeur
    public Fournisseur(String nomFour, String adresseFour, String contactFour) {
        this.nomFour = nomFour;
        this.adresseFour = adresseFour;
        this.contactFour = contactFour;
    }

    // Getters et Setters
    public String getNomFour() {
        return nomFour;
    }

    public void setNomFour(String nomFour) {
        this.nomFour = nomFour;
    }

    public String getAdresseFour() {
        return adresseFour;
    }

    public void setAdresseFour(String adresseFour) {
        this.adresseFour = adresseFour;
    }

    public String getContactFour() {
        return contactFour;
    }

    public void setContactFour(String contactFour) {
        this.contactFour = contactFour;
    }

    // Méthode pour saisir les détails du fournisseur
    public void SaisirDetailFour(Scanner scanner) {
        System.out.print("Entrez le nom du Fournisseur: ");
        this.nomFour = scanner.nextLine();

        System.out.print("Entrez l'adresse du Fournisseur: ");
        this.adresseFour = scanner.nextLine();

        System.out.print("Entrez le contact du Fournisseur: ");
        this.contactFour = scanner.nextLine();
    }

    // Méthode pour afficher les détails du fournisseur
    public String AfficherDetailFour() {
        return "Nom du Fournisseur : " + this.nomFour + 
               "\nAdresse du fournisseur : " + this.adresseFour + 
               "\nContact du fournisseur : " + this.contactFour;
    }
}
