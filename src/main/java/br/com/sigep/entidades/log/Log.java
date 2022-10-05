package br.com.sigep.entidades.log;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.sigep.entidades.pessoa.Pessoa;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Log {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private LogNivel nivel;

    @ManyToOne
    private Pessoa pessoa;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHora;

    private String acao;

    private String detalhes;

    public Log() {
        this.id = 0L;
        this.dataHora = new Date();
        this.nivel = LogNivel.Informacao;
        this.pessoa = null;
        this.acao = "";
        this.detalhes = "";
    }

    public Log(LogNivel nivel, Pessoa usuario, String acao, String detalhes) {
        this();
        this.nivel = nivel;
        this.pessoa = pessoa;
        this.acao = acao;
        this.detalhes = detalhes;
    }

    


}
