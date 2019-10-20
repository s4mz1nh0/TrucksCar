package dados.entidades;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author THAIS & SAMUEL
 */
@Entity
public class Agendamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Agendamento;
    
    private LocalDateTime reserva;
    
    @ManyToOne (optional = false)
    private Cliente cliente;

    public Integer getId_Agendamento() {
        return id_Agendamento;
    }

    public void setId_Agendamento(Integer id_Agendamento) {
        this.id_Agendamento = id_Agendamento;
    }

    public LocalDateTime getReserva() {
        return reserva;
    }

    public void setReserva(LocalDateTime reserva) {
        this.reserva = reserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id_Agendamento);
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
        final Agendamento other = (Agendamento) obj;
        if (!Objects.equals(this.id_Agendamento, other.id_Agendamento)) {
            return false;
        }
        return true;
    }
    
    
}