package com.inqoo.tavelofficeweb.controler;

import com.inqoo.model.CustomerDTO;
import com.inqoo.model.TripDTO;
import com.inqoo.model.boundary.tripApi;
import com.inqoo.tavelofficeweb.model.Customer;
import com.inqoo.tavelofficeweb.service.ConversionService;
import com.inqoo.tavelofficeweb.service.CustomerService;
import com.inqoo.tavelofficeweb.service.CustomerServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomerControler  {
    @Autowired
    private tripApi api;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ConversionService conversionService;
    @Autowired
    private CustomerServiceClient customerServiceClient;

    @GetMapping(path = "/", produces = "application/json")
    public List<Customer> customers( @RequestParam(name="firstNameFragment", required = false) String firstNameFragment,
                                    @RequestParam(name="country", required = false) String country,
                                    @RequestParam(name="trip", required = false) Boolean trip){
        return customerService.getAllCustomers(firstNameFragment,country,trip);
    }




    @GetMapping(path = "/{customerId}", produces = "application/json")
    public Customer customerById(@PathVariable("customerId") Integer id) {

        return customerService.getAllCustomers( null,null,null).get(id);

    }





    @PostMapping( consumes = "application/json")
    public void create(@RequestBody TripDTO cust) {

        api.create(cust);
        System.out.println("Succesful created!");


    }
}