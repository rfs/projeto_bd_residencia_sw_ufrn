package dominio;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name="conta_medica")
public class ContaMedica {
	
	@Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private Date dataEvento;
	
	@ManyToOne
    @JoinColumn(name="paciente_id")
    private Paciente paciente = new Paciente();
	
	@ManyToOne
    @JoinColumn(name="convenio_id")
    private Convenio convenio = new Convenio();
	
	@ManyToOne
    @JoinColumn(name="medico_id")
    private Medico medico = new Medico();
	
	@OneToMany(mappedBy="id", cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<ContaMedicaMaterial> contaMaterial; 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	
	
	
	
	

}
