/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab7task1;

/**
 *
 * @author natas
 */
public class JazzCashPayment implements PaymentMethod {

    @Override
    public boolean pay(double amount) {
        System.out.println("Paid Rs. " + amount
                + " using JazzCash.");
        return true;
    }
}
