package ATM;

import java.util.HashMap;
import java.util.Scanner;

public class Login_atm {
    public int amount;
    public void validate(int withdraw_amount){
        HashMap<String,Integer[]> userdata = new HashMap<>();  // database of few atm users
        userdata.put("Gokul",new Integer[]{9876,58000});
        userdata.put("Sarvesvar",new Integer[]{1234,55000});
        userdata.put("Ohm",new Integer[]{5678,70000});

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the username");
        String username = scan.nextLine();
        Integer[] uservalues = userdata.get(username);
        int storedpin = uservalues[0];
        int pin = 0;

         if (userdata.containsKey(username)){    //verifying the username
             System.out.println("Username is verified \nNow, Enter the pin");
             pin = scan.nextInt();
             if (pin == storedpin){   //verifying the pin
                 System.out.println("Logged in successfully");
                 amount = uservalues[1];
             }
             else {
                 System.out.println("Input the correct pin🤣🤣🤣🤣🤣");
             }
         }

         else {
             System.out.println("There are no users with that name");
         }
    }

}
