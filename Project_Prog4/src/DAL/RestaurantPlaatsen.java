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
public class RestaurantPlaatsen implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    
    
    private Long tableID;
    private int plaatsen;
    

    public Long getId() {
        return tableID;
    }

    public void setId(Long id) {
        this.tableID = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tableID != null ? tableID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the tableID fields are not set
        if (!(object instanceof RestaurantPlaatsen)) {
            return false;
        }
        RestaurantPlaatsen other = (RestaurantPlaatsen) object;
        if ((this.tableID == null && other.tableID != null) || (this.tableID != null && !this.tableID.equals(other.tableID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.RestaurantPlaatsen[ id=" + tableID + " ]";
    }

    public int getSeatCapacity() {
        return plaatsen;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.plaatsen = seatCapacity;
    }
    
}
