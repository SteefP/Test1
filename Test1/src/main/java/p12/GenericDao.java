package p12;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenericDao<T> {

	


	public void add(T pojo){
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = entityManagerFactory.createEntityManager();

		
		
		em.getTransaction().begin();
		em.persist(pojo);
		em.getTransaction().commit();
		em.clear();
	
	

		em.close();
	
		
	}
	
	
}
