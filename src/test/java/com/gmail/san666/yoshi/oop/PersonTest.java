package com.gmail.san666.yoshi.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void salaryValidateThrowExceptionTest() {
        Person alex = new Person("Alex", 32);
        alex.setSalary(30);

        Throwable thrown = catchThrowable(alex::salaryValidate);
        assertThat(thrown).isInstanceOf(salaryLessThanAgeException.class)
                .hasMessage("Salary cannot be less than age!");
    }

    @Test
    void salaryValidateWithoutExceptionTest() {
        Person alex = new Person("Alex", 32);
        alex.setSalary(5000);

        assertThatNoException().isThrownBy(alex::salaryValidate);
    }
}