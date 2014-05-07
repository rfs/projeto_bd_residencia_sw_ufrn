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
@Table(name="movimentacao_estoque")
public class MovEstoque {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date data_moviemto;
	
	private int quantidade;
	
	private int operacao;
	
	@ManyToOne
    @JoinColumn(name="almoxarifado_id")
    private Almoxarifado almoxarifado = new Almoxarifado();
	
	@ManyToOne
    @JoinColumn(name="material_id")
    private Material material = new Material();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData_moviemto() {
		return data_moviemto;
	}

	public void setData_moviemto(Date data_moviemto) {
		this.data_moviemto = data_moviemto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getOperacao() {
		return operacao;
	}

	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}

	public Almoxarifado getAlmoxarifado() {
		return almoxarifado;
	}

	public void setAlmoxarifado(Almoxarifado almoxarifado) {
		this.almoxarifado = almoxarifado;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}
	
	

}
