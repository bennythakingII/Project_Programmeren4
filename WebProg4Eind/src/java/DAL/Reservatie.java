/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "RESERVATIE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservatie.findAll", query = "SELECT r FROM Reservatie r"),
    @NamedQuery(name = "Reservatie.findByReservatieid", query = "SELECT r FROM Reservatie r WHERE r.reservatieid = :reservatieid"),
    @NamedQuery(name = "Reservatie.findByDate", query = "SELECT r FROM Reservatie r WHERE r.date = :date"),
    @NamedQuery(name = "Reservatie.findByPlaatsen", query = "SELECT r FROM Reservatie r WHERE r.plaatsen = :plaatsen"),
    @NamedQuery(name = "Reservatie.findByTableid", query = "SELECT r FROM Reservatie r WHERE r.tableid = :tableid"),
    @NamedQuery(name = "Reservatie.findByTime", query = "SELECT r FROM Reservatie r WHERE r.time = :time")})
public class Reservatie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESERVATIEID")
    private Long reservatieid;
    @Size(max = 255)
    @Column(name = "DATE")
    private String date;
    @Column(name = "PLAATSEN")
    private Integer plaatsen;
    @Column(name = "TABLEID")
    private BigInteger tableid;
    @Column(name = "TIME")
    private Integer time;
    @JoinColumn(name = "GEBRUIKER_GEBRUIKERID", referencedColumnName = "GEBRUIKERID")
    @ManyToOne
    private Gebruiker gebruikerGebruikerid;

    public Reservatie() {
    }

    public Reservatie(Long reservatieid) {
        this.reservatieid = reservatieid;
    }

    public Long getReservatieid() {
        return reservatieid;
    }

    public void setReservatieid(Long reservatieid) {
        this.reservatieid = reservatieid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getPlaatsen() {
        return plaatsen;
    }

    public void setPlaatsen(Integer plaatsen) {
        this.plaatsen = plaatsen;
    }

    public BigInteger getTableid() {
        return tableid;
    }

    public void setTableid(BigInteger tableid) {
        this.tableid = tableid;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Gebruiker getGebruikerGebruikerid() {
        return gebruikerGebruikerid;
    }

    public void setGebruikerGebruikerid(Gebruiker gebruikerGebruikerid) {
        this.gebruikerGebruikerid = gebruikerGebruikerid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reservatieid != null ? reservatieid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservatie)) {
            return false;
        }
        Reservatie other = (Reservatie) object;
        if ((this.reservatieid == null && other.reservatieid != null) || (this.reservatieid != null && !this.reservatieid.equals(other.reservatieid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Reservatie[ reservatieid=" + reservatieid + " ]";
    }
    
}
