package pojos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.mycompany_hibernateBegin_jar_1.0-SNAPSHOTPU");
		EntityManager em = entityManagerFactory.createEntityManager();

		em.getTransaction().begin();
		
		Baas baas = new Baas(0, "steef", "Gitaar");
		em.persist(baas);		
		em.getTransaction().commit();
		
		Baas b = em.find(Baas.class, 1);
System.out.println("Eeste keer baas b"+b);
		em.getTransaction().begin();
		em.remove(b);
		em.getTransaction().commit();

		Baas b1 = em.find(Baas.class, 1);

	
	
		System.out.println("B1 :"+b1);
		System.out.println("B :"+b);
		em.close();
		
		System.out.println(" na emclose B :"+b);
		System.exit(0);
	}

}
