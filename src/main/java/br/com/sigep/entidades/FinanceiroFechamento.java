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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "FinanceiroFechamento")
public class FinanceiroFechamento implements Serializable {
    /* Atributos */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Version
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaAtualizacao;

    @Temporal(TemporalType.DATE)
    private Date dataReferencia;

    @Column(name = "faturamentoReservas")
    private BigDecimal faturamentoReservas;

    @Column(name = "receitaReservas")
    private BigDecimal receitaReservas;

    @Column(name = "faturamentoVendas")
    private BigDecimal faturamentoVendas;

    @Column(name = "receitaVendas")
    private BigDecimal receitaVendas;

    @Column(name = "despesas")
    private BigDecimal despesas;

    @Column(name = "saldoInicial")
    private BigDecimal saldoInicial;

    @Column(name = "saldoFinal")    
    private BigDecimal saldoFinal;

    @Enumerated(EnumType.STRING)
    public FinanceiroFechamentoStatus statusFechamento;

    /* Construtores */
    public FinanceiroFechamento(long id, Date dataReferencia,
            BigDecimal faturamentoReservas, BigDecimal receitaReservas, BigDecimal faturamentoVendas,
            BigDecimal receitaVendas, BigDecimal despesas, BigDecimal saldoInicial, BigDecimal saldoFinal,
            FinanceiroFechamentoStatus statusFechamento) {
        this.id = id;
        this.dataCriacao = new Date();
        this.ultimaAtualizacao = new Date();
        this.dataReferencia = dataReferencia;
        this.faturamentoReservas = faturamentoReservas;
        this.receitaReservas = receitaReservas;
        this.faturamentoVendas = faturamentoVendas;
        this.receitaVendas = receitaVendas;
        this.despesas = despesas;
        this.saldoInicial = saldoInicial;
        this.saldoFinal = saldoFinal;
        this.statusFechamento = statusFechamento;
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

    public Date getDataReferencia() {
        return dataReferencia;
    }

    public void setDataReferencia(Date dataReferencia) {
        this.dataReferencia = dataReferencia;
    }

    public BigDecimal getFaturamentoReservas() {
        return faturamentoReservas;
    }

    public void setFaturamentoReservas(BigDecimal faturamentoReservas) {
        this.faturamentoReservas = faturamentoReservas;
    }

    public BigDecimal getReceitaReservas() {
        return receitaReservas;
    }

    public void setReceitaReservas(BigDecimal receitaReservas) {
        this.receitaReservas = receitaReservas;
    }

    public BigDecimal getFaturamentoVendas() {
        return faturamentoVendas;
    }

    public void setFaturamentoVendas(BigDecimal faturamentoVendas) {
        this.faturamentoVendas = faturamentoVendas;
    }

    public BigDecimal getReceitaVendas() {
        return receitaVendas;
    }

    public void setReceitaVendas(BigDecimal receitaVendas) {
        this.receitaVendas = receitaVendas;
    }

    public BigDecimal getDespesas() {
        return despesas;
    }

    public void setDespesas(BigDecimal despesas) {
        this.despesas = despesas;
    }

    public BigDecimal getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(BigDecimal saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public BigDecimal getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(BigDecimal saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public FinanceiroFechamentoStatus getStatusFechamento() {
        return statusFechamento;
    }

    public void setStatusFechamento(FinanceiroFechamentoStatus statusFechamento) {
        this.statusFechamento = statusFechamento;
    }

    /* hashCode and equals */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dataReferencia == null) ? 0 : dataReferencia.hashCode());
        result = prime * result + ((despesas == null) ? 0 : despesas.hashCode());
        result = prime * result + ((faturamentoReservas == null) ? 0 : faturamentoReservas.hashCode());
        result = prime * result + ((faturamentoVendas == null) ? 0 : faturamentoVendas.hashCode());
        result = prime * result + ((receitaReservas == null) ? 0 : receitaReservas.hashCode());
        result = prime * result + ((receitaVendas == null) ? 0 : receitaVendas.hashCode());
        result = prime * result + ((saldoFinal == null) ? 0 : saldoFinal.hashCode());
        result = prime * result + ((saldoInicial == null) ? 0 : saldoInicial.hashCode());
        result = prime * result + ((statusFechamento == null) ? 0 : statusFechamento.hashCode());
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
        FinanceiroFechamento other = (FinanceiroFechamento) obj;
        if (dataReferencia == null) {
            if (other.dataReferencia != null)
                return false;
        } else if (!dataReferencia.equals(other.dataReferencia))
            return false;
        if (despesas == null) {
            if (other.despesas != null)
                return false;
        } else if (!despesas.equals(other.despesas))
            return false;
        if (faturamentoReservas == null) {
            if (other.faturamentoReservas != null)
                return false;
        } else if (!faturamentoReservas.equals(other.faturamentoReservas))
            return false;
        if (faturamentoVendas == null) {
            if (other.faturamentoVendas != null)
                return false;
        } else if (!faturamentoVendas.equals(other.faturamentoVendas))
            return false;
        if (receitaReservas == null) {
            if (other.receitaReservas != null)
                return false;
        } else if (!receitaReservas.equals(other.receitaReservas))
            return false;
        if (receitaVendas == null) {
            if (other.receitaVendas != null)
                return false;
        } else if (!receitaVendas.equals(other.receitaVendas))
            return false;
        if (saldoFinal == null) {
            if (other.saldoFinal != null)
                return false;
        } else if (!saldoFinal.equals(other.saldoFinal))
            return false;
        if (saldoInicial == null) {
            if (other.saldoInicial != null)
                return false;
        } else if (!saldoInicial.equals(other.saldoInicial))
            return false;
        if (statusFechamento != other.statusFechamento)
            return false;
        return true;
    }

    
    /* toString */
    @Override
    public String toString() {
        return "FinanceiroFechamento [dataCriacao=" + dataCriacao + ", dataReferencia=" + dataReferencia + ", despesas="
                + despesas + ", faturamentoReservas=" + faturamentoReservas + ", faturamentoVendas=" + faturamentoVendas
                + ", id=" + id + ", receitaReservas=" + receitaReservas + ", receitaVendas=" + receitaVendas
                + ", saldoFinal=" + saldoFinal + ", saldoInicial=" + saldoInicial + ", statusFechamento="
                + statusFechamento + ", ultimaAtualizacao=" + ultimaAtualizacao + "]";
    }
    
    
    
    



    
    
}
