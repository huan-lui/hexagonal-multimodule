package org.huanlui.bank.application.primary;

import org.huanlui.bank.application.secondary.CustomerRepository;
import org.huanlui.bank.domain.Customer;

import java.util.List;

public class GetAllCustomersUseCase {

    private final CustomerRepository customerRepository;

    public GetAllCustomersUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> execute() {
        return customerRepository.findAll();
    }

}