package com.HarshSaxena;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("default name", 100.50, "default emailAddress");
        System.out.println("Name = " + this.name + " credit limit = " + this.creditLimit +
                " email id = " + this.emailAddress);
    }
    public VipCustomer(String name, String emailAddress){
        this(name, 100.50, emailAddress);
    }

    public VipCustomer(String name, double creditLimit, String emailAddress ){
        System.out.println("VipCustomer constructor called here");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;

    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}



