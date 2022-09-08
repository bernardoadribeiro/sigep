package br.com.sigep.entidades.financeiro;

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
@Table(name = "FinanceiroDespesas")
public class FinanceiroDespesas  implements Serializable{
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
    private Date dataDespesa;

    @Enumerated(EnumType.STRING)
    private FinanceiroDespesasMotivo motivoDespesa;

    @Column(name = "valor", nullable = false)
    private BigDecimal valor;

    @Column(name = "totalPago")
    private BigDecimal totalPago;

    @Enumerated(EnumType.STRING)
    private PagamentoForma formaPagamento;

    @Column(name = "comprovantePagamento")
    private String comprovantePagamento;

    @Enumerated(EnumType.STRING)
    private FinanceiroDespesasStatus statusPagamento;

    @Column(name = "comentario")
    private String comentario;

    /* Construtores */
    public FinanceiroDespesas() {
    }

    public FinanceiroDespesas(long id, Date dataDespesa, FinanceiroDespesasMotivo motivoDespesa, BigDecimal valor, 
            BigDecimal totalPago, PagamentoForma formaPagamento, String comprovantePagamento, 
            FinanceiroDespesasStatus statusPagamento, String comentario) {
        this.id = id;
        this.dataCriacao = new Date();
        this.ultimaAtualizacao = new Date();
        this.dataDespesa = dataDespesa;
        this.motivoDespesa = motivoDespesa;
        this.valor = valor;
        this.totalPago = totalPago;
        this.formaPagamento = formaPagamento;
        this.comprovantePagamento = comprovantePagamento;
        this.statusPagamento = statusPagamento;
        this.comentario = comentario;
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

    public Date getDataDespesa() {
        return dataDespesa;
    }

    public void setDataDespesa(Date dataDespesa) {
        this.dataDespesa = dataDespesa;
    }

    public FinanceiroDespesasMotivo getMotivoDespesa() {
        return motivoDespesa;
    }

    public void setMotivoDespesa(FinanceiroDespesasMotivo motivoDespesa) {
        this.motivoDespesa = motivoDespesa;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(BigDecimal totalPago) {
        this.totalPago = totalPago;
    }

    public PagamentoForma getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(PagamentoForma formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getComprovantePagamento() {
        return comprovantePagamento;
    }

    public void setComprovantePagamento(String comprovantePagamento) {
        this.comprovantePagamento = comprovantePagamento;
    }

    public FinanceiroDespesasStatus getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(FinanceiroDespesasStatus statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }


    /* hashCode and equals */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((comentario == null) ? 0 : comentario.hashCode());
        result = prime * result + ((comprovantePagamento == null) ? 0 : comprovantePagamento.hashCode());
        result = prime * result + ((dataCriacao == null) ? 0 : dataCriacao.hashCode());
        result = prime * result + ((dataDespesa == null) ? 0 : dataDespesa.hashCode());
        result = prime * result + ((formaPagamento == null) ? 0 : formaPagamento.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((motivoDespesa == null) ? 0 : motivoDespesa.hashCode());
        result = prime * result + ((statusPagamento == null) ? 0 : statusPagamento.hashCode());
        result = prime * result + ((totalPago == null) ? 0 : totalPago.hashCode());
        result = prime * result + ((ultimaAtualizacao == null) ? 0 : ultimaAtualizacao.hashCode());
        result = prime * result + ((valor == null) ? 0 : valor.hashCode());
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
        FinanceiroDespesas other = (FinanceiroDespesas) obj;
        if (comentario == null) {
            if (other.comentario != null)
                return false;
        } else if (!comentario.equals(other.comentario))
            return false;
        if (comprovantePagamento == null) {
            if (other.comprovantePagamento != null)
                return false;
        } else if (!comprovantePagamento.equals(other.comprovantePagamento))
            return false;
        if (dataCriacao == null) {
            if (other.dataCriacao != null)
                return false;
        } else if (!dataCriacao.equals(other.dataCriacao))
            return false;
        if (dataDespesa == null) {
            if (other.dataDespesa != null)
                return false;
        } else if (!dataDespesa.equals(other.dataDespesa))
            return false;
        if (formaPagamento != other.formaPagamento)
            return false;
        if (id != other.id)
            return false;
        if (motivoDespesa != other.motivoDespesa)
            return false;
        if (statusPagamento != other.statusPagamento)
            return false;
        if (totalPago == null) {
            if (other.totalPago != null)
                return false;
        } else if (!totalPago.equals(other.totalPago))
            return false;
        if (ultimaAtualizacao == null) {
            if (other.ultimaAtualizacao != null)
                return false;
        } else if (!ultimaAtualizacao.equals(other.ultimaAtualizacao))
            return false;
        if (valor == null) {
            if (other.valor != null)
                return false;
        } else if (!valor.equals(other.valor))
            return false;
        return true;
    }


    /* toString */
    @Override
    public String toString() {
        return "FinanceiroDespesas [comprovantePagamento=" + comprovantePagamento + ", dataDespesa=" + dataDespesa
                + ", formaPagamento=" + formaPagamento + ", motivoDespesa=" + motivoDespesa + ", statusPagamento="
                + statusPagamento + ", totalPago=" + totalPago + ", valor=" + valor + "]";
    }

}
