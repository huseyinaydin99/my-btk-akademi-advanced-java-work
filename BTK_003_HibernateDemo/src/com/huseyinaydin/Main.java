package com.huseyinaydin;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(City.class)
				.buildSessionFactory();
		//bu session Unit of Work tasarým þablonudur zaten.
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		// List<City> cities = session.createQuery("from City c where
		// c.countryCode='TUR' AND c.district='Ankara'").getResultList();
		// List<City> cities = session.createQuery("from City c where c.countryCode LIKE
		// '%kar%'").getResultList();
		// List<City> cities = session.createQuery("from City c where c.countryCode LIKE
		// 'kar%'").getResultList();
		// List<City> cities = session.createQuery("from City c where c.countryCode LIKE
		// '%kar'").getResultList();
		// ASC Ascending(yükselerek giden sýralama(azdan çoða a dan z'ye))
		// DESC Descending(Azalarak giden sýralama(çoktan aza z den a^'ya))
		// List<City> cities = session.createQuery("from City c ORDER BY c.name
		// ASC").getResultList();
		//List<String> countryCode = session.createQuery("select c.countryCode from City c GROUP BY c.countryCode").getResultList();
		/*City city = new City("Duzce 10", "TUR", "Karadeniz", 10000);
		session.save(city);*/
		/*City city = session.get(City.class, 4086);
		city.setPopulation(11000);
		session.update(city);*/
		City city = session.get(City.class, 4086);
		session.delete(city);
		session.getTransaction().commit();
		System.out.println("kayýt silindi");
		/*
		 * for (City city : cities) { System.out.println(city); }
		 */
		/*for (String s : countryCode) {
			System.out.println(s);
		}*/
		session.close();
		sessionFactory.close();
	}

}
