package com.csc.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.csc.entity.State;
import com.csc.entity.StateEntity;
import com.csc.repo.StateRepo;


@Service("stateService")
public class StateServiceImpl implements StateService {

    @Autowired
    private StateRepo stateRepository;

    @Override
    public List<StateEntity> findByCountry(int id) {
        return stateRepository.findByCountry(id);
    }
    
    
//    @Override
//    public List<StateEntity> findAll() {
//        return stateRepository.findAll();
//    }
//  

}