package ATM;

import java.util.Scanner;

public class Deposit {
    int amount;
    int depo(int amount){
        System.out.println("Enter the amount to be deposited");
        Scanner scan = new Scanner(System.in);
        int deposit_amt = scan.nextInt();
        if (deposit_amt >= 50000){
            System.out.println("you can't exceed 50000 at a time");
        }
        else {
            amount = amount + deposit_amt;
        }
        return amount;
    }
}
