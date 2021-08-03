package com.psa.springmvcrest.services;

import com.psa.springmvcrest.api.v1.model.CustomerDTO;

import java.util.List;

/**
 * Created by PSA at 7/3/2021
 */
public interface CustomerService {
    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(Long id);

    CustomerDTO createNewCustomer(CustomerDTO customerDTO);

    CustomerDTO saveCustomerByDTO(Long id, CustomerDTO customerDTO);

    CustomerDTO patchCustomer(Long id,CustomerDTO customerDTO);

    void deleteCustomerById(Long id);
}
