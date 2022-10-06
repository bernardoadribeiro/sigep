package br.com.sigep.entidades.quarto;

public enum QuartoCategoria {
    Junior("Júnior"),
    Top("Top"),
    Master("Master");

    private String descricao;

    private QuartoCategoria(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }

    
}
