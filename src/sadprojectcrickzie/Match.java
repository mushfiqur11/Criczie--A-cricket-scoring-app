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
@Table(name = "MATCH", catalog = "", schema = "ANKAN")
@NamedQueries({
    @NamedQuery(name = "Match.findAll", query = "SELECT m FROM Match m")
    , @NamedQuery(name = "Match.findByMatchid", query = "SELECT m FROM Match m WHERE m.matchid = :matchid")
    , @NamedQuery(name = "Match.findByTeam1", query = "SELECT m FROM Match m WHERE m.team1 = :team1")
    , @NamedQuery(name = "Match.findByTeam2", query = "SELECT m FROM Match m WHERE m.team2 = :team2")
    , @NamedQuery(name = "Match.findByTossteam", query = "SELECT m FROM Match m WHERE m.tossteam = :tossteam")
    , @NamedQuery(name = "Match.findByPlayer1id", query = "SELECT m FROM Match m WHERE m.player1id = :player1id")
    , @NamedQuery(name = "Match.findByPlayer2id", query = "SELECT m FROM Match m WHERE m.player2id = :player2id")
    , @NamedQuery(name = "Match.findByPlayer3id", query = "SELECT m FROM Match m WHERE m.player3id = :player3id")
    , @NamedQuery(name = "Match.findByPlayer4id", query = "SELECT m FROM Match m WHERE m.player4id = :player4id")
    , @NamedQuery(name = "Match.findByPlayer5id", query = "SELECT m FROM Match m WHERE m.player5id = :player5id")
    , @NamedQuery(name = "Match.findByPlayer6id", query = "SELECT m FROM Match m WHERE m.player6id = :player6id")
    , @NamedQuery(name = "Match.findByPlayer7id", query = "SELECT m FROM Match m WHERE m.player7id = :player7id")
    , @NamedQuery(name = "Match.findByPlayer8id", query = "SELECT m FROM Match m WHERE m.player8id = :player8id")
    , @NamedQuery(name = "Match.findByPlayer9id", query = "SELECT m FROM Match m WHERE m.player9id = :player9id")
    , @NamedQuery(name = "Match.findByPlayer10id", query = "SELECT m FROM Match m WHERE m.player10id = :player10id")
    , @NamedQuery(name = "Match.findByPlayer11id", query = "SELECT m FROM Match m WHERE m.player11id = :player11id")
    , @NamedQuery(name = "Match.findByPlayer12id", query = "SELECT m FROM Match m WHERE m.player12id = :player12id")
    , @NamedQuery(name = "Match.findByPlayer13id", query = "SELECT m FROM Match m WHERE m.player13id = :player13id")
    , @NamedQuery(name = "Match.findByPlayer14id", query = "SELECT m FROM Match m WHERE m.player14id = :player14id")
    , @NamedQuery(name = "Match.findByPlayer15id", query = "SELECT m FROM Match m WHERE m.player15id = :player15id")
    , @NamedQuery(name = "Match.findByPlayer16id", query = "SELECT m FROM Match m WHERE m.player16id = :player16id")
    , @NamedQuery(name = "Match.findByPlayer17id", query = "SELECT m FROM Match m WHERE m.player17id = :player17id")
    , @NamedQuery(name = "Match.findByPlayer18id", query = "SELECT m FROM Match m WHERE m.player18id = :player18id")
    , @NamedQuery(name = "Match.findByPlayer19id", query = "SELECT m FROM Match m WHERE m.player19id = :player19id")
    , @NamedQuery(name = "Match.findByPlayer20id", query = "SELECT m FROM Match m WHERE m.player20id = :player20id")
    , @NamedQuery(name = "Match.findByPlayer21id", query = "SELECT m FROM Match m WHERE m.player21id = :player21id")
    , @NamedQuery(name = "Match.findByPlayer22id", query = "SELECT m FROM Match m WHERE m.player22id = :player22id")
    , @NamedQuery(name = "Match.findByOvers", query = "SELECT m FROM Match m WHERE m.overs = :overs")})
public class Match implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "MATCHID")
    private BigDecimal matchid;
    @Column(name = "TEAM1")
    private BigInteger team1;
    @Column(name = "TEAM2")
    private BigInteger team2;
    @Column(name = "TOSSTEAM")
    private BigInteger tossteam;
    @Column(name = "PLAYER1ID")
    private BigInteger player1id;
    @Column(name = "PLAYER2ID")
    private BigInteger player2id;
    @Column(name = "PLAYER3ID")
    private BigInteger player3id;
    @Column(name = "PLAYER4ID")
    private BigInteger player4id;
    @Column(name = "PLAYER5ID")
    private BigInteger player5id;
    @Column(name = "PLAYER6ID")
    private BigInteger player6id;
    @Column(name = "PLAYER7ID")
    private BigInteger player7id;
    @Column(name = "PLAYER8ID")
    private BigInteger player8id;
    @Column(name = "PLAYER9ID")
    private BigInteger player9id;
    @Column(name = "PLAYER10ID")
    private BigInteger player10id;
    @Column(name = "PLAYER11ID")
    private BigInteger player11id;
    @Column(name = "PLAYER12ID")
    private BigInteger player12id;
    @Column(name = "PLAYER13ID")
    private BigInteger player13id;
    @Column(name = "PLAYER14ID")
    private BigInteger player14id;
    @Column(name = "PLAYER15ID")
    private BigInteger player15id;
    @Column(name = "PLAYER16ID")
    private BigInteger player16id;
    @Column(name = "PLAYER17ID")
    private BigInteger player17id;
    @Column(name = "PLAYER18ID")
    private BigInteger player18id;
    @Column(name = "PLAYER19ID")
    private BigInteger player19id;
    @Column(name = "PLAYER20ID")
    private BigInteger player20id;
    @Column(name = "PLAYER21ID")
    private BigInteger player21id;
    @Column(name = "PLAYER22ID")
    private BigInteger player22id;
    @Column(name = "OVERS")
    private BigInteger overs;

    public Match() {
    }

    public Match(BigDecimal matchid) {
        this.matchid = matchid;
    }

    public BigDecimal getMatchid() {
        return matchid;
    }

    public void setMatchid(BigDecimal matchid) {
        BigDecimal oldMatchid = this.matchid;
        this.matchid = matchid;
        changeSupport.firePropertyChange("matchid", oldMatchid, matchid);
    }

    public BigInteger getTeam1() {
        return team1;
    }

    public void setTeam1(BigInteger team1) {
        BigInteger oldTeam1 = this.team1;
        this.team1 = team1;
        changeSupport.firePropertyChange("team1", oldTeam1, team1);
    }

    public BigInteger getTeam2() {
        return team2;
    }

    public void setTeam2(BigInteger team2) {
        BigInteger oldTeam2 = this.team2;
        this.team2 = team2;
        changeSupport.firePropertyChange("team2", oldTeam2, team2);
    }

    public BigInteger getTossteam() {
        return tossteam;
    }

    public void setTossteam(BigInteger tossteam) {
        BigInteger oldTossteam = this.tossteam;
        this.tossteam = tossteam;
        changeSupport.firePropertyChange("tossteam", oldTossteam, tossteam);
    }

    public BigInteger getPlayer1id() {
        return player1id;
    }

    public void setPlayer1id(BigInteger player1id) {
        BigInteger oldPlayer1id = this.player1id;
        this.player1id = player1id;
        changeSupport.firePropertyChange("player1id", oldPlayer1id, player1id);
    }

    public BigInteger getPlayer2id() {
        return player2id;
    }

    public void setPlayer2id(BigInteger player2id) {
        BigInteger oldPlayer2id = this.player2id;
        this.player2id = player2id;
        changeSupport.firePropertyChange("player2id", oldPlayer2id, player2id);
    }

    public BigInteger getPlayer3id() {
        return player3id;
    }

    public void setPlayer3id(BigInteger player3id) {
        BigInteger oldPlayer3id = this.player3id;
        this.player3id = player3id;
        changeSupport.firePropertyChange("player3id", oldPlayer3id, player3id);
    }

    public BigInteger getPlayer4id() {
        return player4id;
    }

    public void setPlayer4id(BigInteger player4id) {
        BigInteger oldPlayer4id = this.player4id;
        this.player4id = player4id;
        changeSupport.firePropertyChange("player4id", oldPlayer4id, player4id);
    }

    public BigInteger getPlayer5id() {
        return player5id;
    }

    public void setPlayer5id(BigInteger player5id) {
        BigInteger oldPlayer5id = this.player5id;
        this.player5id = player5id;
        changeSupport.firePropertyChange("player5id", oldPlayer5id, player5id);
    }

    public BigInteger getPlayer6id() {
        return player6id;
    }

    public void setPlayer6id(BigInteger player6id) {
        BigInteger oldPlayer6id = this.player6id;
        this.player6id = player6id;
        changeSupport.firePropertyChange("player6id", oldPlayer6id, player6id);
    }

    public BigInteger getPlayer7id() {
        return player7id;
    }

    public void setPlayer7id(BigInteger player7id) {
        BigInteger oldPlayer7id = this.player7id;
        this.player7id = player7id;
        changeSupport.firePropertyChange("player7id", oldPlayer7id, player7id);
    }

    public BigInteger getPlayer8id() {
        return player8id;
    }

    public void setPlayer8id(BigInteger player8id) {
        BigInteger oldPlayer8id = this.player8id;
        this.player8id = player8id;
        changeSupport.firePropertyChange("player8id", oldPlayer8id, player8id);
    }

    public BigInteger getPlayer9id() {
        return player9id;
    }

    public void setPlayer9id(BigInteger player9id) {
        BigInteger oldPlayer9id = this.player9id;
        this.player9id = player9id;
        changeSupport.firePropertyChange("player9id", oldPlayer9id, player9id);
    }

    public BigInteger getPlayer10id() {
        return player10id;
    }

    public void setPlayer10id(BigInteger player10id) {
        BigInteger oldPlayer10id = this.player10id;
        this.player10id = player10id;
        changeSupport.firePropertyChange("player10id", oldPlayer10id, player10id);
    }

    public BigInteger getPlayer11id() {
        return player11id;
    }

    public void setPlayer11id(BigInteger player11id) {
        BigInteger oldPlayer11id = this.player11id;
        this.player11id = player11id;
        changeSupport.firePropertyChange("player11id", oldPlayer11id, player11id);
    }

    public BigInteger getPlayer12id() {
        return player12id;
    }

    public void setPlayer12id(BigInteger player12id) {
        BigInteger oldPlayer12id = this.player12id;
        this.player12id = player12id;
        changeSupport.firePropertyChange("player12id", oldPlayer12id, player12id);
    }

    public BigInteger getPlayer13id() {
        return player13id;
    }

    public void setPlayer13id(BigInteger player13id) {
        BigInteger oldPlayer13id = this.player13id;
        this.player13id = player13id;
        changeSupport.firePropertyChange("player13id", oldPlayer13id, player13id);
    }

    public BigInteger getPlayer14id() {
        return player14id;
    }

    public void setPlayer14id(BigInteger player14id) {
        BigInteger oldPlayer14id = this.player14id;
        this.player14id = player14id;
        changeSupport.firePropertyChange("player14id", oldPlayer14id, player14id);
    }

    public BigInteger getPlayer15id() {
        return player15id;
    }

    public void setPlayer15id(BigInteger player15id) {
        BigInteger oldPlayer15id = this.player15id;
        this.player15id = player15id;
        changeSupport.firePropertyChange("player15id", oldPlayer15id, player15id);
    }

    public BigInteger getPlayer16id() {
        return player16id;
    }

    public void setPlayer16id(BigInteger player16id) {
        BigInteger oldPlayer16id = this.player16id;
        this.player16id = player16id;
        changeSupport.firePropertyChange("player16id", oldPlayer16id, player16id);
    }

    public BigInteger getPlayer17id() {
        return player17id;
    }

    public void setPlayer17id(BigInteger player17id) {
        BigInteger oldPlayer17id = this.player17id;
        this.player17id = player17id;
        changeSupport.firePropertyChange("player17id", oldPlayer17id, player17id);
    }

    public BigInteger getPlayer18id() {
        return player18id;
    }

    public void setPlayer18id(BigInteger player18id) {
        BigInteger oldPlayer18id = this.player18id;
        this.player18id = player18id;
        changeSupport.firePropertyChange("player18id", oldPlayer18id, player18id);
    }

    public BigInteger getPlayer19id() {
        return player19id;
    }

    public void setPlayer19id(BigInteger player19id) {
        BigInteger oldPlayer19id = this.player19id;
        this.player19id = player19id;
        changeSupport.firePropertyChange("player19id", oldPlayer19id, player19id);
    }

    public BigInteger getPlayer20id() {
        return player20id;
    }

    public void setPlayer20id(BigInteger player20id) {
        BigInteger oldPlayer20id = this.player20id;
        this.player20id = player20id;
        changeSupport.firePropertyChange("player20id", oldPlayer20id, player20id);
    }

    public BigInteger getPlayer21id() {
        return player21id;
    }

    public void setPlayer21id(BigInteger player21id) {
        BigInteger oldPlayer21id = this.player21id;
        this.player21id = player21id;
        changeSupport.firePropertyChange("player21id", oldPlayer21id, player21id);
    }

    public BigInteger getPlayer22id() {
        return player22id;
    }

    public void setPlayer22id(BigInteger player22id) {
        BigInteger oldPlayer22id = this.player22id;
        this.player22id = player22id;
        changeSupport.firePropertyChange("player22id", oldPlayer22id, player22id);
    }

    public BigInteger getOvers() {
        return overs;
    }

    public void setOvers(BigInteger overs) {
        BigInteger oldOvers = this.overs;
        this.overs = overs;
        changeSupport.firePropertyChange("overs", oldOvers, overs);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matchid != null ? matchid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Match)) {
            return false;
        }
        Match other = (Match) object;
        if ((this.matchid == null && other.matchid != null) || (this.matchid != null && !this.matchid.equals(other.matchid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sadprojectcrickzie.Match[ matchid=" + matchid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
