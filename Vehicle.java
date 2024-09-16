public class Vehicle{
    private int regNo;
    private String model;
    private String company;
    private boolean ase=true;
    private int rentalPeriod;
    private int rentalCost;
    

    public void changeavailability(boolean r){
        this.ase=r;
    }
    public boolean getavailability(){
       return this.ase;
    }
public void setRegNo(int r){
    this.regNo=r;
}
public int getRegNo(){
   return this.regNo;
}

public void setModelName(String model){
    this.model=model;
}
public String getModelName(){
   return this.model;
} 
public void setCompanyName(String c){
    this.company=c;
}
public String getCompanyName(){
   return this.company;
}
public int cost(int rentalPeriod){
    this.rentalCost=rentalPeriod*2000;
    return this.rentalCost;
}

}