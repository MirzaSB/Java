package com.abc.foo;


public class User {

    public String firstName;
    public String lastName;
    public String emailAddress;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress() {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + "'" +
                ", lastName='" + lastName + "'" +
                "}";
    }

}

