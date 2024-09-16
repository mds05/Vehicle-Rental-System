import java.util.Scanner;

public class RentalAgency {
        public static void main(String[] args) {
                String[] bikeList={"Honda CB300F","Suzuki GSX-8S","Royal Enfield Hunter 350"};
                String[] carList={"Tesla","Audi","Toyota","Mercedes"};
                Scanner sc = new Scanner(System.in);
                System.out.println("Do you need a Bike or Car?");
                String ans1 = sc.next();
                CaseInsensitive validChecker=new CaseInsensitive();
            
                Vehicle vehicle;
               
                if (validChecker.caseInsensitive(ans1).equals("Bike")) {
                        vehicle = new Bike();
                        System.out.println("Bikes Available:");
                        for(int i=0;i<bikeList.length;i++){
                                
                                System.out.println(bikeList[i]);
                        }
                } else if (validChecker.caseInsensitive(ans1).equals("Car")) {
                        vehicle = new Car();
                        System.out.println("Cars Available:");
                        for(int i=0;i<carList.length;i++){
                        
                        System.out.println(carList[i]);
                        }
                } else {
                        return;
                }

                System.out.println("Input the company name of the vehicle you need:");
                String ans2 = validChecker.caseInsensitive(sc.next());
               
                System.out.println("Input the model name of the vehicle you need:");
                String ans3 = validChecker.caseInsensitive(sc.next());
                vehicle.setRegNo(1000);
                vehicle.setModelName(ans3);
                vehicle.setCompanyName(ans2);
                System.out.println("For how many days?");
                int days = validChecker.nonNegative(sc.nextInt());
                vehicle.cost(days);

                System.out.println("What's your age?");
                int age = validChecker.nonNegative(sc.nextInt());
                System.out.println("What's your name? ");
                sc.nextLine();
                String name =validChecker.caseInsensitive(sc.nextLine());
                System.out.println("Where do you live? ");
                String address =validChecker.caseInsensitive(sc.nextLine());
                System.out.println("What's your phone number? ");
                int number =validChecker.nonNegative(sc.nextInt());
                sc.nextLine();
                System.out.println("Your email address?");
                String email =sc.nextLine();
                Customer customer = new Customer(age, name, address, number, email);
                Rental rental = new Rental(vehicle, customer, days);
                // CreditCardPayment c = new CreditCardPayment(rental);
                // c.getPaymentDetails();
                System.out.println("You need to pay "+ vehicle.cost(days)+" tk for renting it for "+days);
                System.out.println("Do you want to pay now?");
                ans1=validChecker.caseInsensitive(sc.next());
                if(ans1.equals("Yes")){
                        System.out.println("Do you want to pay through cash or credit card? Press A for cash and B for credit card.");
                        char paymentOption=sc.next().charAt(0);
                        CashPayment payment1;
                        CreditCardPayment payment2;

                        if(paymentOption=='A'|| paymentOption=='a'){
                                 payment1=new CashPayment(rental);
                                 payment1.processPayment();
                                 payment1.getPaymentDetails();

                        }
                        else if(paymentOption=='B'||paymentOption=='b')
                        {
                                payment2=new CreditCardPayment(rental);
                                payment2.processPayment();
                                payment2.getPaymentDetails();
                        }
                        else {
                                return;
                        }  
                       
                }
                else if(ans1.equals("No")){
                        System.out.println("Please pay as soon as possible!");

                }
               
               
                

        }

}