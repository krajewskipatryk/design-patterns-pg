package org.example;

import org.example.builder.Account;
import org.example.builder.AccountBuilder;
import org.example.builder.Address;

public class Main {
    public static void main(String[] args) {
        testBuilder();
    }

    private static void testBuilder() {
        Account account = new AccountBuilder()
                .id(1L)
                .email("test@test.com")
                .firstName("Patryk")
                .lastName("Test")
                .password("Test1234")
                .address(new Address("Warsaw", "Zlota 44", "01-414"))
                .build();

        System.out.println(account.toString());
    }
}