import java.lang.reflect.Array;
import java.util.List;

public class Beverage extends Order{
    private String nameBeverage;
    private Double priceBeverage;

    //ENUM TO SIZES, BECAUSE ALWAYS ARE GOING TO BE THE SAME FOR BEVERAGE.
    enum Size {
        SMALL, MEDIUM, LARGE;
    }


    public String getNameBeverage() { return nameBeverage; }
    public void setNameBeverage(String nameBeverage) { this.nameBeverage = nameBeverage;

        switch (nameBeverage.toLowerCase()){
            case "coffee":
                this.nameBeverage= nameBeverage;
                break;

            case "tea":
                this.nameBeverage= nameBeverage;
                break;

            case "frapuccino":
                this.nameBeverage=  nameBeverage;
                break;

            default:
                System.out.println("Sorry, this beverage is unavailable.");
        }
    }

    public Double getPriceBeverage() { return priceBeverage; }
    public void setPriceBeverage(Double priceBeverage) { this.priceBeverage = priceBeverage;
           for(Size sizes: Size.values()){

               if(sizes.equals(Size.SMALL)){
                   setPriceBeverage(35.00);
               }else if (sizes.equals(Size.MEDIUM)){
                   setPriceBeverage(45.00);
               }else if (sizes.equals(Size.LARGE)){
                   setPriceBeverage(55.00);
               }else {
                   System.out.println("This size is unavailable.");
               }
           }
    }





}
