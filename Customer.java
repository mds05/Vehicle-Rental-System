public class Customer{
    private int age;
    private String name;
    private String address;
    private int phoneNo;
    public String email;

    public Customer(int age,String name,String address,int phoneNo,String email){
        this.age=age;
        this.name=name;
        this.address=address;
        this.phoneNo= phoneNo;
        this.email=email;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
       return this.name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
       return this.age;
    }

    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
       return this.address;
    }

    public void setphoneNo(int phoneNo){
        this.phoneNo=phoneNo;
    }
    public int getphoneNo(){
       return this.phoneNo;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
       return this.email;
    }

    
}