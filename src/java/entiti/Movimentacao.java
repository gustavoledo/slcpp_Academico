/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entiti;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sacramento
 */
@Entity
@Table(name = "movimentacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movimentacao.findAll", query = "SELECT m FROM Movimentacao m"),
    @NamedQuery(name = "Movimentacao.findByIdMovimentacao", query = "SELECT m FROM Movimentacao m WHERE m.idMovimentacao = :idMovimentacao")})
public class Movimentacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_movimentacao")
    private Integer idMovimentacao;
    @JoinColumn(name = "id_endarmazem", referencedColumnName = "id_endarmazem")
    @OneToOne
    private EndArmazem idEndarmazem;
    @JoinColumn(name = "id_produto", referencedColumnName = "num_onu")
    @ManyToOne
    private Produto idProduto;

    public Movimentacao() {
    }

    public Movimentacao(Integer idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }

    public Integer getIdMovimentacao() {
        return idMovimentacao;
    }

    public void setIdMovimentacao(Integer idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }

    public EndArmazem getIdEndarmazem() {
        return idEndarmazem;
    }

    public void setIdEndarmazem(EndArmazem idEndarmazem) {
        this.idEndarmazem = idEndarmazem;
    }

    public Produto getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMovimentacao != null ? idMovimentacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimentacao)) {
            return false;
        }
        Movimentacao other = (Movimentacao) object;
        if ((this.idMovimentacao == null && other.idMovimentacao != null) || (this.idMovimentacao != null && !this.idMovimentacao.equals(other.idMovimentacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entiti.Movimentacao[ idMovimentacao=" + idMovimentacao + " ]";
    }
    
}