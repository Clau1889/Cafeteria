public class Beverage{
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

        if(nameBeverage.toLowerCase().equals("coffee") || nameBeverage.toLowerCase().equals("tea") || nameBeverage.toLowerCase().equals("frapuccino")){

            this.nameBeverage= nameBeverage;
        }

    }



    public Size getSizeBeverage() { return sizeBeverage; }
    public void setSizeBeverage(Size sizeBeverage) {
        if(sizeBeverage.equals("SMALL") || sizeBeverage.equals("MEDIUM") || sizeBeverage.equals("LARGE")){
            this.sizeBeverage= sizeBeverage;
        } else{
            System.out.println("Sorry, this size is unavailable.");
        }

    }




    public Double getPriceBeverage() { return priceBeverage; }
    public void setPriceBeverage(Double priceBeverage) { this.priceBeverage= priceBeverage; }


    public Boolean getWithMilk() { return withMilk;  }
    public void setWithMilk(Boolean withMilk) { this.withMilk = withMilk; }

    public TypeMilk getTypeMilk() { return typeMilk; }
    public void setTypeMilk(TypeMilk typeMilk) {
        if(typeMilk.equals("WHOLE") || typeMilk.equals("LIGHT") || typeMilk.equals("SOJA")){
            this.typeMilk= typeMilk;
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
