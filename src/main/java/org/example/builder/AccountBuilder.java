package org.example.builder;

public class AccountBuilder {
    private Account account;

    public AccountBuilder() {
        this.account = new Account();
    }

    public AccountBuilder id(Long id) {
        this.account.setId(id);
        return this;
    }

    public AccountBuilder firstName(String firstName) {
        this.account.setFirstName(firstName);
        return this;
    }

    public AccountBuilder lastName(String lastName) {
        this.account.setLastName(lastName);
        return this;
    }

    public AccountBuilder email(String email) {
        this.account.setEmail(email);
        return this;
    }

    public AccountBuilder password(String password) {
        this.account.setPassword(password);
        return this;
    }

    public AccountBuilder address(Address address) {
        this.account.setAddress(address);
        return this;
    }

    public Account build() {
        return this.account;
    }
}
