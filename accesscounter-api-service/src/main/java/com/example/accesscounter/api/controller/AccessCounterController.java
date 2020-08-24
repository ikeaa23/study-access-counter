package com.example.accesscounter.api.controller;

import com.example.accesscounter.api.entity.AccessCounterEntity;
import com.example.accesscounter.api.service.AccessCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AccessCounterController {

    @Autowired
    AccessCounterService accessCounterService;

    @GetMapping("/")
    public String getAccessCounter(){
        AccessCounterEntity accessCounterEntity = accessCounterService.returnCounter();
        return "<!DOCTYPE html><html><head><meta charset=\"UTF-8\"><title>ようこそ</title></head><body>現在のアクセス数：" + accessCounterEntity.getAccessCount() + "</body></html>";
    }

}