package p12;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenericDao<T> {
	
	EntityManager em;
	
	public GenericDao(EntityManager em) {
		this.em = em;
	}





	public void add(T pojo){
		
		
		
		
		em.getTransaction().begin();
		em.persist(pojo);
		em.getTransaction().commit();
		em.clear();
	
	

	
	
		
	}
	
	
}
