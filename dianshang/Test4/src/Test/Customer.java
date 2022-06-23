package Test;

public class Customer extends Users{
    public Customer() {
    }

    public Customer(String name, String password, String address) {
        super(name, password, address);
    }

    public void chart(String saler_name){
        System.out.println("chart with "+saler_name);
    }

}
