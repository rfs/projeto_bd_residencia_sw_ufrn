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
@Table(name="material")
public class Material {
	
	@Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String nome;
	
	@ManyToOne
    @JoinColumn(name="unidade_medida_id")
    private UnidadeDeMedida unidade = new UnidadeDeMedida();
	
	@OneToMany(mappedBy="id", cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<ContaMedicaMaterial> contaMaterial;
	
	@OneToMany(mappedBy="id", cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Estoque> estoque;
	
	@OneToMany(mappedBy="id", cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Requisicao> requisicao;
	
	@OneToMany(mappedBy="id", cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<KitMaterialItem> kitItem;
	
	@OneToMany(mappedBy="id", cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MovEstoque> movEstoque;

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

	public UnidadeDeMedida getUnidade() {
		return unidade;
	}

	public void setUnidade(UnidadeDeMedida unidade) {
		this.unidade = unidade;
	}
	
	
}
