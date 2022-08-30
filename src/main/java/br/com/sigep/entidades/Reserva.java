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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "Reservas")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //Bloqueios e Reservas de quarto serao salvos na mesma tabela
public class Reserva implements Serializable {
    /* Atributos */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Version
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaAtualizacao;

    @Column(name = "codigo_reserva", nullable = false, unique = true)
    private String codigoReserva;

    @Temporal(TemporalType.DATE)
    private Date checkin;

    @Temporal(TemporalType.DATE)
    private Date checkout;

    @ManyToOne(targetEntity = Quarto.class)
    @JoinColumn(name = "quartoID")
    private Quarto quarto;

    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "hospedePrincipal")
    private Pessoa hospedePrincipal;

    @Enumerated(EnumType.STRING)
    private ReservaStatus statusReserva;

    @Column(name = "isVoucherEnviado")
    private boolean isVoucherEnviado;

    @Column(name = "valorReserva")
    private BigDecimal valorReserva;

    @Column(name = "valorTotal")
    private BigDecimal valorTotal;

    @Column(name = "totalPago")
    private BigDecimal totalPago;

    @Enumerated(EnumType.STRING)
    private PagamentoForma formaPagamento;

    @Enumerated(EnumType.STRING)
    private PagamentoStatus statusPagamento;

    @Column(name = "isBloqueio", nullable = false)
    private boolean isBloqueio;

    @Enumerated(EnumType.STRING)
    private ReservaMotivoBloqueio motivoBloqueio;

    @Column(name = "comentario")
    private String comentario;

    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "usuarioCriadorID")
    private Pessoa usuarioCriador;


    /* Construtores */
    public Reserva() {
    }
    
    //Construtor Reserva
    public Reserva(long id, String codigoReserva, Date checkin, Date checkout, Quarto quarto, Pessoa hospedePrincipal,
            BigDecimal valorReserva, BigDecimal valorTotal, BigDecimal totalPago, PagamentoForma formaPagamento,
            PagamentoStatus statusPagamento, String comentario, Pessoa usuarioCriador) {
        this.id = id;
        this.dataCriacao = new Date();
        this.ultimaAtualizacao = new Date();
        this.codigoReserva = codigoReserva;
        this.checkin = checkin;
        this.checkout = checkout;
        this.quarto = quarto;
        this.hospedePrincipal = hospedePrincipal;
        this.statusReserva = ReservaStatus.Realizada;
        this.isVoucherEnviado = false;
        this.valorReserva = valorReserva;
        this.valorTotal = valorTotal;
        this.totalPago = totalPago;
        this.formaPagamento = formaPagamento;
        this.statusPagamento = statusPagamento;
        this.isBloqueio = false;
        this.motivoBloqueio = null;
        this.comentario = comentario;
        this.usuarioCriador = usuarioCriador;
    }

    //Construtor Bloqueio
    public Reserva(long id, String codigoReserva, Date checkin, Date checkout,
            Quarto quarto, Pessoa hospedePrincipal, boolean isBloqueio, 
            ReservaMotivoBloqueio motivoBloqueio, String comentario, Pessoa usuarioCriador) {
        this.id = id;
        this.dataCriacao = new Date();
        this.ultimaAtualizacao = new Date();
        this.codigoReserva = codigoReserva;
        this.checkin = checkin;
        this.checkout = checkout;
        this.quarto = quarto;
        this.hospedePrincipal = hospedePrincipal;
        this.statusReserva = ReservaStatus.Realizada;
        this.isVoucherEnviado = false;
        this.valorReserva = null;
        this.valorTotal = null;
        this.totalPago = null;
        this.formaPagamento = null;
        this.statusPagamento = null;
        this.isBloqueio = true;
        this.motivoBloqueio = motivoBloqueio;
        this.comentario = comentario;
        this.usuarioCriador = usuarioCriador;
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

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Pessoa getHospedePrincipal() {
        return hospedePrincipal;
    }

    public void setHospedePrincipal(Pessoa hospedePrincipal) {
        this.hospedePrincipal = hospedePrincipal;
    }

    public ReservaStatus getStatusReserva() {
        return statusReserva;
    }

    public void setStatusReserva(ReservaStatus statusReserva) {
        this.statusReserva = statusReserva;
    }

    public boolean isVoucherEnviado() {
        return isVoucherEnviado;
    }

    public void setVoucherEnviado(boolean isVoucherEnviado) {
        this.isVoucherEnviado = isVoucherEnviado;
    }

    public BigDecimal getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(BigDecimal valorReserva) {
        this.valorReserva = valorReserva;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
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

    public PagamentoStatus getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(PagamentoStatus statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public boolean isBloqueio() {
        return isBloqueio;
    }

    public void setBloqueio(boolean isBloqueio) {
        this.isBloqueio = isBloqueio;
    }

    public ReservaMotivoBloqueio getMotivoBloqueio() {
        return motivoBloqueio;
    }

    public void setMotivoBloqueio(ReservaMotivoBloqueio motivoBloqueio) {
        this.motivoBloqueio = motivoBloqueio;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Pessoa getUsuarioCriador() {
        return usuarioCriador;
    }

    public void setUsuarioCriador(Pessoa usuarioCriador) {
        this.usuarioCriador = usuarioCriador;
    }


    /* hashCode and equals */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((checkin == null) ? 0 : checkin.hashCode());
        result = prime * result + ((checkout == null) ? 0 : checkout.hashCode());
        result = prime * result + ((codigoReserva == null) ? 0 : codigoReserva.hashCode());
        result = prime * result + ((comentario == null) ? 0 : comentario.hashCode());
        result = prime * result + ((dataCriacao == null) ? 0 : dataCriacao.hashCode());
        result = prime * result + ((formaPagamento == null) ? 0 : formaPagamento.hashCode());
        result = prime * result + ((hospedePrincipal == null) ? 0 : hospedePrincipal.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + (isBloqueio ? 1231 : 1237);
        result = prime * result + (isVoucherEnviado ? 1231 : 1237);
        result = prime * result + ((motivoBloqueio == null) ? 0 : motivoBloqueio.hashCode());
        result = prime * result + ((quarto == null) ? 0 : quarto.hashCode());
        result = prime * result + ((statusPagamento == null) ? 0 : statusPagamento.hashCode());
        result = prime * result + ((statusReserva == null) ? 0 : statusReserva.hashCode());
        result = prime * result + ((totalPago == null) ? 0 : totalPago.hashCode());
        result = prime * result + ((ultimaAtualizacao == null) ? 0 : ultimaAtualizacao.hashCode());
        result = prime * result + ((usuarioCriador == null) ? 0 : usuarioCriador.hashCode());
        result = prime * result + ((valorReserva == null) ? 0 : valorReserva.hashCode());
        result = prime * result + ((valorTotal == null) ? 0 : valorTotal.hashCode());
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
        Reserva other = (Reserva) obj;
        if (checkin == null) {
            if (other.checkin != null)
                return false;
        } else if (!checkin.equals(other.checkin))
            return false;
        if (checkout == null) {
            if (other.checkout != null)
                return false;
        } else if (!checkout.equals(other.checkout))
            return false;
        if (codigoReserva == null) {
            if (other.codigoReserva != null)
                return false;
        } else if (!codigoReserva.equals(other.codigoReserva))
            return false;
        if (comentario == null) {
            if (other.comentario != null)
                return false;
        } else if (!comentario.equals(other.comentario))
            return false;
        if (dataCriacao == null) {
            if (other.dataCriacao != null)
                return false;
        } else if (!dataCriacao.equals(other.dataCriacao))
            return false;
        if (formaPagamento != other.formaPagamento)
            return false;
        if (hospedePrincipal == null) {
            if (other.hospedePrincipal != null)
                return false;
        } else if (!hospedePrincipal.equals(other.hospedePrincipal))
            return false;
        if (id != other.id)
            return false;
        if (isBloqueio != other.isBloqueio)
            return false;
        if (isVoucherEnviado != other.isVoucherEnviado)
            return false;
        if (motivoBloqueio != other.motivoBloqueio)
            return false;
        if (quarto == null) {
            if (other.quarto != null)
                return false;
        } else if (!quarto.equals(other.quarto))
            return false;
        if (statusPagamento != other.statusPagamento)
            return false;
        if (statusReserva != other.statusReserva)
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
        if (usuarioCriador == null) {
            if (other.usuarioCriador != null)
                return false;
        } else if (!usuarioCriador.equals(other.usuarioCriador))
            return false;
        if (valorReserva == null) {
            if (other.valorReserva != null)
                return false;
        } else if (!valorReserva.equals(other.valorReserva))
            return false;
        if (valorTotal == null) {
            if (other.valorTotal != null)
                return false;
        } else if (!valorTotal.equals(other.valorTotal))
            return false;
        return true;
    }


    /* toString */
    @Override
    public String toString() {
        return "Reserva [checkin=" + checkin + ", checkout=" + checkout + ", codigoReserva=" + codigoReserva
                + ", comentario=" + comentario + ", dataCriacao=" + dataCriacao + ", formaPagamento=" + formaPagamento
                + ", hospedePrincipal=" + hospedePrincipal + ", id=" + id + ", isBloqueio=" + isBloqueio
                + ", isVoucherEnviado=" + isVoucherEnviado + ", motivoBloqueio=" + motivoBloqueio + ", quarto=" + quarto
                + ", statusPagamento=" + statusPagamento + ", statusReserva=" + statusReserva + ", totalPago="
                + totalPago + ", ultimaAtualizacao=" + ultimaAtualizacao + ", usuarioCriador=" + usuarioCriador
                + ", valorReserva=" + valorReserva + ", valorTotal=" + valorTotal + "]";
    }   
    
}
