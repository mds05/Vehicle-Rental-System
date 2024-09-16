public class CreditCardPayment extends Payment{
    private Rental rental;
    public CreditCardPayment(Rental rental){
        this.rental=rental;
    }
    public void processPayment(){
        if(rental.getPaymentStatus()==false){
            rental.paid();
        System.out.println("Thank you for the payment!");
        }
        else{
            System.out.println("Payment is already complete.");
        }
    }
    public void getPaymentDetails(){
        Customer customer=rental.getCustomer();
        System.out.println("Name: "+customer.getName());
        System.out.println("Age: "+customer.getAge());
        System.out.println("Address: "+customer.getAddress());
        System.out.println("Phone No.: "+customer.getphoneNo());
        System.out.println("Email: "+customer.getEmail());
        System.out.println("Rental Id: "+rental.getRentalId());
        System.out.println("Payment status: "+rental.getPaymentStatus());


    }
}


    
