package ATMMachine;

import java.util.Scanner;

class ATM {
    float Balance;
    int PIN = 2201;

    public void checkpin(){
        System.out.println("Enter your PIN:");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == PIN) {
            menu();
        }
        else {
            System.out.println("Enter a valid pin!");
        }
    }

    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance ");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Deposit Amount");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        }else if (opt == 2){
            withdrawAmount();
        }else if(opt == 3){
            depositAmount();
        }else if (opt == 4){
            return;
        }else {
            System.out.println("Thank You for using ATM Machine");
        }
    }

    public void checkBalance(){
        System.out.println("Your Balance is: " + Balance);
        menu();
    }

    public void withdrawAmount(){
        System.out.println("Enter the amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        float Amount = sc.nextFloat();
        if(Amount>Balance){
            System.out.println("Insufficient Balance ");
        }
        else {
            Balance = Balance - Amount;
            System.out.println("Amount Withdrawal Successful");
        }
        menu();
    }

    public void depositAmount(){
        System.out.println("Enter the amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        float Amount = sc.nextFloat();
        Balance = Balance + Amount;
        System.out.println("Amount Deposited Successfully");
        menu();
    }
}
public class ATMMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}