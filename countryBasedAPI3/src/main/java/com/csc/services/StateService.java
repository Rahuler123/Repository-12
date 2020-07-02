package com.csc.services;
import java.util.List;

import com.csc.entity.StateEntity;
import com.google.gson.JsonElement;


public interface StateService {

	//public List<StateEntity> findAll();

	public List<StateEntity> findByCountry(int id);

}