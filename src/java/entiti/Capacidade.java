/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entiti;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sacramento
 */
@Entity
@Table(name = "capacidade")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Capacidade.findAll", query = "SELECT c FROM Capacidade c"),
    @NamedQuery(name = "Capacidade.findByIdCapacidade", query = "SELECT c FROM Capacidade c WHERE c.idCapacidade = :idCapacidade"),
    @NamedQuery(name = "Capacidade.findByTipoCapacidade", query = "SELECT c FROM Capacidade c WHERE c.tipoCapacidade = :tipoCapacidade")})
public class Capacidade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_capacidade")
    private Integer idCapacidade;
    @Size(max = 255)
    @Column(name = "tipo_capacidade")
    private String tipoCapacidade;
    @OneToMany(mappedBy = "idCapacidade")
    private List<Embalagem> embalagemList;

    public Capacidade() {
    }

    public Capacidade(Integer idCapacidade) {
        this.idCapacidade = idCapacidade;
    }

    public Integer getIdCapacidade() {
        return idCapacidade;
    }

    public void setIdCapacidade(Integer idCapacidade) {
        this.idCapacidade = idCapacidade;
    }

    public String getTipoCapacidade() {
        return tipoCapacidade;
    }

    public void setTipoCapacidade(String tipoCapacidade) {
        this.tipoCapacidade = tipoCapacidade;
    }

    @XmlTransient
    public List<Embalagem> getEmbalagemList() {
        return embalagemList;
    }

    public void setEmbalagemList(List<Embalagem> embalagemList) {
        this.embalagemList = embalagemList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCapacidade != null ? idCapacidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Capacidade)) {
            return false;
        }
        Capacidade other = (Capacidade) object;
        if ((this.idCapacidade == null && other.idCapacidade != null) || (this.idCapacidade != null && !this.idCapacidade.equals(other.idCapacidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entiti.Capacidade[ idCapacidade=" + idCapacidade + " ]";
    }
    
}
