package day4;

public class Customer {

    //non-static variables
    
    int custId;
    String custName;
    double creditApproved;

    // a constructor helps initialize your Object
    public Customer(int custId, String custName, double creditApproved) {
        if (custId > 0) {
            this.custId = custId;
        }
        if (custName.length() > 0) {
            this.custName = custName;
        }
        this.creditApproved = creditApproved;
    } // a constructor which does nothing

    //default Constructor
    public Customer() {

    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCreditApproved(double creditApproved) {
        this.creditApproved = creditApproved;
    }

    public Customer(int custId, String custName) {
        this.custId = custId;
        this.custName = custName;
        this.creditApproved = 200;
    }

    public static void main(String[] args) {
        Customer c1 = new Customer(10, "Alpha", 100);
        Customer c2 = new Customer();
        c2.setCustId(10);
        c2.setCustName("Beta");
        c2.setCreditApproved(143);
        Customer c3 = new Customer(30, "Gamma");
    }
}
