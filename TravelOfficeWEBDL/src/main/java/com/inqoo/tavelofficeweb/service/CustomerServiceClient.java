package com.inqoo.tavelofficeweb.service;

import com.inqoo.model.TripDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class CustomerServiceClient {
    private RestTemplate restTemplate = new RestTemplate();
    private String postUrl = "http://localhost:8080/trips";

    public void saveTrip(List<TripDTO> trips) {
        if (trips != null) {
            trips.stream().forEach(
                    c -> restTemplate.postForLocation(postUrl, c)
            );
        }
    }
}

