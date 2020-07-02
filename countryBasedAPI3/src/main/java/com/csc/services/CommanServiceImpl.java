package com.csc.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc.entity.CityEntity;
import com.csc.entity.CommanEntity;
import com.csc.repo.CityRepo;
import com.csc.repo.CommanRepo;



@Service("commanService")
public  class CommanServiceImpl implements CommanService {

    @Autowired
    private CommanRepo commanRepository;
    
    @Override
    public List<CommanEntity> findByComman(int id) {
        return commanRepository.findByComman(id);
    }
  

}