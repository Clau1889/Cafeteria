public class Beverage {
    private String nameBeverage;
    private Double priceBeverage;
    private Boolean addCream;


    public String getNameBeverage() { return nameBeverage; }
    public void setNameBeverage(String nameBeverage) { this.nameBeverage = nameBeverage; }

    public Double getPriceBeverage() { return priceBeverage; }
    public void setPriceBeverage(Double priceBeverage) { this.priceBeverage = priceBeverage; }

    public Boolean getAddCream() { return addCream; }
    public void setAddCream(Boolean addCream) { this.addCream = addCream; }


    //ENUM TO SIZES, BECAUSE ALWAYS ARE GOING TO BE THE SAME FOR BEVERAGE.
    enum Size {
        SMALL, MEDIUM, LARGE;
    }


    @Override
    public String toString() {
        System.out.println("");

        return super.toString();
    }
}
