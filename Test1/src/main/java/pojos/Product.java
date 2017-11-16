package pojos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Product")
public class Product implements Serializable {




	@Id
	int id;
	String product_name;
	String product_description;
	
	
	
	public Product() {
	}

	

	public Product(int id, String product_name, String product_description) {
		this.id = id;
		this.product_name = product_name;
		this.product_description = product_description;
	}



	public int getId() {
		return id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", product_name=" + product_name + ", product_description=" + product_description
				+ "]";
	}
	
	

}
