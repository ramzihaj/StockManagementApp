/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import controller.OperationFacture;
import java.util.ArrayList;

abstract public class Facture implements OperationFacture {
    private int numFact;
    private DateF date;
    private ArrayList<LigneFacture> ligneFacture; // Liste de lignes de facture

    // Constructeur
    public Facture(int numFact, DateF date, ArrayList<LigneFacture> ligneFacture) {
        this.numFact = numFact;
        this.date = date;
        this.ligneFacture = ligneFacture;
    }

    // Getters et setters
    public int getNumFact() {
        return this.numFact;
    }

    public void setNumFact(int numFact) {
        this.numFact = numFact;
    }

    public DateF getDate() {  // Retourne l'objet Date
        return this.date;
    }

    public void setDate(DateF date) {  // Définit l'objet Date
        this.date = date;
    }

    public ArrayList<LigneFacture> getLigneFacture() {
        return this.ligneFacture;
    }

    public void setLigneFacture(ArrayList<LigneFacture> ligneFacture) {
        this.ligneFacture = ligneFacture;
    }

    // Méthodes abstraites
    @Override
    public abstract void SaisirFacture();

    @Override
    public abstract void AfficherFacture();

    @Override
    public abstract void TotalFacture();
}