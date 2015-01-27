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
public class Totaal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long GebruikerID;
    private Long GerechtendID;
    private int Totaal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Totaal)) {
            return false;
        }
        Totaal other = (Totaal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Totaal[ id=" + id + " ]";
    }

    public Long getGebruikerID() {
        return GebruikerID;
    }

    public void setGebruikerID(Long GebruikerID) {
        this.GebruikerID = GebruikerID;
    }

    public Long getGerechtendID() {
        return GerechtendID;
    }

    public void setGerechtendID(Long GerechtendID) {
        this.GerechtendID = GerechtendID;
    }

    public int getTotaal() {
        return Totaal;
    }

    public void setTotaal(int Totaal) {
        this.Totaal = Totaal;
    }
    
}
