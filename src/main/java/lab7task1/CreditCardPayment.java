/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natas
 */

package lab7task1;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public boolean pay(double amount) {
        System.out.println("Paid Rs. " + amount
                + " using Credit Card.");
        return true;
    }
}

