package com.inqoo.tavelofficeweb.service;

import com.inqoo.model.CustomerDTO;
import com.inqoo.model.TripDTO;
import com.inqoo.model.boundary.tripApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CustomerServiceClient {
    @Autowired
    private tripApi api;

    @GetMapping
    public void trips() {

        System.out.println(api.trips());
    }

    @PostMapping
    public void create(@RequestBody TripDTO trips){
        api.create(trips);
        System.out.println("Succesful created!");
    }
}

