package com.gmail.san666.yoshi.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void salaryValidateTest() {
        Person alex = new Person("Alex", 32);
        alex.setSalary(30);

        Throwable thrown = catchThrowable(alex::salaryValidate);
        assertThat(thrown).isInstanceOf(salaryLessThanAgeException.class)
                .hasMessage("Salary cannot be less than age!");
    }
}