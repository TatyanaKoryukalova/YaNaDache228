package com.gmail.san666.yoshi.oop;

import com.gmail.san666.yoshi.oop.Person;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void hirePerson() {
        Person alex = new Person("Alex", 22);
        Company google = new Company("Google");
        google.hirePerson(alex, 35000);
        assertThat(alex).isEqualTo(google.getStaff()[0]);
        assertThat(google.getStaff().length).isEqualTo(1);
        assertThat(alex.getSalary()).isEqualTo(32000);
        assertThat(alex.getCompanyName()).isEqualTo(google.getName());
    }

    @Test
    void firePersonTest() {
        Person alex = new Person("Alex", 35);
        Person bob = new Person("Bob", 27);
        Company yahoo = new Company("Yahoo");
        yahoo.hirePerson(alex,15000);
        yahoo.hirePerson(bob,35000);
        yahoo.firePerson(alex);

        assertThat(yahoo.getStaff().length).isEqualTo(1);
        assertThat(bob).isEqualTo(yahoo.getStaff()[0]);
        assertThat(alex.getSalary()).isEqualTo(0);
        assertThat(alex.getCompanyName()).isEqualTo("This person doesn't work anywhere");
    }
}