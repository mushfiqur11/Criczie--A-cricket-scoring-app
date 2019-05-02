/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sadprojectcrickzie;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "TOURNAMENT", catalog = "", schema = "ANKAN")
@NamedQueries({
    @NamedQuery(name = "Tournament.findAll", query = "SELECT t FROM Tournament t")
    , @NamedQuery(name = "Tournament.findByTournamentid", query = "SELECT t FROM Tournament t WHERE t.tournamentid = :tournamentid")
    , @NamedQuery(name = "Tournament.findByTournamentname", query = "SELECT t FROM Tournament t WHERE t.tournamentname = :tournamentname")
    , @NamedQuery(name = "Tournament.findByTournamentyear", query = "SELECT t FROM Tournament t WHERE t.tournamentyear = :tournamentyear")
    , @NamedQuery(name = "Tournament.findByNumberofteams", query = "SELECT t FROM Tournament t WHERE t.numberofteams = :numberofteams")
    , @NamedQuery(name = "Tournament.findByFormat", query = "SELECT t FROM Tournament t WHERE t.format = :format")})
public class Tournament implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "TOURNAMENTID")
    private BigDecimal tournamentid;
    @Column(name = "TOURNAMENTNAME")
    private String tournamentname;
    @Column(name = "TOURNAMENTYEAR")
    private BigInteger tournamentyear;
    @Column(name = "NUMBEROFTEAMS")
    private BigInteger numberofteams;
    @Column(name = "FORMAT")
    private BigInteger format;

    public Tournament() {
    }

    public Tournament(BigDecimal tournamentid) {
        this.tournamentid = tournamentid;
    }

    public BigDecimal getTournamentid() {
        return tournamentid;
    }

    public void setTournamentid(BigDecimal tournamentid) {
        BigDecimal oldTournamentid = this.tournamentid;
        this.tournamentid = tournamentid;
        changeSupport.firePropertyChange("tournamentid", oldTournamentid, tournamentid);
    }

    public String getTournamentname() {
        return tournamentname;
    }

    public void setTournamentname(String tournamentname) {
        String oldTournamentname = this.tournamentname;
        this.tournamentname = tournamentname;
        changeSupport.firePropertyChange("tournamentname", oldTournamentname, tournamentname);
    }

    public BigInteger getTournamentyear() {
        return tournamentyear;
    }

    public void setTournamentyear(BigInteger tournamentyear) {
        BigInteger oldTournamentyear = this.tournamentyear;
        this.tournamentyear = tournamentyear;
        changeSupport.firePropertyChange("tournamentyear", oldTournamentyear, tournamentyear);
    }

    public BigInteger getNumberofteams() {
        return numberofteams;
    }

    public void setNumberofteams(BigInteger numberofteams) {
        BigInteger oldNumberofteams = this.numberofteams;
        this.numberofteams = numberofteams;
        changeSupport.firePropertyChange("numberofteams", oldNumberofteams, numberofteams);
    }

    public BigInteger getFormat() {
        return format;
    }

    public void setFormat(BigInteger format) {
        BigInteger oldFormat = this.format;
        this.format = format;
        changeSupport.firePropertyChange("format", oldFormat, format);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tournamentid != null ? tournamentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tournament)) {
            return false;
        }
        Tournament other = (Tournament) object;
        if ((this.tournamentid == null && other.tournamentid != null) || (this.tournamentid != null && !this.tournamentid.equals(other.tournamentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sadprojectcrickzie.Tournament[ tournamentid=" + tournamentid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
