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

        Order order= new Order();
        order.addBeverage();
        order.printListOrder();

        Scanner sc= new Scanner(System.in);
        System.out.println("Anything else?");
        Boolean addMoreBeverages= sc.nextBoolean();

        

    }
}
