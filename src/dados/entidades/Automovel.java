package dados.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Automovel {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Automovel;
    
    private String porteDoAutomovel;
     
    @ManyToOne(optional=false)
    private Servicos servicos;
    
    
    @ManyToMany
    private Set<Cliente> clientes = new HashSet<Cliente>();

    
    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    
    public Integer getId_Automovel() {
        return id_Automovel;
    }

    public void setId_Automovel(Integer id_Automovel) {
        this.id_Automovel = id_Automovel;
    }

    public String getPorteDoAutomovel() {
        return porteDoAutomovel;
    }

    public void setPorteDoAutomovel(String porteDoAutomovel) {
        this.porteDoAutomovel = porteDoAutomovel;
    }

    public Servicos getServicos() {
        return servicos;
    }

    public void setServicos(Servicos servicos) {
        this.servicos = servicos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id_Automovel);
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
        final Automovel other = (Automovel) obj;
        if (!Objects.equals(this.id_Automovel, other.id_Automovel)) {
            return false;
        }
        return true;
    }

    public void setCliente(String luis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setServicos(String ducha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
