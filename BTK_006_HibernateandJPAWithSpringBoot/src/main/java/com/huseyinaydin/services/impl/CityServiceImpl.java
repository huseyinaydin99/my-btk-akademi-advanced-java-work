package com.huseyinaydin.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huseyinaydin.dao.ICityDAO;
import com.huseyinaydin.model.City;
import com.huseyinaydin.services.ICityService;

@Service //servis katmanı aslında iş katmanıdır. kontrollerimizi biz burada gerçekleştiririz.
@Transactional
public class CityServiceImpl implements ICityService {
	
	@Autowired
	private ICityDAO cityDAO;

	public CityServiceImpl(ICityDAO cityDAO) {
		super();
		this.cityDAO = cityDAO;
	}

	@Override
	public List<City> getCities() {
		// TODO Auto-generated method stub
		return this.cityDAO.getCities();
	}

	@Override
	public void addCity(City city) {
		this.cityDAO.addCity(city);
	}

	@Override
	public void updateCity(City city) {
		this.cityDAO.updateCity(city);
	}

	@Override
	public void deleteCity(City city) {
		this.cityDAO.deleteCity(city);
	}

	@Override
	public City getCityById(int id) {
		return this.cityDAO.getCityById(id);
	}
}
