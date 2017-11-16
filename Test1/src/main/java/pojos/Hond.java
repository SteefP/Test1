package pojos;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;


@Entity(name="Hond")
public class Hond {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	int id;
		
	String naam;

	
	@ManyToOne(fetch= FetchType.LAZY)
	Baas baas;
	
	
	public Hond() {
	}
	public Hond(int id, String naam) {
		this.id = id;
		this.naam = naam;
	}

	
	public int getId() {
		return id;
	}
	public String getNaam() {
		return naam;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}

	
	
	public Baas getBaas() {
		return baas;
	}
	public void setBaas(Baas baas) {
		this.baas = baas;
	}
	@Override
	public String toString() {
		return "Hond [id=" + id + ", naam=" + naam + ", baas=" + baas + "]";
	}

	
	
	
}
