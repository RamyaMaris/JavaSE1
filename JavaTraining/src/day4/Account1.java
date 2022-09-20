
 

public class Account1 {
    
    //Define the properties of the class @ the class level - "Global"
    long accNo;             // 12-digit long number representing accNumber
    String accHolderName;   // name of acc holder
    double accBalance;      // balance of account
    String accType;         // savings, checking, fixedDep, loans...
    boolean isActive;       // active or dormant
    static long bankFaxNo = 676789873L;
    static String bankEmail = "custcar@dbs.com.sg";
    
    public static void main(String[] args) {
        
        int x =99;
        String s = "Hello";
        int [] iArray = new int[10]; 
        // created two objects for the class -> bgAcc, jlAcc
        Account1 prAcc = new Account1();
        System.out.println("Account Object   ::" +prAcc);
        Account1 bgAcc = new Account1();
        System.out.println("Account Object   ::" +bgAcc);
        
        
        prAcc.accNo = 12341234123L;
        prAcc.accHolderName = "Ramya";
        prAcc.accBalance = 240.90;
        prAcc.accType = "Savings";
        prAcc.isActive = true;
        
        System.out.println("Account No       ::" +prAcc.accNo);
        System.out.println("Holder Name      ::" +prAcc.accHolderName);
        System.out.println("Type             ::" +prAcc.accType);
        System.out.println("Is Active        ::" +prAcc.isActive);
        
        System.out.println("-----------------------------------");
        
        bgAcc.accNo = 4234133334123L;
        bgAcc.accHolderName = "Brinda";
        bgAcc.accBalance = 240.90;
        bgAcc.accType = "Current";
        bgAcc.isActive = true;
        
        System.out.println("Account No       ::" +bgAcc.accNo);
        System.out.println("Holder Name      ::" +bgAcc.accHolderName);
        System.out.println("Type             ::" +bgAcc.accType);
        System.out.println("Is Active        ::" +bgAcc.isActive);
        
        
    }
    
}
