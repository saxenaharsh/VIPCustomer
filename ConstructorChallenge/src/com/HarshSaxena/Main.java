package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VipCustomer harsh = new VipCustomer();
        VipCustomer Lamu = new VipCustomer("Lamu", "lamu@mail.com");
        System.out.println("VIP customer name is " + Lamu.getName() + " credit is " + Lamu.getCreditLimit()
        + " email id is " + Lamu.getEmailAddress());
        VipCustomer Parul = new VipCustomer("Parul", 20000.7484, "parul@gmail.com");
        System.out.println("Customer name is " + Parul.getName() + " her credit is " + Parul.getCreditLimit()
        + " her email id is " + Parul.getEmailAddress());


    }
}
