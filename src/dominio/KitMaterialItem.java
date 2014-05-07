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
@Table(name="kit_material_item")
public class KitMaterialItem {
	
	@Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private int quantidade;
	
	@ManyToOne
    @JoinColumn(name="kit_material_id")
    private KitMaterial kitMaterial = new KitMaterial();
	
	@ManyToOne
    @JoinColumn(name="material_id")
    private Material Material = new Material();

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

	public KitMaterial getKitMaterial() {
		return kitMaterial;
	}

	public void setKitMaterial(KitMaterial kitMaterial) {
		this.kitMaterial = kitMaterial;
	}

	public Material getMaterial() {
		return Material;
	}

	public void setMaterial(Material material) {
		Material = material;
	}
	
	

}
