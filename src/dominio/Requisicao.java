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
@Table(name="requisicao")
public class Requisicao {
	
	@Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private Date dataRequisicao;
	
	private int situacao;
	
	@ManyToOne
    @JoinColumn(name="almoxarifado_requisitante_id")
    private Almoxarifado almoxarifado = new Almoxarifado();
	
	@OneToMany(mappedBy="id", cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Requisicao> requisicao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataRequisicao() {
		return dataRequisicao;
	}

	public void setDataRequisicao(Date dataRequisicao) {
		this.dataRequisicao = dataRequisicao;
	}

	public int getSituacao() {
		return situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	public Almoxarifado getAlmoxarifado() {
		return almoxarifado;
	}

	public void setAlmoxarifado(Almoxarifado almoxarifado) {
		this.almoxarifado = almoxarifado;
	}
	
	

}
