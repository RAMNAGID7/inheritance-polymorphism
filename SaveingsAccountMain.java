// Assignment: 2
// Author: Ram Nagid, ID: 318692779
package ex2bank;
public class SaveingsAccountMain {
    public static void main(String[] args) {
        Personld[] arr = new Personld[10];
        arr[0] = new Personld(5000, "Bill", "Gates", "Tel-Aviv");
        arr[1] = new Personld(6000, "Mark", "Zuckerberg", "Jerusalem");
        arr[2] = new Personld(7000, "Steve", "Jobs", "Beer-Sheva");
        System.out.println("List of clients");
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i].toString());
        }
        SavingsAccount[] arr2 = new SavingsAccount[10];
        arr2[0] = new SavingsAccount(2000);
        arr2[1] = new SavingsAccount(3000);
        arr2[2] = new SavingsAccount(4000);
        SavingsAccount.modifyInterestRate(0.01);
        System.out.println();
        System.out.println("Print account status");
        System.out.println();
        for (int j = 0; j < 3; j++) {
            System.out.println("Account number: "+arr2[j].getAccountNumber());
            System.out.println(arr[j]);
            System.out.println("Saving Balance: "+arr2[j].getSavingsBalance());
            System.out.println();
        }
        System.out.println("Account status one month update of balance (monthly interest: "+SavingsAccount.gettAnnualInterestRate()+")");
        for (int j = 0; j < 3; j++) {
            arr2[j].calculateMonthlyInterest();
            System.out.println("Account number: "+arr2[j].getAccountNumber());
            System.out.println(arr[j]);
            System.out.println("Saving Balance: "+arr2[j].getSavingsBalance());
            System.out.println();
        }
        System.out.println("Account status two month update of balance (monthly interest: "+SavingsAccount.gettAnnualInterestRate()+")");
        for (int j = 0; j < 3; j++) {
            arr2[j].calculateMonthlyInterest();
            System.out.println("Account number: "+arr2[j].getAccountNumber());
            System.out.println(arr[j]);
            System.out.println("Saving Balance: "+arr2[j].getSavingsBalance());
            System.out.println();
        }
        SavingsAccount.modifyInterestRate(-0.015);
        System.out.println("Account status one month update of balance (monthly interest: "+SavingsAccount.gettAnnualInterestRate()+")");
        for (int j = 0; j < 3; j++) {
            arr2[j].calculateMonthlyInterest();
            System.out.println("Account number: "+arr2[j].getAccountNumber());
            System.out.println(arr[j]);
            System.out.println("Saving Balance: "+arr2[j].getSavingsBalance());
            System.out.println();
        }

    }
}
