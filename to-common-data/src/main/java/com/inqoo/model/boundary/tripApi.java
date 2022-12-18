package com.inqoo.model.boundary;

import com.inqoo.model.TripDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface tripApi {


        @GetMapping(value = "/trips", produces = "application/json")
        public List<TripDTO> trips();
        @PostMapping(value ={"/trips"},
                consumes = {"application/json"}
        )
        public ResponseEntity create(@RequestBody TripDTO tripDTO);
    }


