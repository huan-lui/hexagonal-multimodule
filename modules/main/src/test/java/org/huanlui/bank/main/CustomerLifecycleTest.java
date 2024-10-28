package org.huanlui.bank.main;

import org.huanlui.bank.application.primary.CreateCustomerUseCase;
import org.huanlui.bank.application.primary.GetAllCustomersUseCase;
import org.huanlui.bank.application.secondary.CustomerRepository;
import org.huanlui.bank.domain.Customer;
import org.huanlui.bank.infrastructure.secondary.InMemoryCustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class CustomerLifecycleTest {

    private CreateCustomerUseCase createCustomerUseCase;
    private GetAllCustomersUseCase getAllCustomersUseCase;

    @BeforeEach
    void setUp() {
        CustomerRepository repository = new InMemoryCustomerRepository();
        createCustomerUseCase = new CreateCustomerUseCase(repository);
        getAllCustomersUseCase = new GetAllCustomersUseCase(repository);
    }

    @Test
    void whenCustomerIsCreatedThenItIsIncludedInTheList() {
        assertThat(getAllCustomersUseCase.execute()).isEmpty();

        createCustomerUseCase.execute(new Customer("John Doe", 33));

        assertThat(getAllCustomersUseCase.execute()).containsExactly(new Customer("John Doe", 33));
    }

}