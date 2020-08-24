package com.example.accesscounter.api.service;

import com.example.accesscounter.api.entity.AccessCounterEntity;
import com.example.accesscounter.api.repository.AccessCounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessCounterServiceImpl implements AccessCounterService {

    @Autowired
    AccessCounterRepository accessCounterRepository;

    @Override
    public AccessCounterEntity returnCounter() {

        AccessCounterEntity accessCounterEntity = accessCounterRepository.findAccessCount();
        accessCounterEntity.setAccessCount(accessCounterEntity.getAccessCount() + 1);
        accessCounterRepository.save(accessCounterEntity);
        return accessCounterEntity;
    }
}


