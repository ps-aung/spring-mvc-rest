package com.psa.springmvcrest.api.v1.mapper;

import com.psa.springmvcrest.api.v1.model.CustomerDTO;
import com.psa.springmvcrest.domain.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by PSA at 7/2/2021
 */
class CustomerMapperTest {

    public static final String FIRSTNAME="Pyae";
    public static final String LASTNAME="Sone";
    CustomerMapper customerMapper = CustomerMapper.INSTANCE;

    @Test
    void testCustomerToCustomerDTO()throws Exception {
        //given
        Customer customer = new Customer();
        customer.setFirstname(FIRSTNAME);
        customer.setLastname(LASTNAME);

        //when
        CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);

        //then
        assertEquals(FIRSTNAME,customerDTO.getFirstname());
        assertEquals(LASTNAME,customerDTO.getLastname());
    }
}