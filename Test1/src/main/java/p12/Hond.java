package p12;


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

	@OneToOne(mappedBy="hond1") //hiermee verwijderd zich de baas id in hond! wél kan de baas worden beriket van de hond
	Baas baas;     //je schakeld dus eigenlijk een overbodige link uit omdat sql al bi-dirext is
	
	
	
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
	@Override
	public String toString() {
		return "Hond [id=" + id + ", naam=" + naam + "]";
	}
	public Baas getBaas() {
		return baas;
	}
	public void setBaas(Baas baas) {
		this.baas = baas;
	}

	
	
	
	
	
	
}
