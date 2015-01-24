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
    
    private Long reservatieID; 
    private Gebruiker gebruiker;
    private Long tableID;
    private int plaatsen;
    private String date;
    private  int time;

    public Long getId() {
        return reservatieID;
    }

    public void setId(Long id) {
        this.reservatieID = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reservatieID != null ? reservatieID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservatie)) {
            return false;
        }
        Reservatie other = (Reservatie) object;
        if ((this.reservatieID == null && other.reservatieID != null) || (this.reservatieID != null && !this.reservatieID.equals(other.reservatieID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Reservatie[ id=" + reservatieID + " ]";
    }

    /**
     * @return the gebruiker
     */
    public Gebruiker getGebruiker() {
        return gebruiker;
    }

    /**
     * @param gebruiker the gebruiker to set
     */
    public void setGebruiker(Gebruiker gebruiker) {
        this.gebruiker = gebruiker;
    }

    /**
     * @return the tableID
     */
    public Long getTableID() {
        return tableID;
    }

    /**
     * @param tableID the tableID to set
     */
    public void setTableID(Long tableID) {
        this.tableID = tableID;
    }

    /**
     * @return the plaatsen
     */
    public int getPlaatsen() {
        return plaatsen;
    }

    /**
     * @param plaatsen the plaatsen to set
     */
    public void setPlaatsen(int plaatsen) {
        this.plaatsen = plaatsen;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }
    
}
