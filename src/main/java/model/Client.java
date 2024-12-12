/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;


public class Client {
    private String nomClient;
    private String adresseClient;
    private String contactClient;

    // Constructeur
    public Client(String nomClient, String adresseClient, String contactClient) {
        this.nomClient = nomClient;
        this.adresseClient = adresseClient;
        this.contactClient = contactClient;
    }

    // Getters et Setters
    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getAdresseClient() {
        return adresseClient;
    }

    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }

    public String getContactClient() {
        return contactClient;
    }

    public void setContactClient(String contactClient) {
        this.contactClient = contactClient;
    }

    // Méthode pour saisir les détails du client
    public void SaisirDetailClient(Scanner scanner) {
        System.out.print("Entrez le nom du client: ");
        this.nomClient = scanner.nextLine();

        System.out.print("Entrez l'adresse du client: ");
        this.adresseClient = scanner.nextLine();

        System.out.print("Entrez le contact du client: ");
        this.contactClient = scanner.nextLine();
    }

    // Méthode pour afficher les détails du client
    public String AfficherDetailClient() {
        return "Nom du client : " + this.nomClient +
               "\nAdresse du client : " + this.adresseClient +
               "\nContact du client : " + this.contactClient;
    }
}