import java.lang.reflect.Type;

public class Tea extends Beverage {
    private TypeTea type;

    public enum TypeTea{
        GREEN, BLACK, CHAI, CHAMOMILE
    }

    public TypeTea getType() { return type; }
    public void setType(TypeTea type) {
        if(type.equals(TypeTea.valueOf("GREEN")) || type.equals(TypeTea.valueOf("BLACK")) || type.equals(TypeTea.valueOf("CHAI"))
                || type.equals(TypeTea.valueOf("CHAMOMILE"))){
            this.type= type;

        }else{
            System.out.println("Sorry, this type of tea is unavailable.");
        }
    }



    @Override
    public String toString() {

        return "\nName: " +  getNameBeverage() + "\nType: " + type + "\nType of Milk :" + getTypeMilk() +
                "\nSize: " + getSizeBeverage() + "\nPrice: $" + getPriceBeverage() + "\n";
    }

    public Tea(){}
    public Tea(String nameBeverage, Size sizeBeverage, Boolean withMilk, TypeMilk typeMilk,Double priceBeverage, TypeTea type) {
        super(nameBeverage, sizeBeverage, withMilk, typeMilk, priceBeverage);
        this.type = type;
    }


}
