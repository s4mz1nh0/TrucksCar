package dados.entidades;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Servicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Servicos; 
   private String tiposDeLavagem;

    public Integer getId_Servicos() {
        return id_Servicos;
    }

    public void setId_Servicos(Integer id_Servicos) {
        this.id_Servicos = id_Servicos;
    }

    public String getTiposDeLavagem() {
        return tiposDeLavagem;
    }

    public void setTiposDeLavagem(String TiposDeLavagem) {
        this.tiposDeLavagem = TiposDeLavagem;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id_Servicos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Servicos other = (Servicos) obj;
        if (!Objects.equals(this.id_Servicos, other.id_Servicos)) {
            return false;
        }
        return true;
    }
   
    
    
}
