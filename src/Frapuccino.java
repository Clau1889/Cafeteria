public class Frapuccino extends  Beverage{
    private TypeFrapuccino type;
    private Boolean addWhipCream;

    public enum TypeFrapuccino{
        CARAMEL, JAVA, MOCCA
    }

    public TypeFrapuccino getType() { return type; }
    public void setType(TypeFrapuccino type) {
        switch (type){
            case CARAMEL:
                this.type= type;
                break;

            case JAVA:
                this.type= type;
                break;

            case MOCCA:
                this.type= type;
                break;

            default:
                System.out.println("Sorry, this type of Frappccino is unavailable.");
        }
    }


    public Boolean getAddWhipCream() { return addWhipCream; }
    public void setAddWhipCream(Boolean addWhipCream) { this.addWhipCream = addWhipCream; }






    @Override
    public String toString() {

        return "\nName: " +  getNameBeverage() + "\nType: " + type + "\nWith whipCream: " + addWhipCream +  "\nType of milk: " + getTypeMilk() +
                "\nSize: " + getSizeBeverage() + "\nPrice: $" + getPriceBeverage() + "\n";
    }



    public Frapuccino(){}
    public Frapuccino(String nameBeverage, Size sizeBeverage, Boolean withMilk, TypeMilk typeMilk,Double priceBeverage, TypeFrapuccino type, Boolean addWhipCream) {
        super(nameBeverage, sizeBeverage, withMilk, typeMilk, priceBeverage);
        this.type = type;
        this.addWhipCream = addWhipCream;
    }





}
