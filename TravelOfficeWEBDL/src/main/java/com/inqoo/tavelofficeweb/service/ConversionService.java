package com.inqoo.tavelofficeweb.service;

import com.inqoo.model.CustomerDTO;
import com.inqoo.tavelofficeweb.model.Customer;
import com.inqoo.tavelofficeweb.model.CustomerAddressDetails;
import com.inqoo.tavelofficeweb.model.CustomerNameDetails;
import org.springframework.stereotype.Service;

@Service
public class ConversionService {
    public Customer Customerconvert (CustomerDTO customer) {
        Customer cus1 = new Customer();

        CustomerNameDetails cus1name = new CustomerNameDetails();
        cus1name.setFirstName(customer.getFirstName());
        cus1name.setLastName(customer.getLastName());
        cus1name.setAge(customer.getAge());

        CustomerAddressDetails cus1addr = new CustomerAddressDetails();
        cus1addr.setCountry(customer.getCountry());
        cus1addr.setRoad(customer.getRoad());


        cus1.setCustomerAddressDetails(cus1addr);
        cus1.setCustomerNameDetails(cus1name);


        return cus1;
    }
}
