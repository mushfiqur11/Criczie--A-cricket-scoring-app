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
@Table(name = "TEAMS", catalog = "", schema = "ANKAN")
@NamedQueries({
    @NamedQuery(name = "Teams.findAll", query = "SELECT t FROM Teams t")
    , @NamedQuery(name = "Teams.findByTeamid", query = "SELECT t FROM Teams t WHERE t.teamid = :teamid")
    , @NamedQuery(name = "Teams.findByTeamname", query = "SELECT t FROM Teams t WHERE t.teamname = :teamname")
    , @NamedQuery(name = "Teams.findByTeamlocation", query = "SELECT t FROM Teams t WHERE t.teamlocation = :teamlocation")})
public class Teams implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "TEAMID")
    private BigDecimal teamid;
    @Column(name = "TEAMNAME")
    private String teamname;
    @Column(name = "TEAMLOCATION")
    private String teamlocation;

    public Teams() {
    }

    public Teams(BigDecimal teamid) {
        this.teamid = teamid;
    }

    public BigDecimal getTeamid() {
        return teamid;
    }

    public void setTeamid(BigDecimal teamid) {
        BigDecimal oldTeamid = this.teamid;
        this.teamid = teamid;
        changeSupport.firePropertyChange("teamid", oldTeamid, teamid);
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        String oldTeamname = this.teamname;
        this.teamname = teamname;
        changeSupport.firePropertyChange("teamname", oldTeamname, teamname);
    }

    public String getTeamlocation() {
        return teamlocation;
    }

    public void setTeamlocation(String teamlocation) {
        String oldTeamlocation = this.teamlocation;
        this.teamlocation = teamlocation;
        changeSupport.firePropertyChange("teamlocation", oldTeamlocation, teamlocation);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (teamid != null ? teamid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Teams)) {
            return false;
        }
        Teams other = (Teams) object;
        if ((this.teamid == null && other.teamid != null) || (this.teamid != null && !this.teamid.equals(other.teamid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sadprojectcrickzie.Teams[ teamid=" + teamid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
