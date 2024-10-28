package org.huanlui.bank.infrastructure.secondary;

import org.huanlui.bank.application.secondary.CustomerRepository;
import org.huanlui.bank.domain.Customer;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCustomerRepository implements CustomerRepository {

    private final List<Customer> customers = new ArrayList<>();

    @Override
    public void save(Customer customer) {
        customers.add(customer);
    }

    @Override
    public List<Customer> findAll() {
        return List.copyOf(customers);
    }
}