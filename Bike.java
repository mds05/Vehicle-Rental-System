public class Bike extends Vehicle{
    private int engineCap;
    private int rentalPeriod;
    private int rentalCost;
    public void setEngineCap(int e){
        this.engineCap=e;
    }
    public int getEngineCap(){
       return this.engineCap;
    }
    public int cost(int rentalPeriod){
        this.rentalCost=rentalPeriod*500;
        return this.rentalCost;
    }

}
