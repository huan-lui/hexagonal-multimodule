package org.huanlui.bank.application.secondary;

import org.huanlui.bank.domain.Customer;

import java.util.List;

public interface CustomerRepository {

    void save(Customer customer);

    List<Customer> findAll();
}
