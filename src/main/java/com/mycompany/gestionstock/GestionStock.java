/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionstock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PCS
 */
public class GestionStock {

    public static void main(String[] args) {
       try {
            String url="jdbc:mysql://localhost:3306/stock_manager";
            String login="root";
            String pwd="";


            // Step1: Chargement du pilote
            Class.forName("com.mysql.jdbc.Driver");
            
            // Step2: etablissement de la connection
            Connection conn =  DriverManager.getConnection(url,login,pwd);
            System.out.println("its OK");
            
            // Step3: preparation  
            Statement st = conn.createStatement();
            
           // Step4.1:  execution de la requete d'insertion
            String req1 = "INSERT INTO `client` (`nomClient`, `adresseClient`, `contactClient`) VALUES ('Salah', 'Monastir ', '26364923')";
            st.executeUpdate(req1);
            String req2 = "INSERT INTO `client` (`nomClient`, `adresseClient`, `contactClient`) VALUES ('Ali', 'Sousse ', '20348443')";
            st.executeUpdate(req2);
            String req3 = "INSERT INTO `fournisseur` (`nomFour`, `adresseFour`, `contactFour`) VALUES ('MyTek', 'Sfax ', '903842022')";
            st.executeUpdate(req3);
            String req4 = "INSERT INTO `fournisseur` (`nomFour`, `adresseFour`, `contactFour`) VALUES ('WiKi', 'Tunis ', '95832924')";
            st.executeUpdate(req4);
            String req5 = "INSERT INTO `article` ( `libelle`) VALUES ( 'Pc hp pavillon ')";
            st.executeUpdate(req5);
            String req6 = "INSERT INTO `article` ( `libelle`) VALUES ( 'Smart Phone Redmi 6S ')";
            st.executeUpdate(req6);
            System.out.println("data Inserted ! ");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionStock.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GestionStock.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    } 
    
}
