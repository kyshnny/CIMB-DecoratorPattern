/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cimb;

/**
 *
 * @author ADMIN
 */
public class UpSave extends SavingsAccount implements BankAccountDecorator{
    private BankAccount bankAccount;
    
    public UpSave(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }
    
    @Override
    public void setBankAccount(BankAccount account) {
        this.bankAccount = account;
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04; // 4% interest rate
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", With Insurance";
    }

    @Override
    public double computeBalanceWithInterest() {
        return bankAccount.getBalance() + (bankAccount.getBalance() * getInterestRate()); 
}

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }

    @Override
    public void setAccountNumber(int accountNumber) {
        bankAccount.setAccountNumber(accountNumber);
    }

    @Override
    public void setAccountName(String accountName) {
        bankAccount.setAccountName(accountName);
    }

    @Override
    public void setBalance(double balance) {
        bankAccount.setBalance(balance);
    }
    
}
