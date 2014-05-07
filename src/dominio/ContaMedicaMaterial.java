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
@Table(name="conta_medica_material")
public class ContaMedicaMaterial {
	
	@Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private int quantidade;
	private double valorUnitario;
	
	@ManyToOne
    @JoinColumn(name="conta_medica_id")
    private ContaMedica contaMedica = new ContaMedica();
	
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

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public ContaMedica getContaMedica() {
		return contaMedica;
	}

	public void setContaMedica(ContaMedica contaMedica) {
		this.contaMedica = contaMedica;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}
	
	

}
