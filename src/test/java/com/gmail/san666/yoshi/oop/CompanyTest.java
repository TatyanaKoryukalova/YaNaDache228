package com.gmail.san666.yoshi.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class CompanyTest {

    @Test
    void shouldHirePerson() {
        Person alex = new Person("Alex", 22);
        Company google = new Company("Google");
        google.hirePerson(alex, 32000);
        assertThat(alex).isEqualTo(google.getStaff()[0]);
        assertThat(google.getStaff().length).isEqualTo(1);
        assertThat(alex.getSalary()).isEqualTo(32000);
        assertThat(alex.getCompanyName()).isEqualTo(google.getName());
    }

    @Test
    void shouldThrowSalaryLessThanAgeExceptionWhenHirePerson() {
        Person alex = new Person("Alex", 22);
        Company google = new Company("Google");
        assertThatExceptionOfType(SalaryLessThanAgeException.class).isThrownBy(() ->
                google.hirePerson(alex, 20));
    }

    @Test
    void shouldFirePerson() {
        Person alex = new Person("Alex", 35);
        Person bob = new Person("Bob", 27);
        Company yahoo = new Company("Yahoo");
        yahoo.hirePerson(alex, 15000);
        yahoo.hirePerson(bob, 35000);
        yahoo.firePerson(alex);

        assertThat(yahoo.getStaff().length).isEqualTo(1);
        assertThat(bob).isEqualTo(yahoo.getStaff()[0]);
        assertThat(alex.getSalary()).isEqualTo(0);
        assertThat(alex.getCompanyName()).isEqualTo("This person doesn't work anywhere");
    }
}