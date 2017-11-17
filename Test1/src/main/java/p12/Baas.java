package p12;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;




@Entity(name="Baas")
public class Baas {

	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	int id;
	
	@Column(length= 30, nullable = false)
	String naam;
	
	String hobby;

	
	
	@JoinColumn(name="id_hond")
	@OneToOne
	Hond hond1;

	
	
	public Baas() {
	}
	



	public Baas(int id, String naam, String hobby) {
		this.id = id;
		this.naam = naam;
		this.hobby = hobby;
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
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}




	public Hond getHond() {
		return hond1;
	}




	public void setHond(Hond hond) {
		this.hond1 = hond;
	}




	@Override
	public String toString() {
		return "Baas [id=" + id + ", naam=" + naam + ", hobby=" + hobby + ", hond=" + hond1 + "]";
	}
	






	
}
