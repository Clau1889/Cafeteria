public class Beverage extends Order{
    private String nameBeverage;
    private Size sizeBeverage;
    private Double priceBeverage;
    private Boolean withMilk;
    private TypeMilk typeMilk;


    //ENUM TO SIZES, BECAUSE ALWAYS ARE GOING TO BE THE SAME FOR BEVERAGE.
    public enum Size {
        SMALL, MEDIUM, LARGE;
    }

    public enum TypeMilk{
        WHOLE, LIGHT, SOJA
    }


    public String getNameBeverage() { return nameBeverage; }
    public void setNameBeverage(String nameBeverage) {

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

        }
    }



    public Size getSizeBeverage() { return sizeBeverage; }
    public void setSizeBeverage(Size sizeBeverage) {

        switch (sizeBeverage){
            case SMALL:
                this.sizeBeverage= sizeBeverage;
                break;

            case MEDIUM:
                this.sizeBeverage= sizeBeverage;
                break;

            case LARGE:
                this.sizeBeverage= sizeBeverage;
                break;

            default:
                System.out.println("Sorry, this size is unavailable.");
        }
    }




    public Double getPriceBeverage() { return priceBeverage; }
    public void setPriceBeverage(Double priceBeverage) { this.priceBeverage= priceBeverage; }


    public Boolean getWithMilk() { return withMilk;  }
    public void setWithMilk(Boolean withMilk) { this.withMilk = withMilk; }

    public TypeMilk getTypeMilk() { return typeMilk; }
    public void setTypeMilk(TypeMilk typeMilk) {
        switch (typeMilk){
            case WHOLE:
                this.typeMilk= typeMilk;
                break;

            case LIGHT:
                this.typeMilk= typeMilk;
                break;

            case SOJA:
                this.typeMilk= typeMilk;
                break;
        }
    }




    @Override
    public String toString(){
        return "Name: " + nameBeverage + "\nSize: " + sizeBeverage + "\nPriceSize: " + priceBeverage;
    }



    public Beverage(){}

    public Beverage(String nameBeverage, Size sizeBeverage, Boolean withMilk, TypeMilk typeMilk, Double priceBeverage  ){
        this.nameBeverage= nameBeverage;
        this.sizeBeverage= sizeBeverage;
        this.withMilk= withMilk;
        this.typeMilk= typeMilk;
        this.priceBeverage= priceBeverage;
    }
}
