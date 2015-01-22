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
public class Reservatie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long ReservatieID;   
    private Gebruiker gebruiker;
    private RestaurantPlaatsen plaatsen;
    private String date;
    private  int time;

    protected  Reservatie(Gebruiker gebruiker, RestaurantPlaatsen plaatsen) {
    
        this.gebruiker = gebruiker;
        this.plaatsen = plaatsen;
    }
    
    protected  Reservatie() {}
    
    public Long getId() {
        return ReservatieID;
    }

    public void setId(Long id) {
        this.ReservatieID = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ReservatieID != null ? ReservatieID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the ReservatieID fields are not set
        if (!(object instanceof Reservatie)) {
            return false;
        }
        Reservatie other = (Reservatie) object;
        if ((this.ReservatieID == null && other.ReservatieID != null) || (this.ReservatieID != null && !this.ReservatieID.equals(other.ReservatieID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Reservatie[ id=" + ReservatieID + " ]";
    }

    public Gebruiker getGebruiker() {
        return gebruiker;
    }

    public void setGebruiker(Gebruiker gebruiker) {
        this.gebruiker = gebruiker;
    }

    public RestaurantPlaatsen getPlaatsen() {
        return plaatsen;
    }

    public void setPlaatsen(RestaurantPlaatsen plaatsen) {
        this.plaatsen = plaatsen;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    
}
