import java.util.Random;
public class Rental implements Rentable{
    private Vehicle vehicle;
    private  Customer customer;
    private int rentalId;   
    private boolean paymentStatus=false;
    private int rentalPeriod;
    // private double rentalCost;
   
    

   

    public Rental(Vehicle vehicle,Customer customer,int rentalPeriod){
        Random rd=new Random();
        this.rentalId=rd.nextInt(10000);
        this.vehicle=vehicle;
        this.customer=customer;
        this.rentalPeriod=rentalPeriod;
    }
    public int getRentalId(){
        return this.rentalId;
    }

    public void paid(){
        this.paymentStatus=true;
     }
     public boolean getPaymentStatus(){
        return this.paymentStatus;
    }

    public int getRentalPeriod(){
        return rentalPeriod;

    }
    public Customer getCustomer(){
        return this.customer;
    }
    public void rent(){
        this.vehicle.changeavailability(false);

    }
    public void returnVehicle(){
        this.vehicle.changeavailability(true);
    }
    // public void cost(int rentalPeriod){
    //     this.rentalCost=rentalPeriod*1000;
    // }

    
    }

    



