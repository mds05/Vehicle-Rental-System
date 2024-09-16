public class Car extends Vehicle{
    private int numDoors;
    private int engineCap;
    private int rentalPeriod;
    private int rentalCost;

    public void setnumDoors(int d){
        this.numDoors=d;
    }
    public int getnumDoors(){
       return this.numDoors;
    }

    public void setEngineCap(int e){
        this.engineCap=e;
    }
    public int getEngineCap(){
       return this.engineCap;
    }
    public int cost(int rentalPeriod){
        this.rentalCost=rentalPeriod*1000;
        return  this.rentalCost;
    }
}
