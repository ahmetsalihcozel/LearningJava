package Interfaces;

public class CustomerManager {

    ICustomerDal customerDal;
    
    public void add() {

        customerDal.Add();
    }

}
