/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Benjamin
 */
@Entity
@Table(name = "GERECHTEN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gerechten.findAll", query = "SELECT g FROM Gerechten g"),
    @NamedQuery(name = "Gerechten.findByGerechtenid", query = "SELECT g FROM Gerechten g WHERE g.gerechtenid = :gerechtenid"),
    @NamedQuery(name = "Gerechten.findByGerechtnaam", query = "SELECT g FROM Gerechten g WHERE g.gerechtnaam = :gerechtnaam"),
    @NamedQuery(name = "Gerechten.findByGerechtprijs", query = "SELECT g FROM Gerechten g WHERE g.gerechtprijs = :gerechtprijs"),
    @NamedQuery(name = "Gerechten.findByGerechtenaantalbesteld", query = "SELECT g FROM Gerechten g WHERE g.gerechtenaantalbesteld = :gerechtenaantalbesteld"),
    @NamedQuery(name = "Gerechten.findByGerechtenvoorraad", query = "SELECT g FROM Gerechten g WHERE g.gerechtenvoorraad = :gerechtenvoorraad"),
    @NamedQuery(name = "Gerechten.findByTotaal", query = "SELECT g FROM Gerechten g WHERE g.totaal = :totaal")})
public class Gerechten implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "GERECHTENID")
    private Long gerechtenid;
    @Size(max = 255)
    @Column(name = "GERECHTNAAM")
    private String gerechtnaam;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "GERECHTPRIJS")
    private Double gerechtprijs;
    @Column(name = "GERECHTENAANTALBESTELD")
    private Integer gerechtenaantalbesteld;
    @Column(name = "GERECHTENVOORRAAD")
    private Integer gerechtenvoorraad;
    @Column(name = "TOTAAL")
    private Integer totaal;

    public Gerechten() {
    }

    public Gerechten(Long gerechtenid) {
        this.gerechtenid = gerechtenid;
    }

    public Long getGerechtenid() {
        return gerechtenid;
    }

    public void setGerechtenid(Long gerechtenid) {
        this.gerechtenid = gerechtenid;
    }

    public String getGerechtnaam() {
        return gerechtnaam;
    }

    public void setGerechtnaam(String gerechtnaam) {
        this.gerechtnaam = gerechtnaam;
    }

    public Double getGerechtprijs() {
        return gerechtprijs;
    }

    public void setGerechtprijs(Double gerechtprijs) {
        this.gerechtprijs = gerechtprijs;
    }

    public Integer getGerechtenaantalbesteld() {
        return gerechtenaantalbesteld;
    }

    public void setGerechtenaantalbesteld(Integer gerechtenaantalbesteld) {
        this.gerechtenaantalbesteld = gerechtenaantalbesteld;
    }

    public Integer getGerechtenvoorraad() {
        return gerechtenvoorraad;
    }

    public void setGerechtenvoorraad(Integer gerechtenvoorraad) {
        this.gerechtenvoorraad = gerechtenvoorraad;
    }

    public Integer getTotaal() {
        return totaal;
    }

    public void setTotaal(Integer totaal) {
        this.totaal = totaal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gerechtenid != null ? gerechtenid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gerechten)) {
            return false;
        }
        Gerechten other = (Gerechten) object;
        if ((this.gerechtenid == null && other.gerechtenid != null) || (this.gerechtenid != null && !this.gerechtenid.equals(other.gerechtenid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Gerechten[ gerechtenid=" + gerechtenid + " ]";
    }
    
}
