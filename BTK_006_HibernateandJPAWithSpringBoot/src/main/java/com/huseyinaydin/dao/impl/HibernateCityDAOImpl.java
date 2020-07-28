package com.huseyinaydin.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.huseyinaydin.dao.ICityDAO;
import com.huseyinaydin.model.City;

@Repository
@Transactional
public class HibernateCityDAOImpl implements ICityDAO {
	
	@Autowired
	private EntityManager entityManager;
	
	public HibernateCityDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	
	@Override
	public List<City> getCities() {
		Session session = this.entityManager.unwrap(Session.class);
		return session.createQuery("from City").getResultList();
	}

	@Override
	public void addCity(City city) {
		Session session = this.entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
	}

	@Override
	public void updateCity(City city) {
		Session session = this.entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
	}

	@Override
	public void deleteCity(City city) {
		Session session = this.entityManager.unwrap(Session.class);
		session.delete(city);
	}


	@Override
	public City getCityById(int id) {
		Session session = this.entityManager.unwrap(Session.class);
		/*List<City> cities = session.createQuery("from City c where c.ID=" + id).getResultList();
		return cities.get(0);*/
		return session.get(City.class, id);
	}
}
