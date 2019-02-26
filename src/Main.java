import java.util.Scanner;

public class Main {

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

        System.out.println("\nHi, My name is Claudia and I´ll take your order.");
        Scanner sc = new Scanner(System.in);
        Order order= new Order();
        Boolean flagCondition= true;

        System.out.println("\nAre you ready to order?. \tEnter true to YES, false to no.");
        Boolean readyToOrder= sc.nextBoolean();

        if(readyToOrder) {
            do {
                flagCondition = order.addBeverage();

            } while (flagCondition);
        }else{
            System.out.println("Ok, maybe you can order later. See you soon!.");
        }

        order.printListOrder();



    }
}
