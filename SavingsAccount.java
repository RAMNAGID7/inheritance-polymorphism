// Assignment: 2
// Author: Ram Nagid, ID: 318692779
package ex2bank;

public class SavingsAccount {
    private static double annualInterestRate;
    private static int accountCounter=1000;
    final private int accountNumber=accountCounter ;
    private Personld client;
    private double savingsBalance;

    public SavingsAccount(Personld p1,double sb) {
        client=p1;
        savingsBalance=sb;
        accountCounter++;
    }
    public SavingsAccount (Personld p1) {
        client=p1;
        savingsBalance = 0;
    }
    public SavingsAccount(double sb){
        this.savingsBalance=sb;
        accountCounter++;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
    public void setSavingsBalance(double sb) {
        savingsBalance=sb;
    }

    public int getAccountNumber() {
        return accountNumber;

    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void modifyInterestRate (double ann) {
        annualInterestRate = ann;
    }
    public static double gettAnnualInterestRate() {
       return annualInterestRate ;
    }
    public void calculateMonthlyInterest ()
    {
        savingsBalance+=(savingsBalance*(annualInterestRate)/12);
    }
}

