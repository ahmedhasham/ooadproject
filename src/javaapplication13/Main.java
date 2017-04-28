package javaapplication13;
// sai h  chalao zara daikho bol rha hai k package javaapplication13 ki main cls nh hai   kahan gae ?????? kahan gaya mjy documentation bhi krni hai
// aur cls diagram ka daikho na kese ati hai is main direct 
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Login Name :  ");
        String loginName=scanner.nextLine().toLowerCase();
        System.out.println("Enter Password :  ");
        String password=scanner.nextLine();
boolean myflag=false;
Customer c = new Customer();
        String name="";
        while (true) {


            if(loginName.equals("cashier")) {
                if (password.equals("1234")) {
                    if (!myflag) {
                        System.out.println("Enter Customer Name : ");
                        myflag = true;
                        c.CustomerName = scanner.nextLine();

                    }
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Customer Name : " + c.CustomerName);
                    menu.displayMenu();
                    System.out.print("Enter Option: ");
                    String input = scanner.nextLine();

                    Boolean flag = menu.orderSelection(input);
                    if (flag == true) {
                        break;
                    }
                }
            }
            else
            {
                menu.displayMenuForManager();
                System.out.println("Enter 0 to exit");
                System.out.print("Enter Option: ");
                String input = scanner.nextLine();
                if(input.equals("0"))
                {
                    System.out.close();
                }
            }


            // write your code here
        }
    }
}
