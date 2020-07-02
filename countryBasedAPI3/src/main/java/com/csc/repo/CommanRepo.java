package com.csc.repo;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.csc.entity.CityEntity;
import com.csc.entity.Comman;
import com.csc.entity.CommanEntity;



@Repository("commanRepository")
public interface CommanRepo extends CrudRepository<Comman, Integer> {

    @Query("select new com.csc.entity.CommanEntity(comman_id,cmn) from Comman where city.id = :id")
    public List<CommanEntity> findByComman(@Param("id") int id);
}