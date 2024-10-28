package org.huanlui.bank.domain;

import org.huanlui.bank.domain.exception.DomainException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CustomerTest {

    @Test
    void aCustomerWithNameAndGreaterThan18CanBeCreated() {
        var customer = new Customer("Paco", 30);

        assertThat(customer.name()).isEqualTo("Paco");
        assertThat(customer.age()).isEqualTo(30);
    }

    @Test
    void aCustomerMustHaveAName() {
        assertThatThrownBy( ()-> new Customer("", 30)).isInstanceOf(DomainException.class);
    }

    @Test
    void aCustomerMustBeGreaterThan18() {
        assertThatThrownBy( ()-> new Customer("Paquito", 12)).isInstanceOf(DomainException.class);
    }
}