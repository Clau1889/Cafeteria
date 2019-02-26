import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Order{
    private static List<Beverage> listBeverages= new ArrayList<Beverage>();

    public List<Beverage> getListBeverages() { return listBeverages; }
    public void setListBeverages(List<Beverage> listBeverages) { this.listBeverages = listBeverages; }

    public void printListOrder(){

        for(Beverage listOrder: getListBeverages()){
            System.out.println(listOrder.toString());
        }

    }
    


    public Boolean addBeverage(){
        Beverage beverage= new Beverage();
        Coffee coffee= new Coffee();
        Tea tea= new Tea();
        Frapuccino frapuccino= new Frapuccino();

        Scanner sc= new Scanner(System.in);

        //Questions to order....
            System.out.println("What kind of Beverage(s) would you prefer?  \tEnter: Coffee,  Tea or Frapuccino.");
            String kindOfBeverage = sc.next().toLowerCase();
            beverage.setNameBeverage(kindOfBeverage);

            /**********************************************************************
             *                            COFEE                                   *
             **********************************************************************/

            if (kindOfBeverage.equals("coffee")) {
                System.out.println("What kind of coffee do you prefer?  \tEnter: ESPRESSO, AMERICANO, LATTE or CAPUCCINO");
                String type = sc.next().toUpperCase();
                coffee.setNameBeverage(kindOfBeverage);

                if (type.equals("ESPRESSO") || type.equals("AMERICANO") || type.equals("LATTE") || type.equals("CAPUCCINO")) {
                    coffee.setTypeCoffe(Coffee.Type.valueOf(type));

                    System.out.println("Do you prefer it decaf? \tEnter: True for yes or False for not.");
                    Boolean decaf = sc.nextBoolean();
                    coffee.setDecaf(decaf);

                    System.out.println("Would you like with milk? \tEnter: True for yes or False for not.");
                    Boolean withMilk = sc.nextBoolean();

                    if (withMilk) {
                        coffee.setWithMilk(withMilk);

                        System.out.println("What kind of milk do you prefer? \tEnter:  WHOLE, LIGHT, SOJA");
                        String kindOfMilk = sc.next().toUpperCase();
                        coffee.setTypeMilk(Beverage.TypeMilk.valueOf(kindOfMilk));
                    } else {
                        coffee.setWithMilk(withMilk);
                    }

                    System.out.println("What size? \tENTER: Small, Medium or Large");
                    String size = sc.next().toUpperCase();
                    coffee.setSizeBeverage(Beverage.Size.valueOf(size));
                    if (size.equals("SMALL")) {
                        coffee.setPriceBeverage(35.00);

                    } else if (size.equals("MEDIUM")) {
                        coffee.setPriceBeverage(45.00);

                    } else if (size.equals("LARGE")) {
                        coffee.setPriceBeverage(55.00);
                    }

                    listBeverages.add(coffee);

                } else {
                    System.out.println("Sorry, this kind of Coffee is unavailable.");
                }


                /**********************************************************************
                 *                              TEA                                   *
                 **********************************************************************/

            } else if (kindOfBeverage.equals("tea")) {
                System.out.println("What type of tea do you prefer?  \tEnter: GREEN, BLACK, CHAI, CHAMOMILE");
                String type = sc.next().toUpperCase();
                tea.setNameBeverage(kindOfBeverage);

                if (type.equals("GREEN") || type.equals("BLACK") || type.equals("CHAI") || type.equals("CHAMOMILE")) {
                    tea.setType(Tea.TypeTea.valueOf(type));

                    System.out.println("Would you like with milk? \tEnter: True for yes or False for not.");
                    Boolean withMilk = sc.nextBoolean();

                    if (withMilk) {
                        tea.setWithMilk(withMilk);

                        System.out.println("What kind of milk do you prefer? \tEnter:  WHOLE, LIGHT, SOJA");
                        String kindOfMilk = sc.next().toUpperCase();
                        tea.setTypeMilk(Beverage.TypeMilk.valueOf(kindOfMilk));

                    } else {
                        tea.setWithMilk(withMilk);
                    }

                    System.out.println("What size? \tENTER: Small, Medium or Large");
                    String size = sc.next().toUpperCase();
                    tea.setSizeBeverage(Beverage.Size.valueOf(size));
                    if (size.equals("SMALL")) {
                        tea.setPriceBeverage(22.00);

                    } else if (size.equals("MEDIUM")) {
                        tea.setPriceBeverage(30.00);

                    } else if (size.equals("LARGE")) {
                        tea.setPriceBeverage(38.00);
                    }

                    listBeverages.add(tea);

                } else {
                    System.out.println("Sorry, this kind of Tea is unavailable.");
                }


                /**********************************************************************
                 *                        FRAPUCCINO                                  *
                 **********************************************************************/

            } else if (kindOfBeverage.equals("frapuccino")) {
                System.out.println("What type of frapuccino do you prefer?  \tEnter: CARAMEL, JAVA, MOCCA");
                String type = sc.next().toUpperCase();
                frapuccino.setNameBeverage(kindOfBeverage);

                if (type.equals("CARAMEL") || type.equals("JAVA") || type.equals("MOCCA")) {
                    frapuccino.setType(Frapuccino.TypeFrapuccino.valueOf(type));

                    System.out.println("Would you like with milk? \tEnter: True for yes or False for not.");
                    Boolean withMilk = sc.nextBoolean();

                    if (withMilk) {
                        frapuccino.setWithMilk(withMilk);

                        System.out.println("What kind of milk do you prefer? \tEnter:  WHOLE, LIGHT, SOJA");
                        String kindOfMilk = sc.next().toUpperCase();
                        frapuccino.setTypeMilk(Beverage.TypeMilk.valueOf(kindOfMilk));

                    } else {
                        frapuccino.setWithMilk(withMilk);
                    }

                    System.out.println("Would you like whip Cream? \tEnter: True for yes or False for not.");
                    Boolean withWhipCream = sc.nextBoolean();
                    frapuccino.setAddWhipCream(withWhipCream);

                    System.out.println("What size? \tENTER: Small, Medium or Large");
                    String size = sc.next().toUpperCase();
                    frapuccino.setSizeBeverage(Beverage.Size.valueOf(size));
                    if (size.equals("SMALL")) {
                        frapuccino.setPriceBeverage(47.00);

                    } else if (size.equals("MEDIUM")) {
                        frapuccino.setPriceBeverage(55.00);

                    } else if (size.equals("LARGE")) {
                        frapuccino.setPriceBeverage(63.00);
                    }

                    listBeverages.add(frapuccino);

                } else {
                    System.out.println("Sorry, this kind of Frapuccino is unavailable.");
                }


                //THE BEVERAGE ENTERED DOES NOT EXIST.
            } else {
                System.out.println("This type of beverage is not available already.");
            }


            System.out.println("Anything else?");
            Boolean addMoreBeverages= sc.nextBoolean();
            if(addMoreBeverages){
                return true;
            }else{
                return false;
            }

    }
}
