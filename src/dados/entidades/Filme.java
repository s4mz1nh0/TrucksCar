package dados.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Filme {
  
    private Integer id;
    private String nome;
    private LocalDate dataDeLancamento;
    private BigDecimal arrecadacao;
    private Genero genero;
    private ArrayList<Ator> atores;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public BigDecimal getArrecadacao() {
        return arrecadacao;
    }

    public void setArrecadacao(BigDecimal arrecadacao) {
        this.arrecadacao = arrecadacao;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public ArrayList<Ator> getAtores() {
        return atores;
    }

    public void setAtores(ArrayList<Ator> atores) {
        this.atores = atores;
    }
    
    
    
}
