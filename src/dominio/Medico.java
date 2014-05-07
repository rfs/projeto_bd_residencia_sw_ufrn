package dominio;

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
@Table(name="medico")
public class Medico {
	
	@Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String nome;
	
	@ManyToOne
    @JoinColumn(name="especialidade_id")
    private Especialidade especialidade = new Especialidade();
	
	@OneToMany(mappedBy="id", cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<AgendaExame> agendaExame;
	
	@OneToMany(mappedBy="id", cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<ContaMedica> contaMedica; 
	
	@OneToMany(mappedBy="id", cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<LaudoExame> laudoExame; 
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	
	

}
