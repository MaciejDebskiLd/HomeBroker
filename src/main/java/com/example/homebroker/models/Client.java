package com.example.homebroker.models;

import java.util.StringJoiner;

public class Client extends AbstractModel {

    private final String firstName;
    private final String lastName;

    public Client(String firstName, String lastName) {

        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static Client of(String firstName, String lastName){

        return new Client(firstName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString(){
        return "Client{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';


    }


}
