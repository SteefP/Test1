package p12;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Application {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = entityManagerFactory.createEntityManager();

		Hond hond = new Hond(0, "Mickey");
		

		GenericDao<Hond> honddao = new GenericDao<Hond>(em);
		honddao.add(hond);
		
		Baas baas = new Baas(0, "steef", "Gitaar");
		baas.setHond(hond);
		GenericDao<Baas> baasdao = new GenericDao<Baas>(em);
		baasdao.add(baas);
		
		
		

		em.close();
		

/*

	

		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = entityManagerFactory.createEntityManager();

		em.getTransaction().begin();
		Baas baas = new Baas(0, "steef", "Gitaar");
		Hond hond = new Hond(0, "Mickey");

		hond.setBaas(baas);



		em.persist(hond);	
		em.persist(baas);


		em.getTransaction().commit();

		em.clear();

		Hond h = em.find(Hond.class, 1);
		Baas b =em.find(Baas.class, 1);

		System.out.println(b.getHond());
		System.out.println(h.getBaas());

		em.close();
		System.exit(0);

		 */
	}

}
/*

 * 
 * Baas baas = new Baas(0, "steef", "Gitaar");

		Baas baas2 = new Baas(0, "Julia", "Kite");

		Hond hond = new Hond(0, "Mickey");
		Hond hond2 = new Hond(0, "Maickey");

		baas2.getHonden().add(hond);
		baas2.getHonden().add(hond);
		baas2.getHonden().add(hond2);
		baas.getHonden().add(hond2);
		em.persist(hond);
		em.persist(hond2);
		em.persist(baas);
		em.persist(baas2);	
 * 
 * 
 */











