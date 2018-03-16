package p12;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;
import org.hibernate.Session;

import java.lang.reflect.ParameterizedType;
import java.util.List;
public class GenericDao<T> {

	private final Class<T> persistentClass;

	EntityManagerFactory entityfactory;

	public GenericDao(Class<T> persistentClass, EntityManagerFactory emf) {
		this.persistentClass = persistentClass;
		entityfactory = emf;
	}






	public void add(T pojo){
		EntityManager em = entityfactory.createEntityManager();



		em.getTransaction().begin();
		em.persist(pojo);
		em.getTransaction().commit();
		em.clear();
		em.close();

	}

	public T read(int i){
		EntityManager em = entityfactory.createEntityManager();
		System.out.println("In read");
		System.out.println(persistentClass);

		T result = (T) em.find(persistentClass, i);
		em.close();
		return result;

	}



	public T readBykey(int id) {
		EntityManager em = entityfactory.createEntityManager();

		Session session = em.unwrap(Session.class);

		Query query = session.createQuery("from " +persistentClass.getName()+" i Where i.id = " +id); 

		T result = (T) query.getSingleResult();
		em.close();
		return result;
	}
	
	public T readByForeignkey(int id) {
		EntityManager em = entityfactory.createEntityManager();

		Session session = em.unwrap(Session.class);

		Query query = session.createQuery("from " +persistentClass.getName()+" i Where i.hond1 = " +id); 

		T result = (T) query.getSingleResult();
		em.close();
		return result;
	}


}
