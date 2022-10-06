package br.com.sigep.entidades.quarto;

public enum QuartoStatus {
    Disponivel("Disponível"),
    Reservado("Reservado"),
    Bloqueado("Bloqueado"),
    Inativo("Inativo");

    private String descricao;

    private QuartoStatus(String descricao) {
        this.descricao = descricao;	
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
