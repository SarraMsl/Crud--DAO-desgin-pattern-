/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Sara Mousselmal
 */
public class Cours {
    
    int IdCours;
    String NomCours;
    int CofficientCours;
    int CreditCours;
    String NomProfesseur;   

    public Cours() {
    }
                          
 

    public Cours(int IdCours, String NomCours, int CofficientCours, int CreditCours, String NomProfesseur) {
        this.IdCours = IdCours;
        this.NomCours = NomCours;
        this.CofficientCours = CofficientCours;
        this.CreditCours = CreditCours;
        this.NomProfesseur = NomProfesseur;
    }

    public int getIdCours() {
        return IdCours;
    }

    public String getNomCours() {
        return NomCours;
    }

    public int getCofficientCours() {
        return CofficientCours;
    }

    public int getCreditCours() {
        return CreditCours;
    }

    public String getNomProfesseur() {
        return NomProfesseur;
    }
    
    
      
    
    
    
    
    
}
