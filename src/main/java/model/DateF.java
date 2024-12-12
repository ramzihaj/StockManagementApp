/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author PCS
 */
public class DateF {
    private int jour;
    private int mois;
    private int annee;
    
    public DateF(int jour, int mois, int annee){
    this.jour= jour;
    this.mois= mois;
    this.annee= annee;
    }
    
    public int SaisirEntier(String message, int min, int max) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.print(message);
        try {
            int value = scanner.nextInt();
            if (value >= min && value <= max) {
                return value;
            } else {
                System.out.println("Entrée invalide. Veuillez entrer une valeur entre " + min + " et " + max + ".");
            }
        } catch (Exception e) {
            System.out.println("Entrée invalide. Veuillez entrer un entier.");
            scanner.nextLine(); // Consommer l'entrée incorrecte
        }
    }
}
    public boolean EstDateValide() {
        int[] joursParMois = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mois < 1 || mois > 12) {
            return false; // Mois invalide
        }
        if (jour < 1 || jour > joursParMois[mois - 1]) {
            return false; // Jour invalide pour ce mois
        }
        return true;
    }

    
   public String SaisirDate() {
    this.jour = SaisirEntier("Entrez le jour : ", 1, 31);  // Assurez-vous que le jour est valide
    this.mois = SaisirEntier("Entrez le mois : ", 1, 12);  // Le mois doit être entre 1 et 12
    this.annee = SaisirEntier("Entrez l'année : ", 1900, 2100);  // Année entre 1900 et 2100

    return "Date saisie : " + this.jour + "/" + this.mois + "/" + this.annee;
}

    
   public String AfficherDate() {
    return String.format("%02d/%02d/%04d", this.jour, this.mois, this.annee);
}

    
}