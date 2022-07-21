package epd;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import epd.model.Person;

public class AddItems {
	@PersistenceContext
	protected static EntityManager em;

	public static void main(String[] args) {

//		EntityManagerFactory emf = Persistence
//				.createEntityManagerFactory("org.eclipse.persistence.jpa.PersistenceProvider");

//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("epdMysql");

//		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();

		Person p = new Person();
		p.setPersonId(1);
		p.setFirstName("aa");
		p.setLastName("bb");
		p.setFriends("cc");

		em.persist(p);
		em.getTransaction().commit();
		em.close();

	}
}
