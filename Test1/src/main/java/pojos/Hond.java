package pojos;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="Hond")
public class Hond {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	int id;
	
	
	String naam;

	
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

	
	
	
}
