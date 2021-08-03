package com.psa.springmvcrest.services;

import com.psa.springmvcrest.api.v1.mapper.CustomerMapper;
import com.psa.springmvcrest.api.v1.model.CustomerDTO;
import com.psa.springmvcrest.controller.v1.CustomerController;
import com.psa.springmvcrest.domain.Customer;
import com.psa.springmvcrest.repositories.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

class CustomerServiceImplTest {

    @Mock
    CustomerRepository customerRepository;

    CustomerMapper customerMapper = CustomerMapper.INSTANCE;

    CustomerService customerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        customerService = new CustomerServiceImpl(customerRepository,customerMapper);
    }

    @Test
    void testGetAllCustomers() throws Exception {
        //given
        Customer customer1 = new Customer();
        customer1.setId(1l);
        customer1.setFirstname("Pyae");
        customer1.setLastname("Sone");

        Customer customer2 = new Customer();
        customer2.setId(2l);
        customer2.setFirstname("Thet");
        customer2.setLastname("Hnin");

        when(customerRepository.findAll()).thenReturn(Arrays.asList(customer1,customer2));
        //when
        List<CustomerDTO> customerDTOS = customerService.getAllCustomers();

        //then
        assertEquals(2, customerDTOS.size());

    }

    @Test
    void testGetCustomerById() throws Exception {
        //given
        Customer customer1 = new Customer();
        customer1.setId(1l);
        customer1.setFirstname("Pyae");
        customer1.setLastname("Sone");

        when(customerRepository.findById(anyLong())).thenReturn(java.util.Optional.ofNullable(customer1));

        //when
        CustomerDTO customerDTO = customerService.getCustomerById(1L);

        assertEquals("Pyae", customerDTO.getFirstname());
    }

    @Test
    void testCreateNewCustomer() throws Exception {

        //given
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setFirstname("Pyae");

        Customer savedCustomer = new Customer();
        savedCustomer.setFirstname(customerDTO.getFirstname());
        savedCustomer.setLastname(customerDTO.getLastname());
        savedCustomer.setId(1L);

        when(customerRepository.save(any(Customer.class))).thenReturn(savedCustomer);

        //when
        CustomerDTO savedDTO = customerService.createNewCustomer(customerDTO);

        //then
        assertEquals(customerDTO.getFirstname(),savedDTO.getFirstname());
        assertEquals(CustomerController.BASE_URL +"/1",savedDTO.getCustomerUrl());
    }

    @Test
    void testSaveCustomerByDTO() throws Exception {
        //given
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setFirstname("Pyae");

        Customer savedCustomer = new Customer();
        savedCustomer.setFirstname(customerDTO.getFirstname());
        savedCustomer.setLastname(customerDTO.getLastname());
        savedCustomer.setId(1L);

        when(customerRepository.save(any(Customer.class))).thenReturn(savedCustomer);

        //when
        CustomerDTO savedDTO = customerService.saveCustomerByDTO(1L,customerDTO);

        //then
        assertEquals(savedDTO.getFirstname(),savedCustomer.getFirstname());
        assertEquals(savedDTO.getCustomerUrl(),CustomerController.BASE_URL+"/1");
    }

    @Test
    void testDeleteCustomerById() throws Exception {
        Long id = 1L;

        customerRepository.deleteById(id);

        verify(customerRepository,times(1)).deleteById(anyLong());
    }
}