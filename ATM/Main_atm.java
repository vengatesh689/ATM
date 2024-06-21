package ATM;

import java.util.Scanner;

public class Main_atm {
    public static void main(String[] args) {
        System.out.println("WELCOME to Indian bank\nTo use ATM you have to login");
        Login_atm logo = new Login_atm();
        Check_balance check = new Check_balance();
        Deposit deposit = new Deposit();
        Withdraw withdraw = new Withdraw();
        logo.validate(withdraw.withdraw_amount);  //Login class


        System.out.println("|========MENU========|\n");
        System.out.println("1.Check Balance\n2.Deposit\n3.Withdraw\n4.Exit");

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter your choice");
            int option = scan.nextInt();
            switch (option) {
                case 1:
                    check.balance(logo.amount);  //Check the balance
                    break;
                case 2:
                    logo.amount = deposit.depo(logo.amount);
                    break;
                case 3:
                    logo.amount = withdraw.wdraw(logo.amount);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter from the given choice");

            }
        }
    }
}
