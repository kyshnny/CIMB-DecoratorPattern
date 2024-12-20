/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cimb;

/**
 *
 * @author ADMIN
 */
public class SavingsAccount implements BankAccount {
    private int accountNumber;
    private String accountName;
    private double balance;
    
    public SavingsAccount(){
        
    }
    
    @Override
    public String showAccountType(){
        return "Savings Account";
    }
    
    @Override
    public double getInterestRate(){
        return 0.01;
    }
    
    @Override
    public double getBalance(){
        return balance;
    }
    
    @Override
    public String showBenefits(){
        return "Standard Savings Account";
    }
    
    @Override
    public double computeBalanceWithInterest(){
        return balance + (balance * getInterestRate());
    }
    
    @Override
    public String showInfo(){
        return "Account Number: " + accountNumber + "\nAccount Name: " + accountName + "\nBalance: " + balance;
    }
    
    @Override
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}
