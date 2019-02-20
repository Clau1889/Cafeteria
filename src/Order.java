import java.util.Scanner;

public class Order {
    public static void main(String[]args){

    System.out.println("    \t     Welcome at Claudia´s Cafeteria" + "\nOur mission is give you a piece of happiness to start well your day. ");
        System.out.println(
                "\n\t              ________________________" +
                "\n\t            ||   Claudia´s Cafeteria  ||"  +

                " \n ________________________|_|___________________________" +
                "\n  |_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|| " +
                "  \n|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|| /| " +
                " \n|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_||/|| " +
                " \n|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|||/| "+
                " \n|_|_|_|_|_|_|_|_|_|     _      _     |_|_|_|_|_|_|_|_|_|_|/|| "+
                " \n|_|               |    (_)    (_)    |                 | ||/| "+
                " \n|_|               |_|      ||      |_|                 |_|/|| "+
                " \n|_|               |_| pull || push |_|                 |_||/| "+
                " \n|_|               |_|      ||      |_|                 |_|/|| "+
                " \n|_|               |_|     [||]     |_|                 |_||/| "+
                " \n|_|               |_|      ||      |_|                 |_|/|| "+
                " \n|_|______         |_|      ||      |_|_____   _________|_||/| "+
                " \n|_|_|_|_|_|_|_|_|_|_|______||______|_|_|_|_|_|_|_|_|_|_|_|/|| "+
                "\n__|_|_|_|_|_|_|_|_|_|_|______||______|_|_|_|_|_|_|_|_|_|_|_||/______ "+
                "\n /     /     /     /     /     /     /     /     /     /     /     /   "+
                "\n/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/    "+
                "\n_________________________________________________________________      "

                );




        //Questions to order....
        Scanner sc= new Scanner(System.in);
        System.out.println("\nHi, My name is Claudia and I´ll take your order.  Are you ready to order? \n(Please enter true if is YES, or false if is NO).");
        Boolean readyToOrder= sc.nextBoolean();

        if(readyToOrder) {
            System.out.println("Please, enter how many Beverage would you like?");
            Integer amount = sc.nextInt();
            sc.reset();

            System.out.println("What kind of Beverage(s) would you prefer?  \tEnter: 1 to Coffe, 2 to Tea or 3 to Frapuccino.");
            Integer kindOfBeverage = sc.nextInt();
            sc.reset();

            System.out.println("Would you like cream in you beverage(s)?  \t(Please enter true if is YES, or false if is NO)");
            Boolean addCream = sc.nextBoolean();

        } else {
            System.out.println("Ok, maybe you can order later. See you soon!.");

        }

    }
}
