package com.huseyinaydin.services;

import java.util.List;

import com.huseyinaydin.model.City;

public interface ICityService {
	List<City> getCities();
	void addCity(City city);
	void updateCity(City city);
	void deleteCity(City city);
	City getCityById(int id);
}
