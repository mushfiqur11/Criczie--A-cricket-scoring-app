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
@Table(name = "PLAYER", catalog = "", schema = "ANKAN")
@NamedQueries({
    @NamedQuery(name = "Player.findAll", query = "SELECT p FROM Player p")
    , @NamedQuery(name = "Player.findByPlayerid", query = "SELECT p FROM Player p WHERE p.playerid = :playerid")
    , @NamedQuery(name = "Player.findByPlayername", query = "SELECT p FROM Player p WHERE p.playername = :playername")
    , @NamedQuery(name = "Player.findByPlayerage", query = "SELECT p FROM Player p WHERE p.playerage = :playerage")
    , @NamedQuery(name = "Player.findByPlayerteamid", query = "SELECT p FROM Player p WHERE p.playerteamid = :playerteamid")})
public class Player implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PLAYERID")
    private BigDecimal playerid;
    @Column(name = "PLAYERNAME")
    private String playername;
    @Column(name = "PLAYERAGE")
    private BigInteger playerage;
    @Column(name = "PLAYERTEAMID")
    private BigInteger playerteamid;

    public Player() {
    }

    public Player(BigDecimal playerid) {
        this.playerid = playerid;
    }

    public BigDecimal getPlayerid() {
        return playerid;
    }

    public void setPlayerid(BigDecimal playerid) {
        BigDecimal oldPlayerid = this.playerid;
        this.playerid = playerid;
        changeSupport.firePropertyChange("playerid", oldPlayerid, playerid);
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        String oldPlayername = this.playername;
        this.playername = playername;
        changeSupport.firePropertyChange("playername", oldPlayername, playername);
    }

    public BigInteger getPlayerage() {
        return playerage;
    }

    public void setPlayerage(BigInteger playerage) {
        BigInteger oldPlayerage = this.playerage;
        this.playerage = playerage;
        changeSupport.firePropertyChange("playerage", oldPlayerage, playerage);
    }

    public BigInteger getPlayerteamid() {
        return playerteamid;
    }

    public void setPlayerteamid(BigInteger playerteamid) {
        BigInteger oldPlayerteamid = this.playerteamid;
        this.playerteamid = playerteamid;
        changeSupport.firePropertyChange("playerteamid", oldPlayerteamid, playerteamid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (playerid != null ? playerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Player)) {
            return false;
        }
        Player other = (Player) object;
        if ((this.playerid == null && other.playerid != null) || (this.playerid != null && !this.playerid.equals(other.playerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sadprojectcrickzie.Player[ playerid=" + playerid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
