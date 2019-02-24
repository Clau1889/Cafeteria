import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Order {
    private List<Beverage> listBeverages= new ArrayList<Beverage>();

    public List<Beverage> getListBeverages() { return listBeverages; }
    public void setListBeverages(List<Beverage> listBeverages) { this.listBeverages = listBeverages; }




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



        Beverage beverage= new Beverage();
        //Coffee coffee= new Coffee("Coffe", Beverage.Size.MEDIUM, true, Coffee.TypeMilk.WHOLE, Coffee.Type.AMERICANO, true);
        //Tea tea= new Tea("Tea", Beverage.Size.LARGE, false, null, Tea.TypeTea.GREEEN);
        Coffee coffee= new Coffee();
        Tea tea= new Tea();
        Frapuccino frapuccino= new Frapuccino();


        //Questions to order....
        Scanner sc= new Scanner(System.in);
        System.out.println("\nHi, My name is Claudia and I´ll take your order.  Are you ready to order? \n(Please enter true if is YES, or false if is NO).");
        Boolean readyToOrder= sc.nextBoolean();



        if(readyToOrder) {
            System.out.println("What kind of Beverage(s) would you prefer?  \tEnter: Coffee,  Tea or Frapuccino.");
            String kindOfBeverage = sc.next().toLowerCase();
            beverage.setNameBeverage(kindOfBeverage);
            sc.reset();


            //TO COFFEE
            if(kindOfBeverage.equals("coffee")){
                System.out.println("What kind of coffee do you prefer?  \tEnter: ESPRESSO, AMERICANO, LATTE or CAPUCCINO");
                String type= sc.next().toUpperCase();

                if(type.equals("ESPRESSO") || type.equals("AMERICANO") || type.equals("LATTE") || type.equals("CAPUCCINO") ){
                    coffee.setTypeCoffe(Coffee.Type.valueOf(type));

                    System.out.println("Do you prefer it decaf? \tEnter: True for yes or False for not." );
                    Boolean decaf= sc.nextBoolean();
                    coffee.setDecaf(decaf);

                    System.out.println("Would you like with milk? \tEnter: True for yes or False for not." );
                    Boolean withMilk= sc.nextBoolean();

                        if(withMilk){
                            coffee.setWithMilk(withMilk);

                            System.out.println("What kind of milk do you prefer? \tEnter:  WHOLE, LIGHT, SOJA");
                            String kindOfMilk= sc.next().toUpperCase();
                            coffee.setTypeMilk(Beverage.TypeMilk.valueOf(kindOfMilk));
                        }else{
                            coffee.setWithMilk(withMilk);
                        }

                    System.out.println("What size? \tENTER: Small, Medium or Large");
                    String size= sc.next().toUpperCase();
                    coffee.setSizeBeverage(Beverage.Size.valueOf(size));

                    System.out.println(coffee);

                }else{
                    System.out.println("Sorry, this kind of Coffee is unavailable.");
                }



            //FOR TEA
            }else if(kindOfBeverage.equals("tea")){
                System.out.println("What type of tea do you prefer?  \tEnter: GREEN, BLACK, CHAI, CHAMOMILE");
                String type= sc.next().toUpperCase();

                if(type.equals("GREEN") || type.equals("BLACK") || type.equals("CHAI") || type.equals("CHAMOMILE")){
                    tea.setType(Tea.TypeTea.valueOf(type));

                    System.out.println("Would you like with milk? \tEnter: True for yes or False for not." );
                    Boolean withMilk= sc.nextBoolean();

                    if(withMilk){
                        tea.setWithMilk(withMilk);

                        System.out.println("What kind of milk do you prefer? \tEnter:  WHOLE, LIGHT, SOJA" );
                        String kindOfMilk= sc.next().toUpperCase();
                        tea.setTypeMilk(Beverage.TypeMilk.valueOf(kindOfMilk));

                    }else{
                        tea.setWithMilk(withMilk);
                    }

                    System.out.println("What size? \tENTER: Small, Medium or Large");
                    String size= sc.next().toUpperCase();
                    tea.setSizeBeverage(Beverage.Size.valueOf(size));


                    System.out.println(tea);

                }else {
                    System.out.println("Sorry, this kind of Tea is unavailable.");
                }


            //FOR FRAPUCCINO
            }else if(kindOfBeverage.equals("frapuccino")){
                System.out.println("What type of frapuccino do you prefer?  \tEnter: CARAMEL, JAVA, MOCCA");
                String type= sc.next().toUpperCase();

                if(type.equals(Frapuccino.TypeFrapuccino.valueOf("CARAMEL")) || type.equals(Frapuccino.TypeFrapuccino.valueOf("JAVA"))
                || type.equals(Frapuccino.TypeFrapuccino.valueOf("MOCCA"))){

                    System.out.println("Would you like with milk? \tEnter: True for yes or False for not." );
                    Boolean withMilk= sc.nextBoolean();
                    if(withMilk){
                        System.out.println("What kind of milk do you prefer? \tEnter:  WHOLE, LOW_FAT or LACTOSE FREE");
                        frapuccino.setWithMilk(withMilk);
                    }else{
                        frapuccino.setWithMilk(withMilk);
                    }

                    System.out.println("Would you like whip Cream?");
                    Boolean withWhipCream= sc.nextBoolean();
                    frapuccino.setWithMilk(withWhipCream);

                    System.out.println("What size? \tENTER: Small, Medium or Large");
                    String size= sc.next().toUpperCase();
                    frapuccino.setSizeBeverage(Beverage.Size.valueOf(size));

                    System.out.println(frapuccino);

                }else {
                    System.out.println("Sorry, this kind of Frapuccino is unavailable.");
                }



             //THE BEVERAGE ENTERED DOES NOT EXIST.
            }else{
                System.out.println("This type of beverage is not available already.");
            }


        //CLIENT IS NOT READY TO ORDER A BEVERAGE
        } else {
            System.out.println("Ok, maybe you can order later. See you soon!.");

        }


    }
}
