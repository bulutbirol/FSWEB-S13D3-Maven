package org.example;

public class Person {
    private String firstname;
    private String lastName;
    private int age;

    private String email;
    private String phone;
    private String address;

    public Person(String firstname, String lastName, int age) {
        this(firstname, lastName, age, "", "", "");
    }

    public Person(String firstname, String lastName, int age, String email, String phone, String address) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
