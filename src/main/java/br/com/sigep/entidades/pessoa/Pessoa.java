package br.com.sigep.entidades.pessoa;

import java.io.Serializable;
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
//import javax.persistence.Transient;
import javax.persistence.Version;

import br.com.sigep.entidades.endereco.Endereco;

@Entity
@Table(name = "Pessoas")
public class Pessoa implements Serializable {
    /* Atributos */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Version
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaAtualizacao;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "apelido", length = 50, nullable = true)
    private String apelido;
    
    @Column(name = "cpf", length = 11, nullable = false, unique = true)
    private String cpf;

    @Enumerated(EnumType.STRING)
    private PessoaTipo tipo;

    @Column(name = "telefone", length = 25, nullable = true)
    private String telefone;

    @ManyToOne(targetEntity = Endereco.class)
    @JoinColumn(name = "enderecoID")
    private Endereco endereco;

    @Temporal(TemporalType.DATE)
    private Date dataNasc;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    @Column(name = "email", length = 50, nullable = false, unique = true)
    private String email;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "isAtivo", nullable = false)
    private boolean isAtivo;


    /* Construtores */
    public Pessoa() {
        this(0, "", "");
    }
    
    public Pessoa(long id, String email, String nome) {
        this.id = id;
        this.dataCriacao = new Date();
        this.ultimaAtualizacao = new Date();
        this.nome = nome;
        this.apelido = "";
        this.cpf = "";
        this.tipo = null;
        this.telefone = null;
        this.endereco = null;
        this.dataNasc = null;
        this.genero = Genero.NaoInformado;
        this.email = email;
        this.senha = "";
        this.isAtivo = true;
    }

    public Pessoa(long id, String nome, String apelido, String cpf,
            PessoaTipo tipo, String telefone, Endereco endereco, Date dataNasc, Genero genero, String email,
            String senha) {
        this.id = id;
        this.dataCriacao = new Date();
        this.ultimaAtualizacao = new Date();
        this.nome = nome;
        this.apelido = apelido;
        this.cpf = cpf;
        this.tipo = tipo;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
        this.genero = genero;
        this.email = email;
        this.senha = senha;
        this.isAtivo = true;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PessoaTipo getTipo() {
        return tipo;
    }

    public void setTipo(PessoaTipo tipo) {
        this.tipo = tipo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAtivo() {
        return isAtivo;
    }

    public void setAtivo(boolean isAtivo) {
        this.isAtivo = isAtivo;
    }
    
    /* hashCode and equals */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apelido == null) ? 0 : apelido.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((dataNasc == null) ? 0 : dataNasc.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((senha == null) ? 0 : senha.hashCode());
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
        Pessoa other = (Pessoa) obj;
        if (apelido == null) {
            if (other.apelido != null)
                return false;
        } else if (!apelido.equals(other.apelido))
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        if (dataNasc == null) {
            if (other.dataNasc != null)
                return false;
        } else if (!dataNasc.equals(other.dataNasc))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (endereco == null) {
            if (other.endereco != null)
                return false;
        } else if (!endereco.equals(other.endereco))
            return false;
        if (genero != other.genero)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (senha == null) {
            if (other.senha != null)
                return false;
        } else if (!senha.equals(other.senha))
            return false;
        if (telefone == null) {
            if (other.telefone != null)
                return false;
        } else if (!telefone.equals(other.telefone))
            return false;
        if (tipo != other.tipo)
            return false;
        return true;
    }
    

    /* toString */
    @Override
    public String toString() {
        return "Pessoa [apelido=" + apelido + ", cpf=" + cpf + ", email=" + email + ", nome=" + nome + ", tipo=" + tipo + "]";
    }

    
}
