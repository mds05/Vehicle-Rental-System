public class CashPayment extends Payment{
    private Rental rental;
    public CashPayment(Rental rental){
        this.rental=rental;
    }
    void processPayment(){
        if(rental.getPaymentStatus()==false){
            rental.paid();
        System.out.println("Thank you for the payment!");
        }
        else{
            System.out.println("Payment is already complete.");
        }
    }
    void getPaymentDetails(){
        Customer customer=rental.getCustomer();
        System.out.println("Name: "+customer.getName());
        System.out.println("Age: "+customer.getAge());
        System.out.println("Address: "+customer.getAddress());
        System.out.println("Phone No.: "+customer.getphoneNo());
        System.out.println("Email: "+customer.getEmail());
        System.out.println("Rental Id: "+rental.getRentalId());
        System.out.println("Vehicle: "+rental.getRentalId());
        System.out.println("Payment status: "+rental.getPaymentStatus());


    }
}


    
