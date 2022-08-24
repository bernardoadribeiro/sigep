package br.com.sigep.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "Propriedades")
public class Propriedade {
    /* Atributos */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Version
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaAtualizacao;

    @Column(name = "codigoPropriedade", nullable = false)
    private String codigoPropriedade;

    @Column(name = "qtdQuartos")
    private int qtdQuartos;

    @ManyToOne(targetEntity = Endereco.class)
    @JoinColumn(name = "enderecoID")
    private Endereco endereco;


    /* Construtores */
    public Propriedade(long id, String codigoPropriedade, int qtdQuartos, Endereco endereco) {
        this.id = id;
        this.dataCriacao = new Date();
        this.ultimaAtualizacao = new Date();
        this.codigoPropriedade = codigoPropriedade;
        this.qtdQuartos = qtdQuartos;
        this.endereco = endereco;
    }


    /* Getters and setters */
    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public Date getDataCriacao() {
        return dataCriacao;
    }


    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }


    public Date getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }


    public void setUltimaAtualizacao(Date ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }


    public String getCodigoPropriedade() {
        return codigoPropriedade;
    }


    public void setCodigoPropriedade(String codigoPropriedade) {
        this.codigoPropriedade = codigoPropriedade;
    }


    public int getQtdQuartos() {
        return qtdQuartos;
    }


    public void setQtdQuartos(int qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
    }


    public Endereco getEndereco() {
        return endereco;
    }


    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    /* hashCode and equals */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoPropriedade == null) ? 0 : codigoPropriedade.hashCode());
        result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
        result = prime * result + qtdQuartos;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Propriedade other = (Propriedade) obj;
        if (codigoPropriedade == null) {
            if (other.codigoPropriedade != null)
                return false;
        } else if (!codigoPropriedade.equals(other.codigoPropriedade))
            return false;
        if (endereco == null) {
            if (other.endereco != null)
                return false;
        } else if (!endereco.equals(other.endereco))
            return false;
        if (qtdQuartos != other.qtdQuartos)
            return false;
        return true;
    }


    /* toString */
    @Override
    public String toString() {
        return "Propriedade [codigoPropriedade=" + codigoPropriedade + ", endereco=" + endereco + ", qtdQuartos="
                + qtdQuartos + "]";
    }

}
