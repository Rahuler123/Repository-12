package com.csc.services;
import java.util.List;

import com.csc.entity.CityEntity;
import com.csc.entity.CommanEntity;

public interface CommanService {

    public List<CommanEntity> findByComman(int id);

}