/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.university.lab.lab7task1;

import lab7task1.CreditCardPayment;
import lab7task1.EcommerceCart;
import lab7task1.JazzCashPayment;
import lab7task1.PaymentMethod;
import lab7task2.DataBox;

/**
 *
 * @author natas
 */
public class Lab7task1 {
    
    public static void main(String[] args) {

        PaymentMethod card = new CreditCardPayment();
        EcommerceCart cart1 = new EcommerceCart(card);
        cart1.checkout(2500);

        PaymentMethod jazzCash = new JazzCashPayment();
        EcommerceCart cart2 = new EcommerceCart(jazzCash);
        cart2.checkout(1500);
    
    


        DataBox<String> studentName =
                new DataBox<>("Ali");

        DataBox<Integer> studentID =
                new DataBox<>(101);

        System.out.println("Student Name: "
                + studentName.getValue());

        System.out.println("Student ID: "
                + studentID.getValue());

}
}