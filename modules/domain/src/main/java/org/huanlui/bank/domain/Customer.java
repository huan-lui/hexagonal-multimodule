package org.huanlui.bank.domain;

import org.huanlui.bank.domain.exception.DomainException;

public record Customer(String name, int age) {
    public Customer {
        if (name.isBlank()) {
            throw new DomainException("A customer must have a name");
        }
        if (age < 18) {
            throw new DomainException("A customer must be greater than 18");
        }
    }
}