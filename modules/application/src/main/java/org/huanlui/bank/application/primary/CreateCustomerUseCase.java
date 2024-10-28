package org.huanlui.bank.application.primary;

import org.huanlui.bank.application.secondary.CustomerRepository;
import org.huanlui.bank.domain.Customer;

public class CreateCustomerUseCase {

    private final CustomerRepository customerRepository;

    public CreateCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void execute(Customer customer) {
        customerRepository.save(customer);
    }
}