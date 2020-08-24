package com.example.accesscounter.api.repository;

import com.example.accesscounter.api.entity.AccessCounterEntity;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface AccessCounterRepository extends CrudRepository<AccessCounterEntity,Integer> {

    @Query("SELECT * FROM access")
    AccessCounterEntity findAccessCount();
}
