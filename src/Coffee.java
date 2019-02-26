public class Coffee extends Beverage {
    private Type typeCoffe;
    private Boolean decaf;


    public enum Type{
        ESPRESSO, AMERICANO, LATTE, CAPUCCINO
    }


    public Type getTypeCoffe() { return typeCoffe; }
    public void setTypeCoffe(Type typeCoffe) {
        if(typeCoffe.equals("ESPRESSO") || typeCoffe.equals("AMERICANO") || typeCoffe.equals("LATTE") || typeCoffe.equals("CAPUCCINO")){
            this.typeCoffe= typeCoffe;
        }else{
            System.out.println("Sorry, this type of coffee is unavailable.");
        }

    }

    public Boolean getDecaf() { return decaf; }
    public void setDecaf(Boolean decaf) { this.decaf = decaf; }




    @Override
    public String toString() {
        return "\nName: " +  getNameBeverage() + "\nType: " + typeCoffe + "\nDecaf :" + decaf +  "\nType of milk: " + getTypeMilk() +
                "\nSize: " + getSizeBeverage() + "\nPrice: $" + getPriceBeverage() + "\n";
    }


    public Coffee(){}
    public Coffee(String nameBeverage, Size sizeBeverage, Boolean withMilk, TypeMilk typeMilk, Double priceBeverage, Type typeCoffe, Boolean decaf) {
        super(nameBeverage, sizeBeverage, withMilk, typeMilk, priceBeverage);
        this.typeCoffe = typeCoffe;
        this.decaf = decaf;
    }



}
