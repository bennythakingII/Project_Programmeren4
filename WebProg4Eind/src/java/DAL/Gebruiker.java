/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Benjamin
 */
@Entity
@Table(name = "GEBRUIKER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gebruiker.findAll", query = "SELECT g FROM Gebruiker g"),
    @NamedQuery(name = "Gebruiker.findByGebruikerid", query = "SELECT g FROM Gebruiker g WHERE g.gebruikerid = :gebruikerid"),
    @NamedQuery(name = "Gebruiker.findByAdmin", query = "SELECT g FROM Gebruiker g WHERE g.admin = :admin"),
    @NamedQuery(name = "Gebruiker.findByEmail", query = "SELECT g FROM Gebruiker g WHERE g.email = :email"),
    @NamedQuery(name = "Gebruiker.findByNaam", query = "SELECT g FROM Gebruiker g WHERE g.naam = :naam"),
    @NamedQuery(name = "Gebruiker.findByPassword", query = "SELECT g FROM Gebruiker g WHERE g.password = :password"),
    @NamedQuery(name = "Gebruiker.findByTelefoonnummer", query = "SELECT g FROM Gebruiker g WHERE g.telefoonnummer = :telefoonnummer")})
public class Gebruiker implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "GEBRUIKERID")
    private Long gebruikerid;
    @Column(name = "ADMIN")
    private Short admin;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 255)
    @Column(name = "NAAM")
    private String naam;
    @Size(max = 255)
    @Column(name = "PASSWORD")
    private String password;
    @Size(max = 255)
    @Column(name = "TELEFOONNUMMER")
    private String telefoonnummer;
    @OneToMany(mappedBy = "gebruikerGebruikerid")
    private Collection<Reservatie> reservatieCollection;

    public Gebruiker() {
    }

    public Gebruiker(Long gebruikerid) {
        this.gebruikerid = gebruikerid;
    }

    public Long getGebruikerid() {
        return gebruikerid;
    }

    public void setGebruikerid(Long gebruikerid) {
        this.gebruikerid = gebruikerid;
    }

    public Short getAdmin() {
        return admin;
    }

    public void setAdmin(Short admin) {
        this.admin = admin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @XmlTransient
    public Collection<Reservatie> getReservatieCollection() {
        return reservatieCollection;
    }

    public void setReservatieCollection(Collection<Reservatie> reservatieCollection) {
        this.reservatieCollection = reservatieCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gebruikerid != null ? gebruikerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gebruiker)) {
            return false;
        }
        Gebruiker other = (Gebruiker) object;
        if ((this.gebruikerid == null && other.gebruikerid != null) || (this.gebruikerid != null && !this.gebruikerid.equals(other.gebruikerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Gebruiker[ gebruikerid=" + gebruikerid + " ]";
    }
    
}
