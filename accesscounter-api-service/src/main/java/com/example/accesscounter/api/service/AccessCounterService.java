package com.example.accesscounter.api.service;

import com.example.accesscounter.api.entity.AccessCounterEntity;
import org.springframework.stereotype.Service;

@Service
public interface AccessCounterService {

    AccessCounterEntity returnCounter();
}
