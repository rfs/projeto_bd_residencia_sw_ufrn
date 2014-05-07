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
@Table(name="laudo_exame")
public class LaudoExame {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date dataEmaissao;
	
	private String texto;
	
	@ManyToOne
    @JoinColumn(name="tipo_exame_id")
    private TipoExame tipoExame = new TipoExame();
	
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

	public Date getDataEmaissao() {
		return dataEmaissao;
	}

	public void setDataEmaissao(Date dataEmaissao) {
		this.dataEmaissao = dataEmaissao;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public TipoExame getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(TipoExame tipoExame) {
		this.tipoExame = tipoExame;
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
