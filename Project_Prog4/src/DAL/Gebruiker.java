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
public class Gebruiker implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    
    private Long gebruikerID;
    private String naam;
    private String password;
    private String telefoonnummer;
    private String email;
    private boolean Admin;
    

    public Long getId() {
        return gebruikerID;
    }

    public void setId(Long id) {
        this.gebruikerID = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gebruikerID != null ? gebruikerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the gebruikerID fields are not set
        if (!(object instanceof Gebruiker)) {
            return false;
        }
        Gebruiker other = (Gebruiker) object;
        return !((this.gebruikerID == null && other.gebruikerID != null) || (this.gebruikerID != null && !this.gebruikerID.equals(other.gebruikerID)));
    }

    @Override
    public String toString() {
        return "DAL.Gebruiker[ id=" + gebruikerID + " ]";
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(String telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the Admin
     */
    public boolean isAdmin() {
        return Admin;
    }

    /**
     * @param Admin the Admin to set
     */
    public void setAdmin(boolean Admin) {
        this.Admin = Admin;
    }
    
}
