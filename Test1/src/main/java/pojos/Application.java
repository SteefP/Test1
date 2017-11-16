package pojos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = entityManagerFactory.createEntityManager();

		em.getTransaction().begin();

		Baas baas = new Baas(0, "steef", "Gitaar");
		Hond hond = new Hond(0, "Mickey");
		baas.setHond(hond);
em.persist(hond);
		em.persist(baas);		
		em.getTransaction().commit();

		Baas b = em.find(Baas.class, 1);
		System.out.println("Eeste keer baas b"+b);
		
		






		em.close();


		System.exit(0);
	}

}
