/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Benjamin
 */
@Entity
public class Gerechten implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    
    private Long gerechtenID;
    private String GerechtNaam;
    private double GerechtPrijs;
    private int GerechtenVoorraad;
    private int GerechtenAantalBesteld;
    private double Totaal;
    
    

    public Long getId() {
        return gerechtenID;
    }

    public void setId(Long id) {
        this.gerechtenID = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gerechtenID != null ? gerechtenID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the gerechtenID fields are not set
        if (!(object instanceof Gerechten)) {
            return false;
        }
        Gerechten other = (Gerechten) object;
        if ((this.gerechtenID == null && other.gerechtenID != null) || (this.gerechtenID != null && !this.gerechtenID.equals(other.gerechtenID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Gerechten[ id=" + gerechtenID + " ]";
    }

    public String getGerechtNaam() {
        return GerechtNaam;
    }

    public void setGerechtNaam(String GerechtNaam) {
        this.GerechtNaam = GerechtNaam;
    }

    public double getGerechtPrijs() {
        return GerechtPrijs;
    }

    public void setGerechtPrijs(double GerechtPrijs) {
        this.GerechtPrijs = GerechtPrijs;
    }

    public int getGerechtenVoorraad() {
        return GerechtenVoorraad;
    }

    public void setGerechtenVoorraad(int GerechtenVoorraad) {
        this.GerechtenVoorraad = GerechtenVoorraad;
    }

    public int getGerechtenAantalBesteld() {
        return GerechtenAantalBesteld;
    }

    public void setGerechtenAantalBesteld(int GerechtenAantalBesteld) {
        this.GerechtenAantalBesteld = GerechtenAantalBesteld;
    }

    public double getTotaal() {
        return Totaal;
    }

    public void setTotaal(double Totaal) {
        this.Totaal = Totaal;
    }
    
}
