package br.com.sigep.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "Quartos")
public class Quarto implements Serializable {
    /* Atributos */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Version
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaAtualizacao;

    @Column(name = "numQuarto", length = 4, nullable = false)
    private int numQuarto;

    @Enumerated(EnumType.STRING)
    private QuartoCategoria categoria;

    @Enumerated(EnumType.STRING)
    private QuartoStatus status;

    @Column(name = "qtdCamaCasal")
    private int qtdCamaCasal;

    @Column(name = "qtdCamaSolteiro")
    private int qtdCamaSolteiro;

    @Column(name = "capacidade", nullable = false)
    private int capacidade;

    @Column(name = "precoDiaria")
    private BigDecimal precoDiaria;

    @ManyToOne(targetEntity = Propriedade.class)
    @JoinColumn(name = "propriedadeID")
    private Propriedade propriedade;


    /* Construtores */
    public Quarto() {
    }

    public Quarto(long id, int numQuarto, QuartoCategoria categoria,
            QuartoStatus status, int qtdCamaCasal, int qtdCamaSolteiro, int capacidade, BigDecimal precoDiaria,
            Propriedade propriedade) {
        this.id = id;
        this.dataCriacao = new Date();
        this.ultimaAtualizacao = new Date();
        this.numQuarto = numQuarto;
        this.categoria = categoria;
        this.status = status;
        this.qtdCamaCasal = qtdCamaCasal;
        this.qtdCamaSolteiro = qtdCamaSolteiro;
        this.capacidade = capacidade;
        this.precoDiaria = precoDiaria;
        this.propriedade = propriedade;
    }

    public Quarto(long id, int numQuarto, QuartoCategoria categoria, QuartoStatus status, int capacidade,
            BigDecimal precoDiaria, Propriedade propriedade) {
        this.id = id;
        this.dataCriacao = new Date();
        this.ultimaAtualizacao = new Date();
        this.numQuarto = numQuarto;
        this.categoria = categoria;
        this.status = status;
        this.qtdCamaCasal = 0;
        this.qtdCamaSolteiro = 0;
        this.capacidade = capacidade;
        this.precoDiaria = precoDiaria;
        this.propriedade = propriedade;
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

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public QuartoCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(QuartoCategoria categoria) {
        this.categoria = categoria;
    }

    public QuartoStatus getStatus() {
        return status;
    }

    public void setStatus(QuartoStatus status) {
        this.status = status;
    }

    public int getQtdCamaCasal() {
        return qtdCamaCasal;
    }

    public void setQtdCamaCasal(int qtdCamaCasal) {
        this.qtdCamaCasal = qtdCamaCasal;
    }

    public int getQtdCamaSolteiro() {
        return qtdCamaSolteiro;
    }

    public void setQtdCamaSolteiro(int qtdCamaSolteiro) {
        this.qtdCamaSolteiro = qtdCamaSolteiro;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public BigDecimal getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(BigDecimal precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public Propriedade getPropriedade() {
        return propriedade;
    }

    public void setPropriedade(Propriedade propriedade) {
        this.propriedade = propriedade;
    }

    /* hashCode and equals */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
        result = prime * result + numQuarto;
        result = prime * result + ((propriedade == null) ? 0 : propriedade.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
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
        Quarto other = (Quarto) obj;
        if (categoria != other.categoria)
            return false;
        if (numQuarto != other.numQuarto)
            return false;
        if (propriedade == null) {
            if (other.propriedade != null)
                return false;
        } else if (!propriedade.equals(other.propriedade))
            return false;
        if (status != other.status)
            return false;
        return true;
    }

    /* toString */
    @Override
    public String toString() {
        return "Quarto [capacidade=" + capacidade + ", numQuarto=" + numQuarto + ", precoDiaria=" + precoDiaria
                + ", propriedade=" + propriedade + ", status=" + status + "]";
    }
    
}
