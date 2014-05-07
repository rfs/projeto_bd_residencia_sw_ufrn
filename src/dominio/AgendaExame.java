package dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="agenda_exame")

public class AgendaExame {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date dataAgendada;
	
	//Mapeamento de relacionamentos muitos para um
	@ManyToOne
	//Informa nome da coluna chave estrangeira
	@JoinColumn(name="tipo_exame_id")
	private TipoExame tipoExame = new TipoExame();
	
	@ManyToOne
    @JoinColumn(name="paciente_id")
    private Paciente paciente = new Paciente();
	
	@ManyToOne
    @JoinColumn(name="convenio_id")
    private Convenio convenio = new Convenio();
	
	@ManyToOne
    @JoinColumn(name="medico_id")
    private Medico medico = new Medico();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TipoExame getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(TipoExame tipoExame) {
		this.tipoExame = tipoExame;
	}

	public Date getDataAgendada() {
		return dataAgendada;
	}

	public void setDataAgendada(Date dataAgendada) {
		this.dataAgendada = dataAgendada;
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
