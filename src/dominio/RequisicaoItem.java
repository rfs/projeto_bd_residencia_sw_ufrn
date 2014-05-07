package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="requisicao_item")
public class RequisicaoItem {
	
	@Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private int quantidade;
	
	private int situacao;
	
	@ManyToOne
    @JoinColumn(name="requisicao_id")
    private Requisicao requisicao = new Requisicao();
	
	@ManyToOne
    @JoinColumn(name="material_id")
    private Material material = new Material();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getSituacao() {
		return situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	public Requisicao getRequisicao() {
		return requisicao;
	}

	public void setRequisicao(Requisicao requisicao) {
		this.requisicao = requisicao;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}
	
	

}
