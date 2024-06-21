package ATM;

import java.util.Scanner;

public class Withdraw {
    int withdraw_amount;
    int wdraw(int amount){
        System.out.println("Enter the amount to be withdrawn");
        Scanner scan = new Scanner(System.in);
        withdraw_amount = scan.nextInt();
        if (withdraw_amount>amount){
            System.out.println("You don't have that much amount");
        }
        else {
            System.out.println("Rupees "+withdraw_amount+" has been deducted");
            amount = amount - withdraw_amount;    // to update the total balance
        }
        return amount;
    }
}
