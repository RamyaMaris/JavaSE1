package day4;

public class Customer_V1 {

    public Customer_V1() {

    }

    public void setCustId(int custId) {
        if (custId > 0) {
            this.custId = custId;
        } else {
            custId = -1; // -1 is indicating an error 
        }
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCreditApproved(double creditApproved) {
        this.creditApproved = creditApproved;
    }

    public static void main(String[] args) {
        Customer_V1 c1 = new Customer_V1(10, "Alpha", 100);
        Customer_V1 c2 = new Customer_V1();
        c2.setCustId(18);
        c2.setCustName("Beta");
        c2.setCreditApproved(175);
        Customer_V1 c3 = new Customer_V1(30, "Gamma");
    }

    // non-static variables         basic (min) validation
    int custId;                 // +ve number
    String custName;            // empty 
    double creditApproved;      // +ve value 

    public Customer_V1(int custId, String custName) {
        this.setCustId(custId);
        this.setCustName(custName);
        this.setCreditApproved(200);
    }

    // i'm mimicking the default constructor, 
// a constructor helps initialize your Object
    public Customer_V1(int custId, String custName, double creditApproved) {
        this.setCustId(custId);
        this.setCustName(custName);
        this.setCreditApproved(creditApproved);
    }
}
