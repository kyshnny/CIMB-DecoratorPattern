/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cimb;

/**
 *
 * @author ADMIN
 */
public interface BankAccount {
    String showAccountType();
    double getInterestRate();
    double getBalance();
    String showBenefits();
    double computeBalanceWithInterest();
    String showInfo();
    void setAccountNumber(int accountNumber);
    void setAccountName(String accountName);
    void setBalance(double balance);
}
